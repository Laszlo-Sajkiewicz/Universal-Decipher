/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substitution;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author sajkiewl
 */
public class RSA {

    private BigInteger n, d, e;
    private int bitlen = 1024; // bit lenght

    public RSA(BigInteger newn, BigInteger newe) {
        this.n = newn;
        this.e = newe;
    }

    public RSA(int bits) {
        bitlen = bits;
        SecureRandom r = new SecureRandom();// This class provides a cryptographically strong random number generator 
        BigInteger p = new BigInteger(bitlen / 2, 100, r);
        BigInteger q = new BigInteger(bitlen / 2, 100, r);
        n = p.multiply(q); // n = pq
        BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        e = new BigInteger("3");
        while (m.gcd(e).intValue() > 1) {
            e = e.add(new BigInteger("2"));
        }
        d = e.modInverse(m);
    }


    /*
     * I. ℤp={0,1,2,...,p−1}
     * II.∀x,y,z,k∈ℤ,x≡ymodz⟹x=k⋅z+y
     * III.x⋅x−1=1
     * IV. x∈ℤp,x−1∈ℤp⟺gcd(x,p)=1
     * V. p∈ℙ,ϕ(p)=p−1
     * VI. n=p⋅q
     * VII. ϕ(n)=(p−1)⋅(q−1)
     * IX. e⋅d=1modϕ(n)
     * X. F(m,k)=mkmodn
     *@sources : http://doctrina.org/How-RSA-Works-With-Examples.html
     */

    /**
     * Encrypt the given plaintext message.
     *
     * @param message
     * @return
     */
    public synchronized String encrypt(String message) {
        return (new BigInteger(message.getBytes())).modPow(e, n).toString(); // bigInt convert to string
    }

    /**
     * Encrypt the given plaintext message.
     *
     * @param message
     * @return
     */
    public synchronized BigInteger encrypt(BigInteger message) {
        return message.modPow(e, n); // modulus
    }

    /**
     * Decrypt the given ciphertext message.
     *
     * @param message
     * @return
     */
    public synchronized String decrypt(String message) {
        return new String((new BigInteger(message)).modPow(d, n).toByteArray());
    }

    /**
     * Decrypt the given ciphertext message.
     *
     * @param message
     * @return
     */
    public synchronized BigInteger decrypt(BigInteger message) {
        return message.modPow(d, n);
    }

    /**
     * Generate a new public and private key set.
     */
/*    public synchronized void generateKeys() {
        // key generating
        SecureRandom r = new SecureRandom();
        BigInteger p = new BigInteger(bitlen / 2, 100, r);
        BigInteger q = new BigInteger(bitlen / 2, 100, r);
        n = p.multiply(q);
        BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        e = new BigInteger("3");
        while (m.gcd(e).intValue() > 1) {
            e = e.add(new BigInteger("2"));
        }
        d = e.modInverse(m);
    }

    /**
     * Return the modulus.
     *
     * @return
     */
    public synchronized BigInteger getN() {
        return n;
    }

    /**
     * Return the public key.
     *
     * @return
     */
    public synchronized BigInteger getE() {
        return e;
    }

    /**
     * Trivial test program.
     *
     * @param args
     */
   /* public static void main(String[] args) {
        RSA rsa = new RSA(1024);
        System.out.println("Saisissez une phrase :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
       
        System.out.println("Plaintext: " + str);
        BigInteger plaintext = new BigInteger(str.getBytes());
        
        BigInteger ciphertext = rsa.encrypt(plaintext);
        System.out.println("Ciphertext: " + ciphertext);
        plaintext = rsa.decrypt(ciphertext);

        String text2 = new String(plaintext.toByteArray());
        System.out.println("Plaintext: " + text2);
    }*/
}
