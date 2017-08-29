public class Tester{
   public static void main(String[] args){
      Scoreboard s = new Scoreboard(10);
      GameEntry e1 = new GameEntry("Tom",60);
      s.add(e1);
      GameEntry e2 = new GameEntry("John",80);
      s.add(e2);
   }

}
