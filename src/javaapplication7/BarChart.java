/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ryan_
 */
public class BarChart {
    public static void main(String[] args){
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1}; // 成績分布
        System.out.printf("Grade distribution:");
        for(int counter = 0; counter < array.length; counter++){
            if(counter == 10){
                System.out.printf("%5d:", 100);
            }
            else{
                System.out.printf("%02d-%02d:", counter * 10, counter * 10 + 9);
            }
            for(int stars = 0; stars < array[counter]; stars++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
