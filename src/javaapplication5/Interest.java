/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author ryan_
 */
public class Interest {
    public static void main(String[] args){
        double amount;
        double principal = 1000.0;
        double rate = 0.05;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for(int year = 1; year <= 10; year++){
            amount = principal * Math.pow(1 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
