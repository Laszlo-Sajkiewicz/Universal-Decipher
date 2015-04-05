package substitution;

/**
 * This class allow to cipher/decipher texts with
 * poly-alphabetic's algorithms.
 */
public class PolyAlphabetic extends Substitution {

    private String key;
    
    /**
     * 
     * @param text the text you want to analyze with
     *             poly-alphabetic's algorithms
     */
    public PolyAlphabetic(String text) {
        super(text);
        this.setKey("Undefined");
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    protected void setKey(String key) {
        this.key = key;
    }
    
}
