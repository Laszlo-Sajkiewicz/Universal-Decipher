package substitution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * This class allow to cipher/decipher texts with
 * mono-alphabetic's algorithms.
 */
public class MonoAlphabetic extends Substitution {

    private ArrayList<String> alphabet;
    
    /**
     * 
     * @param text the text you want to analyze with
     *             mono-alphabetic's algorithms
     */
    public MonoAlphabetic(String text) {
        super(text);
        this.setAlphabet(new ArrayList<String>());
        for (char letter : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
            this.getAlphabet().add(String.valueOf(letter));
        }
    }

    /**
     * This method allow you to know the frequency
     * of each 'letter' of your text.
     * @return the frequency of each letter of the alphabet
     */
    public String frequencyAnalysis(){
        String message = "Frequency analysis : \n";
        HashMap<String, Integer> frequency = new HashMap<String, Integer>();
        for (char character : this.getText().toCharArray()){
            String ch = String.valueOf(character);
            if (frequency.containsKey(ch)){
                int newValue = frequency.get(ch) + 1;
                frequency.remove(ch);
                frequency.put(ch, newValue);
            } else{
                frequency.put(ch, 1);
            }
        }
        for (String character : this.getAlphabet()){
            if (frequency.containsKey(character)){
                message += character + " : " + (float) frequency.get(character) / (float) this.getText().length() * 100.0f + " %\n";
            } 
        }
        return message;
    }
    
    /**
     * @return the alphabet
     */
    public ArrayList<String> getAlphabet() {
        return alphabet;
    }

    /**
     * @param alphabet the alphabet to set
     */
    protected void setAlphabet(ArrayList<String> alphabet) {
        this.alphabet = alphabet;
    }
    
    /**
     * 
     * @param text the text you input (not case sensitive)
     */
    @Override
    protected void setText(String text){
        super.setText(text.toLowerCase());
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + this.frequencyAnalysis();
    }
    
}
