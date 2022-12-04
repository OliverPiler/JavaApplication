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
public class DateTest {
    public static void main(String args[]){
        Date d = new Date(20, 5, 2022); // 格式為: 日/月/年
        System.out.printf("%s%n", d.displayDate());
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter day: ");
        int day = input.nextInt();
        d.setDay(day);
        System.out.printf("Day: %s%n", d.getDay());
        
        System.out.print("Enter month: ");
        int month = input.nextInt();
        d.setMonth(month);
        System.out.printf("Month: %s%n", d.getMonth());
        
        System.out.print("Enter year: ");
        int year = input.nextInt();
        d.setYear(year);
        System.out.printf("Year: %s%n", d.getYear());
        
        System.out.printf("Date: %s%n", d.displayDate());
    }
}
