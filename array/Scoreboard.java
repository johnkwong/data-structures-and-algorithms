//import GameEntry;
import java.util.Arrays;
public class Scoreboard{
   private int numEntries = 0;
   private GameEntry[] board;
   public Scoreboard(int capcity){
      board = new GameEntry[capcity];
   } 

   public void add(GameEntry e){
   int newScore = e.getScore();
   if(numEntries < board.length || newScore > board[numEntries - 1].getScore()){
      if(numEntries < board.length){
          numEntries++;
      }
      int j = numEntries - 1;
      while(j > 0 && board[j-1].getScore() < newScore){
         board[j] = board[j-1];
         j--;
      }
      board[j] = e;
   }
   System.out.println(Arrays.toString(board));  
   }

   public GameEntry remove(int i) throws IndexOutOfBoundsException{
      if(i<0 || i >= numEntries) throw new IndexOutOfBoundsException("Invalid index: " + i);
      GameEntry temp = board[i];
      for(int j = i; j <numEntries; j++)
         board[j]= board[j+1];
      numEntries--;
      return temp;

   }


}

