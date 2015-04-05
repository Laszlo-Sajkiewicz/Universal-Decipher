package substitution;

import java.util.ArrayList;

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
    }

    /**
     * This method allow you to know the frequency
     * of each 'letter' of your text
     */
    public void frequencyAnalysis(){
        System.out.println("Not implemented yet");
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
    
}
