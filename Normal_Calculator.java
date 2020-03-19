
package crick_calculator;


import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Normal_Calculator extends JFrame
{
    
    private Container c;
    private JPanel panel;
    private Font f = new Font("Times New Roman",Font.BOLD,26);
    private JButton button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,
                    button_plus,button_minus,button_mul,button_div,button_equ,button_clr,button_home,button_point,button_back,button_minus_sign;
    private JTextArea textarea;
    private ImageIcon icon,button_0_icon,button_1_icon,button_2_icon,button_3_icon,button_4_icon,button_5_icon,button_6_icon,button_7_icon,
                            button_8_icon,button_9_icon,button_point_icon,button_equal_icon,button_plus_icon,button_minus_icon,button_mul_icon,button_div_icon,
                            button_clr_icon,button_back_icon,button_home_icon,button_minus_sign_icon;
    private float num1,num2,result;
    private String sign;
            
    
    Normal_Calculator()
    {
        Frame();
        Container();
        Panel();
        Images();
        Text_Area();
        Buttons();
        ActionListeners();
     
    }
    
    public void Frame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Normal Calculator");
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
        button_5_icon = new ImageIcon(getClass().getResource("button_5.png"));
        button_6_icon = new ImageIcon(getClass().getResource("button_6.png"));
        button_7_icon = new ImageIcon(getClass().getResource("button_7.png"));
        button_8_icon = new ImageIcon(getClass().getResource("button_8.png"));
        button_9_icon = new ImageIcon(getClass().getResource("button_9.png"));
        button_point_icon = new ImageIcon(getClass().getResource("button_point.png"));
        button_equal_icon = new ImageIcon(getClass().getResource("button_equals.png"));
        button_plus_icon = new ImageIcon(getClass().getResource("button_plus.png"));
        button_minus_icon = new ImageIcon(getClass().getResource("button_minus.png"));
        button_mul_icon = new ImageIcon(getClass().getResource("button_mul.png"));
        button_div_icon = new ImageIcon(getClass().getResource("button_div.png"));
        button_clr_icon = new ImageIcon(getClass().getResource("button_clr.png"));
        button_back_icon = new ImageIcon(getClass().getResource("button_back.png"));
        button_home_icon = new ImageIcon(getClass().getResource("button_home.png"));
        button_minus_sign_icon = new ImageIcon(getClass().getResource("button_minus_sign.png"));
        
        
    }
    
    public void Panel()
    {
        panel = new JPanel();
        panel.setBounds(30,100,330,230);
        panel.setLayout(new GridLayout(4,5));
        panel.setBackground(Color.WHITE);
        c.add(panel);
    
    }
    
    public void Text_Area()
    {
        textarea = new JTextArea();
        textarea.setBounds(65, 30, 260, 40);
        textarea.setFont(f);
        c.add(textarea);
    
    }
    
    public void Buttons()
    {
        button_7 = new JButton(button_7_icon);
        button_7.setBorder(null);
        button_7.setBackground(Color.white);
        panel.add(button_7);
        
        
        button_8 = new JButton(button_8_icon);
        button_8.setBorder(null);
        button_8.setBackground(Color.white);
        panel.add(button_8);
        
        
        button_9 = new JButton(button_9_icon);
        button_9.setBorder(null);
        button_9.setBackground(Color.white);
        panel.add(button_9);
        
        button_div = new JButton(button_div_icon); 
        button_div.setBorder(null);
        button_div.setBackground(Color.white);
        panel.add(button_div);
        
        
        button_minus_sign = new JButton(button_minus_sign_icon); 
        button_minus_sign.setBorder(null);
        button_minus_sign.setBackground(Color.white);
        panel.add(button_minus_sign);
        
             
        button_4 = new JButton(button_4_icon);
        button_4.setBorder(null);
        button_4.setBackground(Color.white);
        panel.add(button_4);
        
        button_5 = new JButton(button_5_icon);
        button_5.setBorder(null);
        button_5.setBackground(Color.white);
        panel.add(button_5);
   
        
        button_6 = new JButton(button_6_icon);
        button_6.setBorder(null);
        button_6.setBackground(Color.white);
        panel.add(button_6);
        
        
        button_mul = new JButton(button_mul_icon); 
        button_mul.setBorder(null);
        button_mul.setBackground(Color.white);
        panel.add(button_mul);
        
        
        button_back = new JButton(button_back_icon); 
        button_back.setBorder(null);
        button_back.setBackground(Color.white);
        panel.add(button_back);
        
       
        
        button_1 = new JButton(button_1_icon);
        button_1.setBorder(null);
        button_1.setBackground(Color.white);
        panel.add(button_1);
        
        button_2 = new JButton(button_2_icon);
        button_2.setBorder(null);
        button_2.setBackground(Color.white);
        panel.add(button_2);
                
        button_3 = new JButton(button_3_icon);
        button_3.setBorder(null);
        button_3.setBackground(Color.white);
        panel.add(button_3);
        
        button_minus = new JButton(button_minus_icon); 
        button_minus.setBorder(null);
        button_minus.setBackground(Color.white);
        panel.add(button_minus);
        
        
        button_clr = new JButton(button_clr_icon); 
        button_clr.setBorder(null);
        button_clr.setBackground(Color.white);
        panel.add(button_clr);
        
        
        button_0 = new JButton(button_0_icon); 
        button_0.setBorder(null);
        button_0.setBackground(Color.white);
        panel.add(button_0); 
        
        button_point = new JButton(button_point_icon); 
        button_point.setBorder(null);
        button_point.setBackground(Color.white);
        panel.add(button_point);  
        
        button_equ = new JButton(button_equal_icon); 
        button_equ.setBorder(null);
        button_equ.setBackground(Color.white);
        panel.add(button_equ);  
        
        button_plus = new JButton(button_plus_icon); 
        button_plus.setBorder(null);
        button_plus.setBackground(Color.white);
        panel.add(button_plus);  
        
        button_home = new JButton(button_home_icon); 
        button_home.setBorder(null);
        button_home.setBackground(Color.white);
        panel.add(button_home);
        
        
        
    }
    
    public void ActionListeners()
    {   
 
        textarea.addKeyListener(new KeyListener(){
            
           public void keyTyped(KeyEvent ke) {
            }
   
            public void keyPressed(KeyEvent ke) 
            {
                if(ke.getKeyChar()!='0'&&ke.getKeyChar()!='1'&&ke.getKeyChar()!='2'&&ke.getKeyChar()!='3'&&ke.getKeyChar()!='4'&&ke.getKeyChar()!='5'&&ke.getKeyChar()!='6'&&ke.getKeyChar()!='7'&&ke.getKeyChar()!='8'&&ke.getKeyChar()!='9'&&ke.getKeyChar()!='.')
                {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID CHARACTERS","ERROR",JOptionPane.ERROR_MESSAGE);
                    textarea.setText("");
                } 
                
            }

            public void keyReleased(KeyEvent ke) {
            }
        
        });
        
    
        button_minus_sign.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                   textarea.setText("-"+textarea.getText());
                   button_point.setEnabled(true);
            }     
        });
        
        
        
        button_clr.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                   textarea.setText("");
                   button_point.setEnabled(true);
            }     
        });
        
        button_back.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 String str = textarea.getText();
                 try
                 {
                     textarea.setText(""+str.substring(0, (str.length()-1)));
                     char temp = str.charAt(str.length()-1);
                     if(temp=='.')
                     {
                         button_point.setEnabled(true);
                     }
                 }catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "NO VALUES LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
            } 
        });
        
        
        button_0.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                textarea.append("0");
            } 
        });
        
        button_1.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append("1");
            } 
        });
        
        button_2.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append("2");
            } 
        });
        
        button_3.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append("3");
                 
            } 
        });
        
        button_4.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append("4");
            } 
        });
        
        button_5.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append("5");
            } 
        });
        
        button_6.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append("6");
            } 
        });
        
        button_7.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append("7");
            } 
        });
        
        button_8.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append("8");
            } 
        });
        
        button_9.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append("9");
            } 
        });
        
        button_point.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 textarea.append(".");
                 button_point.setEnabled(false);
            } 
        });
        
        button_plus.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 try{
                 sign="+";
                 num1 = Float.valueOf(textarea.getText());
                 textarea.setText(""); 
                 button_point.setEnabled(true);}catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
            } 
        });
        
        button_minus.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 try{
                 sign="-";
                 num1 = Float.valueOf(textarea.getText());
                 textarea.setText("");
                 button_point.setEnabled(true);}catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }    
                 
            } 
        });
        
        button_mul.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 try{
                 sign="*";
                 num1 = Float.valueOf(textarea.getText());
                 textarea.setText("");
                 button_point.setEnabled(true);}catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }    
                 
            } 
        });
        
        button_div.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 try{
                 sign="/";
                 num1 = Float.valueOf(textarea.getText());
                 textarea.setText("");
                 button_point.setEnabled(true);}catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }    
                 
            } 
        });
        
        button_equ.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                try{
                num2 = Float.valueOf(textarea.getText());
                 
                if("+".equals(sign))
                {
                    result=(float)(num1+num2);
                }
                if("-".equals(sign))
                {
                    result=(float)(num1-num2);
                }
                if("*".equals(sign))
                {
                    result=(float)(num1*num2);
                }
                if("/".equals(sign))
                {
                    result=(float)(num1/num2);
                }
                textarea.setText(""+result); 
                button_point.setEnabled(false);
                }catch(Exception ex)
                {
                     JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            } 
        });
        
        button_home.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Home frame = new Home();
                frame.setVisible(true);
            }
  
        });
        
        
    }
 
    public static void main(String[] args)
    {
        Normal_Calculator frame = new Normal_Calculator();
        frame.setVisible(true);
    }
       
}

