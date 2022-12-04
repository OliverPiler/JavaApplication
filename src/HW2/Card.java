/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HW2;

/**
 *
 * @author ryan_
 */
public class Card {
    private final int face;
    private final String suit;
    
    public Card(int face, String suit){
        this.face = face;
        this.suit = suit;
    }
    
    public int Face(){
        return face;
    }
    
    public String toString(){
        return face + " of " + suit;
    }
}
