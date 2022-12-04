/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author ryan_
 */
public class Increment {
    public static void main(String[] args){
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c); // 5
        System.out.printf("postincrementing c: %d%n", c++); // 5
        System.out.printf("c after postincrement: %d%n", c); // 6
        
        System.out.println();
        
        c = 5;
        System.out.printf("c before preincrement: %d%n", c); //5
        System.out.printf("preincrementing c: %d%n", ++c); // 6
        System.out.printf("c after preincrement: %d%n", c); // 6
    }
}
