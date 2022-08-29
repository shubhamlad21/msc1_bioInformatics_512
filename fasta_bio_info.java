/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Shubham Lad
 */
public class fasta_bio_info {
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        StringBuilder sb;
        try (
        Scanner in = new Scanner(new FileReader("D:\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\fasta_bio_info.txt")))
        {
            sb = new StringBuilder();
            while(in.hasNext()) {
                sb.append(in.next());
            }
        }
        String outString = sb.toString();
        int score_a = 0;
        int score_c=0;
        int score_t=0;
        int score_g=0;
        for (int i = 0; i < outString.length(); i++) {
            if (outString.charAt(i) == 'A' ) {
                score_a++;
            }
            if (outString.charAt(i) == 'C' ) {
                score_c++;
            }
            if (outString.charAt(i) == 'T' ) {
                score_t++;
            }
            if (outString.charAt(i) == 'G' ) {
                score_g++;
            }
        }
        System.out.println("Score of A is "+score_a);
        System.out.println("Score of C is "+score_c);
        System.out.println("Score of T is "+score_t);
        System.out.println("Score of G is "+score_g);        
    }
}