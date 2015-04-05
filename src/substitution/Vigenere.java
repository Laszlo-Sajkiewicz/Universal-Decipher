package substitution;

/**
 *
 */
public class Vigenere extends PolyAlphabetic{

    public Vigenere(String text) {
        super(text);
    }
    
    /**
     * 
     * @param key the key you use to cipher the text
     * @return ciphertext
     */
    public String cipher(String key){
        this.setKey(key);
        this.setCipherText("");
        return this.getCipherText();
    }
    
}
