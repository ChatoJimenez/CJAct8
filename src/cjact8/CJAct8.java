/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjact8;

import java.util.Scanner;
import java.util.*;

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
        boolean salir = false;
        do {
            try {
                switch (showMenu()){
                    case 1: 
                        myDeck.shuffle();
                        break;
                    case 2: 
                        myDeck.head();
                        break;
                    case 3: 
                        myDeck.pick();
                        break;
                    case 4: 
                        myDeck.hand();
                        break;
                    case 0: 
                        salir = true;
                        System.out.println("\033[34m¡Hasta luego!");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Opción no válida");
            } 
            catch (Exception e){
                System.out.println(e.getMessage());
            } 
            
        } while (!salir);
        
    }
    
    public static int showMenu() throws InputMismatchException, Exception{
        Scanner s = new Scanner(System.in);
        int result = 0;
        System.out.printf("\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", 
                "\033[34m¡Bienvenido a Póker!", "Selecciona una opción:",
                "1. Mezclar deck", "2. Sacar una carta", "3. Carta al azar", 
                "4. Generar una mano de 5 cartas", "0. Salir");
        System.out.print("Opción: \033[30m");
        result = s.nextInt();
        if (result >4){
            throw new Exception("Opción no válida");
        } else{
            return result;
        }
    }
    
}
