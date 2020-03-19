
package crick_calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Cricket_Calculator extends JFrame
{
    private Container c;
    private ImageIcon icon,button_0_icon,button_1_icon,button_2_icon,button_3_icon,button_4_icon,button_6_icon,button_wide_ball_icon,button_no_ball_icon,button_wicket_icon,button_home_icon,button_refresh_icon;
    private JButton   button_0,button_1,button_2,button_3,button_4,button_6,button_wicket,button_wide_ball,button_no_ball,button_home,button_refresh;
    private JTextField runs_textfield,wickets_textfield,overs_textfield;
    private JPanel panel;
    private Font f = new Font("Arial",Font.BOLD,18);
    private int runs=0,wickets=0,balls=0;

    
     Cricket_Calculator()
     {
        Frame(); 
        Container();
        Images();
        TextFields();
        Panel();
        Buttons();
        ActionListeners();
     }
    
    public void Frame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cricket Calculator");
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
        
        button_0_icon = new ImageIcon(getClass().getResource("button_0.png"));
        button_1_icon = new ImageIcon(getClass().getResource("button_1.png"));
        button_2_icon = new ImageIcon(getClass().getResource("button_2.png"));
        button_3_icon = new ImageIcon(getClass().getResource("button_3.png"));
        button_4_icon = new ImageIcon(getClass().getResource("button_4.png"));
        button_6_icon = new ImageIcon(getClass().getResource("button_6.png"));
        button_wide_ball_icon = new ImageIcon(getClass().getResource("button_wide_ball.png"));
        button_no_ball_icon = new ImageIcon(getClass().getResource("button_no_ball.png"));
        button_wicket_icon = new ImageIcon(getClass().getResource("button_wicket.png"));
        button_home_icon = new ImageIcon(getClass().getResource("button_home.png"));
        button_refresh_icon = new ImageIcon(getClass().getResource("button_refresh.png"));
    }
    
    public void TextFields()
    {
        runs_textfield = new JTextField("Runs");
        runs_textfield.setBounds(60,30,70,50);
        runs_textfield.setFont(f);
        runs_textfield.setEditable(false);
        c.add(runs_textfield);
        
        
        wickets_textfield = new JTextField("Wickets");
        wickets_textfield.setBounds(135,30,75,50);
        wickets_textfield.setFont(f);
        wickets_textfield.setEditable(false);
        c.add(wickets_textfield);
        
        overs_textfield = new JTextField("Overs");
        overs_textfield.setBounds(220,30,70,50);
        overs_textfield.setFont(f);
        overs_textfield.setEditable(false);
        c.add(overs_textfield);
       
    }
    
    public void Panel()
    {
        panel = new JPanel();
        panel.setBounds(30,100,330,230);
        panel.setLayout(new GridLayout(3,3));
        panel.setBackground(Color.white);
        c.add(panel);
    }
    
    public void Buttons()
    {
        button_0 = new JButton(button_0_icon);
        button_0.setBorder(null);
        button_0.setBackground(Color.white);
        panel.add(button_0);
        
        
        button_1 = new JButton(button_1_icon);
        button_1.setBorder(null);
        button_1.setBackground(Color.white);
        panel.add(button_1);
        
        
        button_2 = new JButton(button_2_icon);
        button_2.setBorder(null);
        button_2.setBackground(Color.white);
        panel.add(button_2);
        
        button_home = new JButton(button_home_icon);
        button_home.setBorder(null);
        button_home.setBackground(Color.white);
        panel.add(button_home);
        
        button_3 = new JButton(button_3_icon);
        button_3.setBorder(null);
        button_3.setBackground(Color.white);
        panel.add(button_3);
        
        
        button_4 = new JButton(button_4_icon);
        button_4.setBorder(null);
        button_4.setBackground(Color.white);
        panel.add(button_4);
        
        
        button_6 = new JButton(button_6_icon);
        button_6.setBorder(null);
        button_6.setBackground(Color.white);
        panel.add(button_6);
        
        button_refresh = new JButton(button_refresh_icon);
        button_refresh.setBorder(null);
        button_refresh.setBackground(Color.white);
        panel.add(button_refresh);
        
        button_wicket = new JButton(button_wicket_icon);
        button_wicket.setBorder(null);
        button_wicket.setBackground(Color.white);
        panel.add(button_wicket);
        
        
        button_wide_ball = new JButton(button_wide_ball_icon);
        button_wide_ball.setBorder(null);
        button_wide_ball.setBackground(Color.white);
        panel.add(button_wide_ball);
        
        
        button_no_ball = new JButton(button_no_ball_icon);
        button_no_ball.setBorder(null);
        button_no_ball.setBackground(Color.white);
        panel.add(button_no_ball);
        
        
    }
    
    public void ActionListeners()
    {
        button_home.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Home frame = new Home();
                frame.setVisible(true);
            }
        });
        
        button_0.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               if((int)(balls/6)<10) 
               {
               runs = runs + 0;
               balls = balls +1;
               runs_textfield.setText(""+runs);
               overs_textfield.setText((int)(balls/6)+" . "+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
        
        button_1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               if((int)(balls/6)<10) 
               {
               runs = runs + 1;
               balls = balls +1;
               runs_textfield.setText(""+runs);
               overs_textfield.setText((int)(balls/6)+" . "+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
         
        button_2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               if((int)(balls/6)<10) 
               {
               runs = runs + 2;
               balls = balls +1;
               runs_textfield.setText(""+runs);
               overs_textfield.setText((int)(balls/6)+" . "+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
         
        button_3.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               if((int)(balls/6)<10) 
               {
               runs = runs + 3;
               balls = balls +1;
               runs_textfield.setText(""+runs);
               overs_textfield.setText((int)(balls/6)+" . "+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
         
        button_4.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               if((int)(balls/6)<10) 
               {
               runs = runs + 4;
               balls = balls +1;
               runs_textfield.setText(""+runs);
               overs_textfield.setText((int)(balls/6)+" . "+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
         });
         
        button_6.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               if((int)(balls/6)<10) 
               {
               runs = runs + 6;
               balls = balls +1;
               runs_textfield.setText(""+runs);
               overs_textfield.setText((int)(balls/6)+" . "+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }   
        });
        
        button_wicket.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               if((int)(balls/6)<10) 
               {
                    if(wickets<9)
                    {
                      wickets = wickets + 1;
                      balls = balls +1;
                      wickets_textfield.setText(""+wickets);
                      overs_textfield.setText((int)(balls/6)+" . "+balls%6);
                    }
                    else
                    {
                     wickets_textfield.setText(""+(wickets+1));
                     balls = balls +1;
                     overs_textfield.setText((int)(balls/6)+" . "+balls%6); 
                     JOptionPane.showMessageDialog(null, "NO MORE BATSMAN LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                     All_Disable();
                    }
                }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
        
        button_wide_ball.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {    
              if((int)(balls/6)<10) 
              {  
                    try{
                    int temp = Integer.valueOf(JOptionPane.showInputDialog(null, "Extra Runs On That Ball"));
                    runs = runs + 1 +temp;
                    runs_textfield.setText(""+runs); }catch(Exception ex){}
              }
              else
              {
                 JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                 All_Disable();
              }
              
            }
        });
        
        button_no_ball.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
              if((int)(balls/6)<10) 
              {
                try{  
                int temp = Integer.valueOf(JOptionPane.showInputDialog(null, "Extra Runs On That Ball"));
                runs = runs + 1 +temp;
                runs_textfield.setText(""+runs);   }catch(Exception ex){}
              }
              else
              {
                 JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                 All_Disable();
              }
            }
        });
        
        button_refresh.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {  
                button_0.setEnabled(true);
                button_1.setEnabled(true);
                button_2.setEnabled(true);
                button_3.setEnabled(true);
                button_4.setEnabled(true);
                button_6.setEnabled(true);
                button_wide_ball.setEnabled(true);
                button_no_ball.setEnabled(true);
                button_wicket.setEnabled(true);
                runs=0;wickets=0;balls=0;
                runs_textfield.setText(""+runs);
                wickets_textfield.setText(""+wickets);
                overs_textfield.setText((int)(balls/6)+" . "+balls%6);
              
            }
        });
        
        

    }
    
    
    public void All_Disable()
    {
        button_0.setEnabled(false);
        button_1.setEnabled(false);
        button_2.setEnabled(false);
        button_3.setEnabled(false);
        button_4.setEnabled(false);
        button_6.setEnabled(false);
        button_wide_ball.setEnabled(false);
        button_no_ball.setEnabled(false);
        button_wicket.setEnabled(false);
    }
    
    
    public static void main(String[] args) 
    {
         Cricket_Calculator frame = new  Cricket_Calculator();
         frame.setVisible(true);
    }
}
