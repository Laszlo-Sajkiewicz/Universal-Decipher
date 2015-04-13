package substitution;

import java.util.Scanner;

public class Hexadecimal extends MonoAlphabetic {
    /*
     * This programme codes ascii string or decodes hexa strings
     * The conversion included spaces and special character
     */

    public Hexadecimal(String text) {
        super(text);
    }

    public static  void code(String asciiValue) {
        char[] chars = asciiValue.toCharArray(); // String becomes an array
        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            hex.append(Integer.toHexString((int) chars[i])); // convert ascii -> hexadecimal
        }
        String code = hex.toString(); // code : String ascii converted in hexadecimal
        System.out.print(code); // show (string)code
    }

    public static  void decode(String hexValue) {
        //Inverse operation
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < hexValue.length(); i += 2) {
            String str = hexValue.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }
        String ph = output.toString();
        System.out.print(ph);
    }

    public static void hexadecimal() {
        System.out.println("To code or decode ?");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        switch (ans) {
            case "code": {
                System.out.println(" Enter your text");
                String text = sc.nextLine();
                code(text);

                break;
            }
            case "decode": {
                System.out.println(" Enter your text");
                String text = sc.nextLine();
                decode(text);
                break;
            }
        }
    }
}
