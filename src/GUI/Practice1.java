/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import javax.swing.JOptionPane;
/**
 *
 * @author ryan_
 */
public class Practice1 {
    public static void main(String[] args){
        String s1 = JOptionPane.showInputDialog("Enter first integer");
        int n1 = Integer.parseInt(s1);
        String s2 = JOptionPane.showInputDialog("Enter second integer");
        int n2 = Integer.parseInt(s2);
        int sum = n1 + n2;
        String message = String.format("sum is %d", sum);
        JOptionPane.showMessageDialog(null, message);
    }
}
