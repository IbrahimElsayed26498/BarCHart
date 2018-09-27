/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barchart;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class BarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numebrs between 1 to 30 : ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        for(int i=0;i<n1;i++)
            System.out.print("*");
        System.out.println();
        for(int i=0;i<n2;i++)
            System.out.print("*");
        System.out.println();
        for(int i=0;i<n3;i++)
            System.out.print("*");
        System.out.println();
        for(int i=0;i<n4;i++)
            System.out.print("*");
        System.out.println();
        for(int i=0;i<n5;i++)
            System.out.print("*");
        System.out.println();
    }
    
}
