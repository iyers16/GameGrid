/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author cstuser
 */
public class Player extends Sprite {
   
    public float magicPower;
    
    public Player() {
        positionx = 4;
        positiony = 1;
        strenght = 10;
        name = "Chronos";
        health = 50;
        magicPower = 3.5f;
        
        
    }
    
    
  //don<t need to write health function bc it exists in the parent
}
