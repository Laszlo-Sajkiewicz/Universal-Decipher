package substitution;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 */
public class MonoAlphabetic extends Substitution {

    private ArrayList<String> alphabet;
    
    /**
     * 
     * @param text 
     */
    public MonoAlphabetic(String text) {
        super(text);
        this.setAlphabet(new ArrayList<String>());
    }

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
