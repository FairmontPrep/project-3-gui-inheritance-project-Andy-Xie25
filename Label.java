import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Label extends Cork{
    public Label(){
        super();
        JLabel image = new JLabel(new ImageIcon("Image/label.png"));
        image.setBounds(0, 0, 300, 300);
        add(image);        
    }
    @Override
    public String getPhrase(){
        return super.getPhrase() + "has a label";
    }
}
