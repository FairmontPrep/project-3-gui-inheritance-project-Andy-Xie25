import javax.swing.ImageIcon;  
import javax.swing.JLabel;

public class Liquid extends Bottle{
    private boolean isblue;

    public Liquid(){
        super();
        isblue = Math.random() < 0.5;
        JLabel image;
        if (isblue) {
            image = new JLabel(new ImageIcon("Image/blue potion.png"));
        } else {
            image = new JLabel(new ImageIcon("Image/red color.png"));
        }
        image.setBounds(0, 0, 300, 300);
        add(image);
    }

    @Override
    public String getPhrase(){
        if (isblue) {
            return super.getPhrase() + "has blue liquid, ";
        } else {
            return super.getPhrase() + "has red liquid, ";
        }
    }
    
}
