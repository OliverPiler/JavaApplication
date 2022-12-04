/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quizs;
import java.util.Scanner;
/**
 *
 * @author ryan_
 */
public class Q2 {
    public static void main(String[] args){
        ScoreBook s1 = new ScoreBook("Poly", 4);
        ScoreBook s2 = new ScoreBook("Barbar", 5);
        s1.average();
        System.out.printf("%s%n", s1);
        s2.average();
        System.out.printf("%s%n", s2);
    }
}

class ScoreBook{
    private String name;
    private int scores;
    private int average;
    
    public ScoreBook(String name, int scores){
        this.name = name;
        this.scores = scores;
    }
    public void average(){
        int total = 0;
        Scanner input = new Scanner(System.in);
        for(int counter = 0; counter < scores; counter++){
            total += input.nextInt();
        }
        average = total / scores;
    }
    public String toString(){
        return "Name: " + name + " Average: " + average;
    }
}
