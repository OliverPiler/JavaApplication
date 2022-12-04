/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HW1;

import java.util.Scanner;

/**
 *
 * @author ryan_
 */
public class ClockTest {
    public static void main(String args[]){
         Clock c = new Clock(14, 20, 55); // hh:mm:ss
        System.out.printf("%s%n", c.displayTime());
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter hour: ");
        int hour = input.nextInt();
        c.setHour(hour);
        System.out.printf("Hour: %s%n", c.getHour());
        
        System.out.print("Enter minute: ");
        int minute = input.nextInt();
        c.setMinute(minute);
        System.out.printf("Minute: %s%n", c.getMinute());
        
        System.out.print("Enter second: ");
        int second = input.nextInt();
        c.setSecond(second);
        System.out.printf("Second: %s%n", c.getSecond());
        
        System.out.printf("Time: %s%n", c.displayTime());
    }
}
