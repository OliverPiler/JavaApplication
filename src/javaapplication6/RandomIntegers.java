/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;
import java.security.SecureRandom;
/**
 *
 * @author ryan_
 */
public class RandomIntegers {
    public static void main(String[] args){
        SecureRandom randomNumbers = new SecureRandom();
        for(int i = 1; i <= 20; i++){
            int face = randomNumbers.nextInt(6) + 1;
            System.out.printf("%d ", face);
            if(i % 5 == 0){
                System.out.println();
            }
        }
    }
}
