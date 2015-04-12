package main;

import java.util.Scanner;
import substitution.Binary;
import substitution.Hexadecimal;
import substitution.PolybiusSquare;
import substitution.Shift;

/**
 *
 */
public class UniversalDecipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("*    Universal Decipher v0.1    *");
        System.out.println("*                               *");
        System.out.println("* 1 - Polybius square           *");
        System.out.println("* 2 - Shift                     *");
        System.out.println("* 3- Hexadecimal                *");
        System.out.println("* 4- Binary                *");
        System.out.println("* 5 - Quit                      *");
        System.out.println("*                               *");
        System.out.println("*********************************");
        System.out.println();
        System.out.print("Your choice : ");

        int choice = menu.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Please enter your text : ");
                String text = input.nextLine();
                PolybiusSquare polybiusSquare = new PolybiusSquare(text);
                polybiusSquare.decipher();
                polybiusSquare.cipher();
                System.out.println(polybiusSquare);
                break;
            case 2:
                System.out.print("Please enter your text : ");
                text = input.nextLine();
                Shift shift = new Shift(text);
                System.out.print("Please enter the shift : ");
                int nb = menu.nextInt();
                shift.decipher(nb);
                shift.cipher(nb);
                System.out.println(shift);
                break;
            case 3:
                System.out.print("Please enter your text : ");
                text = input.nextLine();
                Hexadecimal hex = new Hexadecimal(text);
                hex.code(text);
                hex.decode(text);
                break;
                case 4:
                System.out.print("Please enter your text : ");
                text = input.nextLine();
                Binary bin = new Binary(text);
                bin.code(text);
                bin.decode(text);
                break;
                
            default:
                break;
        }

    }
}
