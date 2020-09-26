package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PetyaAndJava {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BigInteger big = new BigInteger(b.readLine());
        if (big.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && big.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
            System.out.println("byte");
        } else if (big.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && big.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
            System.out.println("short");
        } else if (big.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && big.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
            System.out.println("int");
        } else if (big.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && big.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
            System.out.println("long");
        } else {
            System.out.println("BigInteger");
        }
    }
}