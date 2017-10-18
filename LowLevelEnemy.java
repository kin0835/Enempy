import java.lang.Integer;

class Enemy implements { //Comparable<Enemy>
  
  private String name;
  private int HP;  
  
  public Enemy(String name, int HP){
    this.name = name;
    this.HP = HP;    
  }
  
  public void setName(String name){
    this.name = name;
  }
  
   public void setHP(int HP){
    this.HP = HP;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getHP()
  {
    return HP;
  }
  
  @Override
  public String toString()
  {
    return ("Name:" + name + " HP: " + HP);
  }
  
  @Override
  public boolean equals(Object other){
    if(other instanceof Enemy)
    {
      Enemy otherEnemy = (Enemy)other;
      return (otherEnemy.name.equals(name));
    }else{
      return false;
    }    
  }
  
 
}

public class LowLevelEnemy
{
  public static void main (String args[])
  {
    Enemy[] enemies = new Enemy[5];
    enemies[0] = new Enemy("US Army", 10);
    enemies[1] = new Enemy("US Savy", 12);
    enemies[2] = new Enemy("US Air Force", 15);
    System.out.println(enemies[0]);
    System.out.println(enemies[1]);
    System.out.println(enemies[2]);
    System.out.println(enemies[0].equals(enemies[2]));
    System.out.println(enemies[0].equals(enemies[0]));
  }    
}
