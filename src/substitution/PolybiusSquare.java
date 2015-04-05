package substitution;

import java.util.ArrayList;

/**
 * This class allow to cipher/decipher texts with
 * the Polybius square algorithm.
 */
public class PolybiusSquare extends MonoAlphabetic {

    /**
     * 
     * @param text 
     */
    public PolybiusSquare(String text) {
        super(text);
        this.setAlphabet(new ArrayList<String>());
        for (Integer line = 1; line <= 5; line++){
            for (Integer column = 1; column <= 5; column++){ 
                this.getAlphabet().add(line + "" + column);
                if (line == 2 && column == 4){
                    this.getAlphabet().add(line + "" + column);                   
                }
            }
        }
    }
    
    /**
     *
     * @return the ciphertext
     */
    @Override
    public String cipher(){
        this.setCipherText("");
        for (char letter : this.getText().toCharArray()){
            int index = (int) letter - 'a';
            if (index >= 0 && index <= 25){
                this.setCipherText(this.getCipherText() + this.getAlphabet().get(index));
            } else{
                this.setCipherText(this.getCipherText() + letter);
            }
        }
        return this.getCipherText();
    }
    
    /**
     *
     * @return the deciphertext
     */
    @Override
    public String decipher(){
        this.setDecipherText("");
        int index = 0;
        while (index + 2 <= this.getText().length()){
            char letter = this.getText().charAt(index);
            if (letter >= '1' & letter <= '9'){
                if (index + 2 <= this.getText().length()){
                    char newLetter = (char) (this.getAlphabet().indexOf(this.getText().substring(index, index + 2)) + (int) 'a');
                    this.setDecipherText(this.getDecipherText() + newLetter);
                    index++;
                }
            } else{
                this.setDecipherText(this.getDecipherText() + letter);
            }
            index++;
        }
        return this.getDecipherText();
    }
    
    
}
