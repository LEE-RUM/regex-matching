package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//uncomment for the a2 regex


public class Main {

    public static void main(String[] args) {
        // //starts with 1, ends with 0
        String reg = "1(1|0)*0";
        String string = "101";

        Pattern pt = Pattern.compile(reg);
        Matcher mt = pt.matcher(string);

        boolean output = mt.matches();
        System.out.println("The regular expression: "+ reg);
        System.out.println("The string: "+ string);
        System.out.println(output);


        // contains at least three ones
        // String reg = "(1|0)*1(1|0)*1(1|0)*1(1|0)*";
        // String string = "1100";

        // Pattern pt = Pattern.compile(reg);
        // Matcher mt = pt.matcher(string);

        // boolean output = mt.matches();
        // System.out.println("The regular expression: "+ reg);
        // System.out.println("The string: "+ string);
        // System.out.println(output);

    }
}
