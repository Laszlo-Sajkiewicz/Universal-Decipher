package substitution;

/**
 *
 */
public class Vigenere extends PolyAlphabetic{
    /*
    * This algorythm need an key of encryption (key)
    *The conversion included spaces and special character
    */
    public Vigenere(String text, String key) {
        super(text);
        super.setKey(key);
    }
    
    public String cipher(String text) {
        // encrypt ascii string
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c + this.getKey().charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % this.getKey().length();
        }
        return res;
    }
 
    public String decipher(String text) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c - this.getKey().charAt(j) + 26) % 26 + 'A');
            j = ++j % this.getKey().length();
        }
        return res;
    }
}