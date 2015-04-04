package substitution;

/**
 *
 */
public class Shift extends MonoAlphabetic{

    public Shift(String text) {
        super(text);
        for (char letter : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
            this.getAlphabet().add(String.valueOf(letter));
        }
    }
    
    /**
     *
     * @param shift
     * @return
     */
    public String cipher(int shift){
        this.setCipherText("");
        for (char letter : this.getText().toCharArray()){
            if (letter >= 'a' && letter <= 'z'){
                int index = (int) letter - 'a';
                int newIndex = (index + shift) % 26;
                char newLetter = this.getAlphabet().get(newIndex).charAt(0);
                this.setCipherText(this.getCipherText() + newLetter);
            } else {
                this.setCipherText(this.getCipherText() + letter);
            }
        }
        return this.getCipherText();
    }
    
    public String decipher(int shift){
        this.setDecipherText(this.cipher(26 - shift));
        return this.getDecipherText();
    }
    
    /**
     * 
     * @param text the text you input (not case sensitive)
     */
    @Override
    protected void setText(String text){
        super.setText(text.toLowerCase());
    }
    
}
