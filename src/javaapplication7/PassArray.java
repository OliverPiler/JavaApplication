/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ryan_
 */
public class PassArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        System.out.printf("Original array: ");
        for(int value : array){
            System.out.printf("%d ", value);
        }
        modifyArray(array);
        System.out.printf("%nModify array: ");
        for(int value : array){
            System.out.printf("%d ", value);
        }
        System.out.printf("%nPassing array element value: array[3] = %d", array[3]);
        modifyElement(array[3]);
        System.out.printf("%narray[3] = %d", array[3]);
    }
    public static void modifyArray(int[] array2){
        for(int counter = 0; counter < array2.length; counter++){
            array2[counter] *= 2;
        }
    }
    public static void modifyElement(int element){
        element *= 2;
        System.out.printf("%nValue of element in modifyElement: %d", element);
    }
}
