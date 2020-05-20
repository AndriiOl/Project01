import com.sun.net.httpserver.Authenticator;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Firstclass {

    @Test
    public void test0001() {

        System.out.println("Super Cool Class");
        System.out.print("Super Cool Class+");
    }
    @Test
        public void test0002() {
        System.out.println("Life is good");
    }
    @Test
    public void test0003() {

        String name1 = new String("Good ");
        String name2 = "night";
        String name3 = name1 + name2;
        System.out.println(name3);
    }
    @Test
    public void test0004() {
        byte zero = 0;
        short a = 3;
        int b = 1;
        char d = ' ';
        float e = 2.0f;
        boolean f = true;
        String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
        System.out.println(output);
    }

    @Test
    public void test0005() {
        String a = "Wow";
        String b = a;
        String c = b + "!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success");

        }

    }

    @Test
    public void test0006 () {
            int[] numbers = {1, 2, 3};
            int length = numbers[2];
            char[] chars = new char[length];
            chars[numbers.length-1] = 'y';
            System.out.println("Done!");
        }
    }