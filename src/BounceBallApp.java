import java.awt.*;
import javax.swing.*;

public class BounceBallApp extends JFrame {
  public BounceBallApp() {
    add(new BallControl());
  }

  public static void main(String[] args) {
   
    BounceBallApp frame =  new BounceBallApp();//add JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//add EXIT_ON_CLOSE
    frame.setTitle("BounceBallApp");//add title
    frame.setLocationRelativeTo(null);
    frame.setSize(400, 320);//the size of GUI
    frame.setVisible(true);
  }
}
