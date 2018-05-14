/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairsstringsdifferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Benjamin Chinwe
 */
public class PairsStringsDifferences 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String set1, set2; // variable declaration
        int count = 0;
        List<Character> diff = new ArrayList<>();
        Scanner input = new Scanner(System.in); //create Scanner object

        try {
            count = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        while (0 < count) {

            //System.out.println("Enter first string set:");
            set1 = input.nextLine();

            //System.out.println("Enter second string set:");
            set2 = input.nextLine();

            // itreate over the letters in set1
            for (int i = 0; i < set1.length(); i++) {
                // itreate over the letters in set2

                //for (int j = 0; j < set2.length(); j++) {
                char c1 = Character.toLowerCase(set1.charAt(i));
                char c2 = Character.toLowerCase(set2.charAt(i));
                // compare char in the two strings
                if (c1 == c2) {
                    diff.add('.');
                } else {
                    diff.add('*');
                }

                //}
            }
            System.out.println(set1);
            System.out.println(set2);
            for (int i = 0; i < diff.size(); i++) {
                System.out.print(diff.get(i));
            }
            count--;
            System.out.println();
            System.out.println();
            diff.clear();
        }
    }

}
