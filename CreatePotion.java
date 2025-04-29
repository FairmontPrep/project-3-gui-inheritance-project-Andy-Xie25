import javax.swing.*;


public class CreatePotion {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Potion Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label potion = new Label();
        
        //make sure components overlap each other
        //To do this, we need to set the layout to null

        frame.getContentPane().add(potion);

        frame.setSize(300, 300);
        frame.setVisible(true);

        JOptionPane.showMessageDialog(frame, potion.getPhrase());
    }
}
