import javax.swing.*;


public class CreatePotion {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Potion Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label potion = new Label();
        
       
        frame.getContentPane().add(potion);

        frame.setSize(300, 300);
        frame.setVisible(true);

        JOptionPane.showMessageDialog(frame, potion.getPhrase());
    }
}
