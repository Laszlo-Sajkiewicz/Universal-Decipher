package substitution;

/**
 * This class allow to cipher/decipher texts with
 * subsitution's algorithms.
 */
public class Substitution {
    
    private String text;
    private String cipherText;
    private String decipherText;
    
    public Substitution(String text){
        this.setText(text);
        this.setCipherText("Undefined");
        this.setDecipherText("Undefined");
    }
    
    /**
     * 
     * @return the ciphertext
     */
    public String cipher(){
        System.out.println("Cipher method not implemented yet");
        return null;
    }
    
    /**
     * 
     * @return the deciphertext
     */
    public String decipher(){
        System.out.println("Decipher method not implemented yet");
        return null;
    }
    
    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    protected void setText(String text) {
        this.text = text;
    }

    /**
     * @return the cipherText
     */
    public String getCipherText() {
        return cipherText;
    }

    /**
     * @param cipherText the cipherText to set
     */
    protected void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    /**
     * @return the decipherText
     */
    public String getDecipherText() {
        return decipherText;
    }

    /**
     * @param decipherText the decipherText to set
     */
    protected void setDecipherText(String decipherText) {
        this.decipherText = decipherText;
    }
    
    @Override
    public String toString(){
        return "Text input : " + this.getText() + "\n"
                + "Ciphertext : " + this.getCipherText() + "\n"
                + "Deciphertext : " + this.getDecipherText();
    }
    
}
