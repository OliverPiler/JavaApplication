/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HW2;

/**
 *
 * @author ryan_
 */
public class HW2 {
    public static void main(String[] args){
        DeckOfCards doc = new DeckOfCards();
        doc.Shuffle();
        for(int counter = 1; counter <= 52; counter++){
            System.out.printf("%-19s", doc.declCard());
            if(counter % 4 == 0){
                System.out.println();
            }
        }
        System.out.printf("%nThe number of Hearts:%d%n", doc.count6());
    }
}
