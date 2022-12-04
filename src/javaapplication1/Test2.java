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
public class Test2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, y, z, result;
        System.out.print("請輸入第一個值: ");
        x = input.nextInt();
        System.out.print("請輸入第二個值: ");
        y = input.nextInt();
        System.out.print("請輸入第三個值: ");
        z = input.nextInt();
        result = x * y * z;
        System.out.printf("Product is %d", result);
    }
}
