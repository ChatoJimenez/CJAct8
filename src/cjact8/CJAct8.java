/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjact8;

/**
 *
 * @author jesgu
 */
public class CJAct8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        System.out.println(myDeck);
        myDeck.shuffle();
        System.out.println("");
        System.out.println(myDeck);
        myDeck.head();
        System.out.println("");
        myDeck.pick();
        System.out.println("");
        myDeck.hand();
        System.out.println("");
        Card[] myHand = myDeck.Hand();
        System.out.println("");
        myDeck.shuffle();
    }
    
}
