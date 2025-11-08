import javax.swing.JFrame;
public class GameWindow
{
    private JFrame window;
    public GameWindow(GamePanel gamePanel)
    {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable (false);
        window.setTitle("2D Platformer");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setSize (500, 500);

    }
}
