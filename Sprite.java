package gamegrid;

public class Sprite implements ISprite{

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
