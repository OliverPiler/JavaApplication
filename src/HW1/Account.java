/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HW1;

/**
 *
 * @author ryan_
 */
public class Account {
    private String name;
    private double balance;
    
    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }
    }
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void Deposit(double DepositAmount){
        if(DepositAmount > 0.0){
            balance = balance + DepositAmount;
        }
    }
    public void Withdraw(double WithdrawAmount){
        if(WithdrawAmount <= balance){
            balance = balance - WithdrawAmount;
        }
        else{
            System.out.printf("提領金額超出餘額%n");
        }
    }
}
