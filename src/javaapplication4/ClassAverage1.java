/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author ryan_
 */
public class ClassAverage1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
        
        while(gradeCounter <= 10){
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter += 1;
        }
        int average = total / 10;
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}
