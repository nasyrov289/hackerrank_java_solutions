package EasyLevel;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Static_Initializer_Block {

    static Scanner input = new Scanner(System.in);
    static int B = input.nextInt();
    static int H = input.nextInt();
    static boolean flag;

    static {
        if (B > 0 & H > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
    }
}
