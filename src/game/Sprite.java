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
public class Sprite implements ISprite{
    //parent class
    public String name;
    public int health;
    
    public int positionx;
    public int positiony;
    
    public int strenght;
    
    public Sprite() {
        
    }
    
    public void move(){
        positionx = positionx + 1;
        positiony++;  
    }
    
    public int heal(){
        health +=50;
        return health;
    }
    
}
