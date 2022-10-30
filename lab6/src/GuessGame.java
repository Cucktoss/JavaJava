import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class GuessGame extends JFrame {
    private int number;
    private int counter = 1;
    JLabel text1 = new JLabel("guess number from 0 to 20 \n you have 3 tries");
    JLabel text2 = new JLabel("try 1");
    JButton button1 = new JButton("check");
    JTextField ent = new JTextField(2);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    GuessGame()
    {
        super("LAB-6. TASK-1");
        number = (int)(Math.random()*20);
        setLayout(new FlowLayout());
        setSize(300,200);
        add(text1);
        add(ent);
        ent.setForeground(Color.GRAY);
        ent.setFont(fnt);
        add(text2);
        add(button1);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                counter += 1;
                if(Integer.parseInt(ent.getText())==number)
                {
                    JOptionPane.showMessageDialog(null,"You won!","Output", JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }
                if(counter==4)
                {
                    JOptionPane.showMessageDialog(null,"You lost!\n number is "+ number,"Output", JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }
                else if(Integer.parseInt(ent.getText())>number)
                {
                    text2.setText("try "+ counter +" The number is lower");
                }
                else
                {
                    text2.setText("try "+ counter +" The number is higher");
                }
            }
        });
    }
    public static void main(String[] args)
    {
        new GuessGame();
    }
}
