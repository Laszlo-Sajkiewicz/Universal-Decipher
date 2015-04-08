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


   /* public void code(int n, String sIn) {
        /* 
       
         */

      /*  char[] charSIn = sIn.toCharArray();
        char[] charSOut = new char[charSIn.length];
        int pos1, pos2;
        for (int i = 0; i < charSIn.length; i++) {
            pos1 = posChar(charSIn[i], tab);
            pos2 = newPos(pos1, n);
            if (pos2 == -1) {
                charSOut[i] = ' ';
            } // if -1, is not a letter so we put a space    
            else {
                charSOut[i] = tab[pos2];
            }
        }
        char[] res = charSOut; // we make a string with char[]
        System.out.print(res);
    }

    public void decode(int n, String sIn) {
     

        /*char[] charSIn = sIn.toCharArray();
        char[] charSOut = new char[charSIn.length];
        int pos1, pos2;
        for (int i = 0; i < charSIn.length; i++) {
            pos1 = posChar(charSIn[i], tab);
            pos2 = newPos(pos1, -n);
            if (pos2 == -1) {
                charSOut[i] = ' '; // if -1, is not a letter so we put a space    
            } else {
                charSOut[i] = tab[pos2];
            }
        }
        char[] res = (charSOut); // we make a string with char[]
        System.out.print(res);
    }

    private static int posChar(char c, char[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == c) {
                return i;
            }
        }
        return -1;

    }

    // Donne la nouvelle position dans l'alphabet en fonction de n  
    private static int newPos(int pos, int n) {
        int pos2 = pos;
        if (pos <= -1) { // if -1, the character was not found
            pos2 = -1;
        } else {
            int i = 0;
            while (i < abs(n)) {
                if (n < 0) {
                    if (pos2 - 1 == -1) {
                        pos2 = 25;
                    } else {
                        pos2--;
                    }
                } else {
                    if (pos2 + 1 >= 25) {
                        pos2 = 0;
                    } else {
                        pos2++;
                    }
                }
                i++;
            }
        }
        return pos2;
    }

    // 
    public static int abs(int a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }*/
   