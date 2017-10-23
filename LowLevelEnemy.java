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
