/**
 * @author Sami Jenedi
 * Class Program create a random 10 x 10 integer array and display the highest value.
 */
public class TwoDArray {

  public static void main(String[] args) {
 
    final int TABLE1 = 10;
    final int TABLE2 = 10;
    int highest = 0;
    int row = 0 ;
    int column = 0;
    
    int[][] table = new int[TABLE1][TABLE2];
    
    for( int i = 0; i < TABLE1; i++) {
      for( int j = 0; j < TABLE2; j++) {
        table[i][j] = (int)(Math.random() * 100);
        System.out.print(table[i][j] + " ");    
    
    if (i == 0 && j == 0)
    {
      highest = table[i][j];
    }
    else if (table[i][j] > highest )
    {
      highest = table[i][j];
      row = i;
      column = j;
    }
  }
      System.out.println(" ");
  }
    System.out.println(" ");
    System.out.println("The highest value located at: " + "["+ row +"]" + "["+column+"]" + " is " + highest);
  }
  }
