import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class calcilayout implements ActionListener {
    String oldvalue;
    String newvalue;
    Boolean isoperatorclicked=false;
    JFrame jf;
    String operatorclicked;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton addButton;
    JButton zeroButton;
    JButton equalstoButton;
    JButton subbButton;
    JButton mulButton;
    JButton divButton;
    JButton clrButton;
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==sevenButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText("7");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"7"); 
            }
            
        }

        if(e.getSource()==eightButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText("8");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"8"); 
            }
            
        }

        else if(e.getSource()==nineButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText("9");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"9"); 
            }
            
        }
        
        else if(e.getSource()==fourButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText("4");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"4"); 
            }
            
        }
        
        else if(e.getSource()==fiveButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText("5");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"5"); 
            }
            
        }
        
        else if(e.getSource()==sixButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText("6");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"6"); 
            }
            
        }
        
        else if(e.getSource()==oneButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText("1");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"1"); 
            }
            
        }
        
        else if(e.getSource()==twoButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText("2");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"2"); 
            }
            
        }
        
        else if(e.getSource()==threeButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText("3");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"3"); 
            }
            
        }
        
        else if(e.getSource()==dotButton){
            if(isoperatorclicked==true)
            {
                displayLabel.setText(".");
                isoperatorclicked=false;
            }
            else{
            displayLabel.setText(displayLabel.getText()+"."); 
            }
            
        }
        
        else if(e.getSource()==addButton){
            oldvalue=displayLabel.getText();
            displayLabel.setText("+");
            isoperatorclicked=true;
            operatorclicked="+";
        }
        
        else if(e.getSource()==subbButton){
            oldvalue=displayLabel.getText();
            displayLabel.setText("-");
            isoperatorclicked=true;;
            operatorclicked="-";
        }
        
        else if(e.getSource()==mulButton){
            oldvalue=displayLabel.getText();
            displayLabel.setText("x");
            isoperatorclicked=true;;
            operatorclicked="x";
        }
        
        else if(e.getSource()==divButton){
            oldvalue=displayLabel.getText();
            displayLabel.setText("/");
            isoperatorclicked=true;
            operatorclicked="/";
        }
        
        else if(e.getSource()==equalstoButton){

            if (operatorclicked=="+")
            {
            newvalue=displayLabel.getText();
            float newvf=Float.parseFloat(newvalue);
            float oldvf=Float.parseFloat(oldvalue);
            float result= oldvf+newvf;
            displayLabel.setText(result+"");
            }

            if (operatorclicked=="-")
            {
                newvalue=displayLabel.getText();
                float newvf=Float.parseFloat(newvalue);
                float oldvf=Float.parseFloat(oldvalue);
                float result= oldvf-newvf;
                displayLabel.setText(result+"");
            }

            if (operatorclicked=="x")
            {
                newvalue=displayLabel.getText();
                float newvf=Float.parseFloat(newvalue);
                float oldvf=Float.parseFloat(oldvalue);
                float result= oldvf*newvf;
                displayLabel.setText(result+"");
            }

            if (operatorclicked=="/")
            {
                 newvalue=displayLabel.getText();
                float newvf=Float.parseFloat(newvalue);
                float oldvf=Float.parseFloat(oldvalue);
                 if(newvf==0)
                {
                displayLabel.setText("cannot divide by zero");
                 }
                else{
                float result= oldvf/newvf;
                displayLabel.setText(result+"");
                    }
            }

            //displayLabel.setText("=");
            
        }
        
        else if(e.getSource()==zeroButton){
            displayLabel.setText("0");
            
        }

        else if(e.getSource()==clrButton){
            displayLabel.setText("");
        }
        

        
        
    }

    public calcilayout(){
        jf=new JFrame("Lets do the Calculator");
        jf.setLayout(null);
        jf.setSize(350,450);
        jf.setLocation(900, 1);

        displayLabel=new JLabel();
        displayLabel.setBounds(30,20,280,60);
        displayLabel.setBackground(Color.LIGHT_GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);

        clrButton=new JButton("clr", null);      //clear
        clrButton.setBounds(30,80,280,30);
        clrButton.addActionListener(this);
        jf.add(clrButton);

        sevenButton=new JButton("7", null);     //7
        sevenButton.setBounds(30,110,70,70);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8", null);     //8
        eightButton.setBounds(100,110,70,70);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9", null);      //9
        nineButton.setBounds(170,110,70,70);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        divButton=new JButton("/", null);      //div
        divButton.setBounds(240,110,70,70);
        divButton.addActionListener(this);
        jf.add(divButton);

        fourButton=new JButton("4", null);      //4
        fourButton.setBounds(30,180,70,70);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5", null);      //5
        fiveButton.setBounds(100,180,70,70);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);
        
        sixButton=new JButton("6", null);       //6
        sixButton.setBounds(170,180,70,70);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        mulButton=new JButton("x", null);      //mul
        mulButton.setBounds(240,180,70,70);
        mulButton.addActionListener(this);
        jf.add(mulButton);
        
        oneButton=new JButton("1", null);      //1 
        oneButton.setBounds(30,250,70,70);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2", null);       //2
        twoButton.setBounds(100,250,70,70);
        twoButton.addActionListener(this);
        jf.add(twoButton);
        
        threeButton=new JButton("3", null);     //3
        threeButton.setBounds(170,250,70,70);
        threeButton.addActionListener(this);
        jf.add(threeButton);
        

        addButton=new JButton("+", null);      //add
        addButton.setBounds(240,250,70,70);
        addButton.addActionListener(this);
        jf.add(addButton);

        dotButton=new JButton(".", null);
        dotButton.setBounds(30,320,70,70);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton=new JButton("0", null);
        zeroButton.setBounds(100,320,70,70);
        zeroButton.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        
        equalstoButton=new JButton("=", null);
        equalstoButton.setBounds(170,320,70,70);
        equalstoButton.addActionListener(this);
        jf.add(equalstoButton);

        subbButton=new JButton("-", null);      //subb
        subbButton.setBounds(240,320,70,70);
        subbButton.addActionListener(this);
        jf.add(subbButton);    
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


    }

    
    public static void main(String[] ra){
       new calcilayout();
    }
    

    
}
