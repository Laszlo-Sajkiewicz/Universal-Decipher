package substitution;

public class Binary extends MonoAlphabetic {
    /*
    * This programm codes ascii strings or decodes binary strings
    * The conversion included spaces and special character
    */
    public Binary(String text) {
        super(text);
    }
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
