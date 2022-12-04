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
public class AccountTest {
    public static void main(String args[]){
        Account account1 = new Account("Ryan", 50.00);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter deposit amount for account1: ");
        double DepositAmount = input.nextDouble();
        System.out.printf("adding $%.2f to account1 balance%n%n", DepositAmount);
        account1.Deposit(DepositAmount);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        
        System.out.printf("Enter withdraw amount for account1: ");
        double WithdrawAmount = input.nextDouble();
        if(WithdrawAmount <= account1.getBalance()){
            System.out.printf("subtracting $%.2f to account1 balance%n%n", WithdrawAmount);
            account1.Withdraw(WithdrawAmount);
        }
        else{
            account1.Withdraw(WithdrawAmount);
        }
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
    }
}
