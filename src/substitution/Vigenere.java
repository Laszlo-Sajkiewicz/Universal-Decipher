package substitution;

/**
 *
 */
public class Vigenere extends PolyAlphabetic{

    public Vigenere(String text) {
        super(text);
    }
    
    public String cipher(String key){
        this.setKey(key);
        this.setCipherText("");
        return this.getCipherText();
    }
    
}
