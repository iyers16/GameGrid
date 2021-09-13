/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegrid;

/**
 *
 * @author cstuser
 */
public class GameGrid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println(Opponent.getcount());

        Opponent opp = new Opponent();
                System.out.println(Opponent.getcount());

        Opponent art = new Opponent();
        
        opp.displayposition();
        
        art.move();
        art.rename();
        art.move();
        art.displayposition();
        
        System.out.println(Opponent.getcount());
    }
    
}
