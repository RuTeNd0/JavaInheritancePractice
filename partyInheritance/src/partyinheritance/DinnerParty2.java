/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partyinheritance;

/**
 *
 * @author ruten
 */
public class DinnerParty2 extends PartyInheritance
{
    private int dinnerchoice;

    public int getDinnerchoice() {
        return dinnerchoice;
    }

    public void setDinnerchoice(int dinnerchoice) {
        this.dinnerchoice = dinnerchoice;
    }
   
    @Override
    public void displayInvitation(){
        System.out.println("Please come to my dinner party! ");
    }
}
