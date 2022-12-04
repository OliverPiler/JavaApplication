/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author ryan_
 */
public class LetterGrades {
    public static void main(String[] args){
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the integer grades in the range 0-100.(<Ctrl> z then terminate input)%n");
        while(input.hasNext()){
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
            
            switch(grade/10){
                case 9: case 10:
                    aCount++;
                    break;
                case 8:
                    bCount++;
                    break;
                case 7:
                    cCount++;
                    break;
                case 6:
                    dCount++;
                    break;
                default:
                    fCount++;
                    break;
            }
        }
            System.out.printf("%nGrade Report:%n");
            if(gradeCounter != 0){
                double average = (double)total / gradeCounter;
                System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
                System.out.printf("Class average is %.2f%n", average);
            }
            else{
                System.out.println("No grades were entered");
            }
    }
}
