/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String w = "something";
        while(!w.matches("[0-9]+")) {
            System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
            Scanner s1 = new Scanner(System.in);
            w = s1.nextLine();
        }
        System.out.println("How many ounces of alcohol did you have? ");
        Scanner s2 = new Scanner(System.in);
        
        String one = "1";
        String two = "2";
        if(w == one){

        }
    }
}
