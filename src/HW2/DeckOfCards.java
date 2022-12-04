/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HW2;
import java.security.SecureRandom;
/**
 *
 * @author ryan_
 */
public class DeckOfCards {
    private Card deck[];
    private int CurrentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    public DeckOfCards(){
        int face[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String suit[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[NUMBER_OF_CARDS];
        CurrentCard = 0;
        for(int counter = 0; counter < deck.length; counter++){
            deck[counter] = new Card(face[counter % 13], suit[counter / 13]);
        }
    }
    public void Shuffle(){
            CurrentCard = 0;
            for(int first = 0; first < deck.length; first++){
                int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
                Card temp = deck[first];
                deck[first] = deck[second];
                deck[second] = temp;
        }
    }
    public Card declCard(){
        if(CurrentCard < deck.length){
            return deck[CurrentCard++];
        }
        else{
            return null;
        }
    }
    public int count6(){
        int total6 = 0;
        for(int counter = 0; counter < 20; counter++){
            if(deck[counter].Face() == 6){
                total6++;
            }
        }
        return total6;
    }
}
