import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LabExample extends JFrame
{
    private int mscore = 0;
    private int rscore = 0;
    private String lastscored = "N/A";
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel ls = new JLabel( "Last Scorer: "+lastscored);
    JLabel res = new JLabel( "Result: "+mscore+" X " + rscore);
    JLabel result = new JLabel( "Winner: DRAW");
    LabExample()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(button1);
        add(button2);
        add(res);
        add(ls);
        add(result);
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                mscore++;
                lastscored = "AC Milan";
                res.setText("Result: "+mscore+" X " + rscore);
                ls.setText("Last Scorer: "+lastscored);
                if(mscore>rscore)
                    result.setText("Winner: AC Milan");
                else if(mscore==rscore)
                result.setText("Winner: AC Milan");
                else
                    result.setText("Winner: Real Madrid");
            }
        });
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                rscore++;
                lastscored = "Real Madrid";
                res.setText("Result: "+mscore+" X " + rscore);
                ls.setText("Last Scorer: "+lastscored);
                if(mscore>rscore)
                    result.setText("Winner: AC Milan");
                else if(mscore==rscore)
                    result.setText("Winner: AC Milan");
                else
                    result.setText("Winner: Real Madrid");
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
       new LabExample();
    }
}
