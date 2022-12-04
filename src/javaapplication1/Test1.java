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
public class Test1 {
    public static void main(String[] args){
        int c, thisIsAVariable, q76354, number;
        
        System.out.print("請輸入一個整數: ");
        
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        
        System.out.println("This is a Java program");
        
        System.out.printf("%s%n%s%n", "This is a Java", "program");
        
        if(number != 7){
            System.out.println("The variable number is not equal to 7");
        }
    }
}
