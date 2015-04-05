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
    }

    /**
     * This method allow you to know the frequency
     * of each 'letter' of your text
     */
    public void frequencyAnalysis(){
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
        Iterator it = frequency.keySet().iterator();
        while (it.hasNext()){
           Object key = it.next();
           Object value = frequency.get(key);
           System.out.println(key + " : " + value);
        }
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
