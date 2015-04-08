/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package substitution;

/**
 *
 * @author doctor
 */
public class Hexadecimal {
    
  public void code(String asciiValue) {
        char[] chars = asciiValue.toCharArray();
        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            hex.append(Integer.toHexString((int) chars[i]));
        }
        String code = hex.toString();
        System.out.print(code);
    }

    public void decode(String hexValue) {
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < hexValue.length(); i += 2) {
            String str = hexValue.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }
        String ph = output.toString();
        System.out.print(ph);
    }  
}
