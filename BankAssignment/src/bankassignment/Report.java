package bankassignment;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author matth
 */
public class Report extends JComponent {

    /**
     * the Constructor
     */
    JPanel reportPanel = new JPanel();
    JLabel label = new JLabel();
    JTextField textMax = new JTextField(30);
    JTextField textMin = new JTextField(30);
    
    public Report() 
    {
        
        this.add(label);
        
        reportPanel.add(textMax) ;
        textMax.setEditable(false);
        reportPanel.add(textMin) ;
        textMin.setEditable(false);
    }
    

}
