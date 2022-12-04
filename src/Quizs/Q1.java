/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quizs;
import java.security.SecureRandom;
/**
 *
 * @author ryan_
 */
public class Q1 {
    public static void main(String[] args){
        ListofNumbers m = new ListofNumbers();
        m.max();
        m.output();
    }
}

class ListofNumbers{
    private Number[] N = new Number[10];
    private static final SecureRandom randomNumbers = new SecureRandom();
    public ListofNumbers(){
        for(int counter = 0; counter < N.length; counter++){
            N[counter] = new Number(randomNumbers.nextInt(10) + 1);
        }
    }
    public void max(){
        int maximun = N[0].getNum();
        for(int counter = 1; counter < N.length; counter++){
            if(maximun < N[counter].getNum()){
                maximun = N[counter].getNum();
            }
        }
        System.out.printf("%d%n", maximun);
    }
    public void output(){
        for(Number num : N){
            System.out.printf("%d ", num.getNum());
        }
    }
}

class Number{
    private int num;
    public Number(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
}
