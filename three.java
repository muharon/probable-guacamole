/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.largestnumbers;

/**
 *
 * @author Admin
 */

import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner scanner;
        // Take marks of three  from user
        scanner = new Scanner(System.in);
        System.out.println("Enter marks of  Three subjects ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
 
        // Using if-else statement compare a, b and c
        if (a > b) {
            // compare a and c
            if (a > c)
                max = a;
            else
                max = c;
        } else {
            // compare b and c
            if (b > c)
                max = b;
            else
                max = c;
        }
        System.out.println("Largest mark : " + max);
    }
}

