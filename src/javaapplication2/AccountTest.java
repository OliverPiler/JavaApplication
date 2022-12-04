/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author ryan_
 */
public class AccountTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account("Jane Green");
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
    }
}
