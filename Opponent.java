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
public class Opponent extends Sprite{
    public static int numberofopponents = 0;
    public static final int MOVE_SIZE = 1;
    
   public String hairColor;

   public Opponent() {
       numberofopponents++;
       //movesize = 2;
       name = "Joker";
       positionx = 3;
       positiony = 5;
       hairColor = "Pink";
   }
   
   public String rename(){
       name = "Artemis";
       return name;
   }
   
   public void displayposition () {
       System.out.println(name + " is at position " + positionx + ", " + positiony);
   }
       public int diplaypositionx () {
           System.out.println(name + " is at position " + positionx);
           return positionx; 
    }
       
       public static int getcount(){
           return numberofopponents;
       }
   }
   
   
   
   

