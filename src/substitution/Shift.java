package substitution;

/**
 *
 */
public class Shift extends MonoAlphabetic{

    public Shift(String text) {
        super(text);
    }
    
    /**
     *
     * @param shift
     * @return
     */
    public String cipher(int shift){
        shift %= 26;
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
        shift %= 26;
        this.setDecipherText(this.cipher(26 - shift));
        return this.getDecipherText();
    }
    
}
