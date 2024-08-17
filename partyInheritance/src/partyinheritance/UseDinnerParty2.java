/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partyinheritance;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ruten
 */
public class UseDinnerParty2 {
    
        public static void main(String[] args) 
        {
            
        int guests;
        int choice;
        DinnerParty2 aDinnerParty = new DinnerParty2();
        PartyInheritance party = new PartyInheritance();
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("enter number of guests for the party>> ");
        guests = keyboard.nextInt();
        party.setGuests(guests);
        System.out.println("The party has "+ party.getGuests() + " guests");
        
        party.displayInvitation();
        
        System.out.println("enter number of guests for the dinner party>> ");
        guests = keyboard.nextInt();
        aDinnerParty.setGuests(guests);
        
        
        System.out.println(" Enter the menu option -- 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        aDinnerParty.setDinnerchoice(choice);
        System.out.println("The dinner party has "+ aDinnerParty.getGuests()+ " guests");
        System.out.println("Menu option "+ aDinnerParty.getDinnerchoice()+ " will be serverd");
        
        aDinnerParty.displayInvitation();
        
    }
    
}
