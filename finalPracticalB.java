import java.lang.*;
import java.io.*;
import java.util.*;

class finalPracticalB {
    public static void main(String[] args)
    {
        String input1 = "Prithvi Raj Karki";
        String input2 = " is here !";
 
        StringBuilder strg = new StringBuilder();
 
        // append a string into StringBuilder input1
        strg.append(input1);
 
        // reverse StringBuilder input1
        strg = strg.reverse();
 
        // print reversed String
        System.out.println(strg);
        
        // print concatination of two strings
        String conc = input1.concat(input2);
        System.out.println(conc);
    }
}
