/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ryan_
 */
public class SumArray {
    public static void main(String[] args){
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        for(int counter = 0; counter < array.length; counter++){
            total += array[counter];
        }
        System.out.printf("Total of array elements: %d%n", total);
    }
}
