/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
/**
 *
 * @author ryan_
 */
public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        System.out.printf("Sum is %d%n", sum);
    }
}
