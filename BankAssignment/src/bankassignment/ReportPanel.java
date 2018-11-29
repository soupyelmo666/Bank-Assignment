package bankassignment;
import javax.swing.*;
import javax.swing.JTextField;


public class ReportPanel extends JPanel 
{
    private JLabel prompt;
    private JButton generate; 
    private JTextField textMax;
    private JTextField textMin ;
    
    public ReportPanel () 
    {
        
        
      prompt = new JLabel("Your Account Reports") ;
      generate = new JButton("Generate reports");
      
        textMax = new JTextField(30) ;
        textMax.setEditable(false);
        
        textMin = new JTextField(30) ;
        textMin.setEditable(false);
        
        add(prompt);   
        add(textMax) ;
        add(textMin) ;
        add(generate);
    }
}
