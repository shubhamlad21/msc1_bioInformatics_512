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
public class corona_java {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        StringBuilder sb;
        try ( // TODO code application logic here
        //  File file = new File("");
                Scanner in = new Scanner(new FileReader("D:\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\corona.txt"))) {
            sb = new StringBuilder();
            while(in.hasNext()) {
                sb.append(in.next());
            }       }
        String outString = sb.toString();
        int a = 0;
                int c=0;
                int t=0;
                int g=0;
for (int i = 0; i < outString.length(); i++) {
  if (outString.charAt(i) == 'A' ) {
    a++;
 
  }
  if (outString.charAt(i) == 'C' ) {
    c++;
 
  }
  if (outString.charAt(i) == 'T' ) {
    t++;
 
  }
}  
System.out.println("A is "+a);
        System.out.println("C is "+c);
        System.out.println("T is "+t);

    }
}
