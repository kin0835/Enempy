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
