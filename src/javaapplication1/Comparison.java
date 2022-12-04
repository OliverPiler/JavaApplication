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
public class Comparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        if(number1 == number2){
            System.out.printf("%d == %d%n", number1, number2);
        }
        if(number1 != number2){
            System.out.printf("%d != %d%n", number1, number2);
        }
        if(number1 < number2){
            System.out.printf("%d < %d%n", number1, number2);
        }
        if(number1 > number2){
            System.out.printf("%d > %d%n", number1, number2);
        }
        if(number1 <= number2){
            System.out.printf("%d <= %d%n", number1, number2);
        }
        if(number1 >= number2){
            System.out.printf("%d >= %d%n", number1, number2);
        }
    }
}
