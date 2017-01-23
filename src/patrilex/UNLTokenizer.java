// Wiltrud Kessler, May - December 2008
// Project PATRILEX
// This file is encoded in UTF-8


package patrilex;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.Token;
import java.io.IOException;

import java.io.Reader;

/**
 */
public final class UNLTokenizer extends Tokenizer {
   


   
  /** Construct a new LowerCaseTokenizer. */
  public UNLTokenizer(Reader in) {
    super(in);
  }

  

  /** Called on each token character to normalize it before it is added to the
   * token.  The default implementation does nothing.  Subclasses may use this
   * to, e.g., lowercase tokens. */
  /** Collects only characters which satisfy
   * {@link Character#isLetter(char)}.*/
  protected char normalize(char c) {
    return Character.toLowerCase(c);
  }
  


  /** Collects only characters which satisfy
   * {@link Character#isLetter(char)}.*/
  protected boolean isTokenChar(char c) {
    //~ return (c != ')');
    return !Character.isWhitespace(c);
  }

  protected boolean isEndChar(char c) {
    return (c != ')');
  }
  
  
  // Extend directly Tokenizer
  
    private int offset = 0, bufferIndex = 0, dataLen = 0;
  private static final int MAX_WORD_LEN = 255;
  private static final int IO_BUFFER_SIZE = 4096;
  private final char[] ioBuffer = new char[IO_BUFFER_SIZE];
   
  
  public final Token next(Token token) throws IOException {
    token.clear();
    int length = 0;
    Boolean beginning = true;
    Boolean insert = true;
    Boolean whitespaceBefore = false;
    int start = bufferIndex;
    char[] buffer = token.termBuffer();
    while (true) {

      // read data from buffer
      if (bufferIndex >= dataLen) {
        offset += dataLen;
        dataLen = input.read(ioBuffer);
        if (dataLen == -1) {
          if (length > 0)
            break;
          else
            return null;
        }
        bufferIndex = 0;
      }

      final char c = ioBuffer[bufferIndex++];

      // if we are not at the end
      if (!isEndChar(c)) {               // if it's a token char
        insert = true;
      

        // at the beginning ignore whitespaces
        if (beginning && Character.isWhitespace(c)) {
          insert = false;
        }
        // ignore several whitespaces
        if (whitespaceBefore && Character.isWhitespace(c)) {
          insert = false;
        }

        // add a whitespace before opening bracket
        if (c == '(' && !whitespaceBefore) {
          if (length == 0)	// start of token
            start = offset + bufferIndex - 1;
          else if (length == buffer.length)
            buffer = token.resizeTermBuffer(1+length);

          buffer[length++] = ' '; // buffer it, normalized

          if (length == MAX_WORD_LEN)		   // buffer overflow!
            break;
          }
      } else if (length > 0)             // at non-Letter w/ chars
        break;                           // return 'em

      if (insert) {
        if (length == 0)			           // start of token
          start = offset + bufferIndex - 1;
        else if (length == buffer.length)
          buffer = token.resizeTermBuffer(1+length);

        buffer[length++] = normalize(c); // buffer it, normalized

        if (length == MAX_WORD_LEN)		   // buffer overflow!
          break;
      }
      
          if (Character.isWhitespace(c)) {
          whitespaceBefore = true;
        } else {
          whitespaceBefore = false;
        }

    }

    token.setTermLength(length);
    token.setStartOffset(start);
    token.setEndOffset(start+length);
    return token;
  }

  public void reset(Reader input) throws IOException {
    super.reset(input);
    bufferIndex = 0;
    offset = 0;
    dataLen = 0;
  }
  


  
}
