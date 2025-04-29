import java.awt.*;
import javax.swing.*;

public class Bottle extends JPanel {
    private String phrase = "This bottle ";

    public Bottle(){
        setPreferredSize(new Dimension(300, 300));
        setLayout(null);
        setBackground(Color.WHITE);
        JLabel image = new JLabel(new ImageIcon("Image/bottle.png"));
        image.setBounds(0, 0, 300, 300);
        add(image);
    }
    
    public String getPhrase(){
        return phrase;
    }
}

    

