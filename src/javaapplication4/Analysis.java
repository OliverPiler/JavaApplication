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
public class Analysis {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;
        
        while(studentCounter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail)");
            result = input.nextInt();
            if(result == 1){
                passes++;
            }
            else{
                failures++;
            }
            studentCounter++;
        }
        
        System.out.printf("Passes: %d%nFailed: %d%n", passes, failures);
        if(passes > 8){
            System.out.println("Bonus to instructor");
        }
    }
}
