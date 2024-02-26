import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
        // an instance of JFrame class
        JFrame obj = new JFrame();
        // an instance of GamePlay class, this is also relating to GamePlay module
        GamePlay gamePlay = new GamePlay();
        
        // set the frame of the game 
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}