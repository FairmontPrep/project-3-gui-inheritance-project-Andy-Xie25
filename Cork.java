import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cork extends Liquid{

    public Cork(){
        super();
        JLabel image = new JLabel(new ImageIcon("Image/cork.png"));
        image.setBounds(0, 0, 300, 300);
        add(image);        
    }

    @Override
    public String getPhrase(){
        return super.getPhrase() + "has a corked, ";
    }

}
