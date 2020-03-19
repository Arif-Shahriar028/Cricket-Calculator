
package crick_calculator;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Home extends JFrame
{
    private Container c;
    private ImageIcon icon,normal_mode_icon,cricket_mode_icon;
    private JButton  normal_mode,cricket_mode;
    private JLabel label;
    
    Home()
    {
        Frame();
        Container();
        Images();
        Buttons();
        Label();
        ActionListeners();
    }
    
    
    
    public void Frame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Home Page");
        this.setBounds(470, 180, 405, 390);
        this.setResizable(false);  
    }
    
    
    public void Container()
    {
        c = this.getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);
    }
    
    public void Images()
    {
        icon = new ImageIcon(getClass().getResource("Calculator-icon.png"));
        this.setIconImage(icon.getImage());
        
        normal_mode_icon = new ImageIcon(getClass().getResource("normal_mode.png"));
        cricket_mode_icon = new ImageIcon(getClass().getResource("cricket_mode.png"));
    }
    
    public void Label()
    {
        label = new JLabel("Welcome to Crick Calculator");
        label.setBounds(35,40,330,50);
        label.setOpaque(true);
        label.setFont(new Font("Courier New",Font.BOLD,20));
        label.setBackground(Color.white);
        c.add(label);
    
    
    }
    
    
    public void Buttons()
    {
        normal_mode = new JButton(normal_mode_icon);
        normal_mode.setBounds(110,120,normal_mode_icon.getIconWidth(),normal_mode_icon.getIconHeight());
        c.add(normal_mode);
        
        cricket_mode = new JButton(cricket_mode_icon);
        cricket_mode.setBounds(110,220,cricket_mode_icon.getIconWidth(),cricket_mode_icon.getIconHeight());
        c.add(cricket_mode);
    
    }
    
    
    public void ActionListeners()
    {
        normal_mode.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Normal_Calculator frame = new Normal_Calculator();
                frame.setVisible(true);
            }
  
        });
        
        cricket_mode.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Cricket_Calculator frame = new Cricket_Calculator();
                frame.setVisible(true);
            }
  
        });
    
    }
    
    public static void main(String[] args) 
    { 
        Home frame = new Home();
        frame.setVisible(true); 
    }
}
