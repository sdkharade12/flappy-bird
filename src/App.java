import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth=360;
        int boardHeight=640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight); //set size of app
        frame.setLocationRelativeTo(null); //sets the screen to the center
        frame.setResizable(false); //resizing the window is not possible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //can close the window
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}