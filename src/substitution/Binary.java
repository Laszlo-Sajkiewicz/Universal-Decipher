/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package substitution;

/**
 *
 * @author sajkiewl
 */
public class Binary {
    public void code(String asciiValue) {
        char[] chars = asciiValue.toCharArray();
        StringBuilder bin = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            bin.append(Integer.toBinaryString((int) chars[i]));
        }
        String code = bin.toString();
        System.out.print(code);
    }

    public void decode(String binValue) {
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < binValue.length(); i += 2) {
            String str = binValue.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }
        String ph = output.toString();
        System.out.print(ph);
    }  
}
