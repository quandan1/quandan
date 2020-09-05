package com.eliteams.quick4j.test.dao;

import java.awt.*;
import javax.swing.*;
public class Jcalculation extends Frame
{
	int i;
	Font f=new Font("����",Font.BOLD,36);
	String[] str={"7","8","9","/",
		 	 	  "4","5","6","*",
		 		  "1","2","3","-",
		 		  ".","0","=","+"};
	JButton[] jbt=new JButton[16];
	JTextField jtf=new JTextField(20);
	JTextArea jta=new JTextArea(10,20);
	public Jcalculation(){
		super("hahah");
		JPanel cd = new JPanel();
        cd.setLayout(new FlowLayout());
		JButton display = new JButton("0");
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setPreferredSize(new Dimension(300,60));
	  	//display.setEnabled(false);
	  	display.setFont(f);
	  	JButton btC = new JButton("C");
	  	btC.setPreferredSize(new Dimension(100,60));
        cd.add(display);
        cd.add(btC);
      	add(cd, BorderLayout.NORTH);


		JPanel ct = new JPanel();
		ct.setLayout(new GridLayout(4,4));
		for(i=0;i<=15;i++)
		{
			jbt[i]=new JButton(str[i]);
			jbt[i].setFont(f);
			ct.add(jbt[i]);

		}
		add(ct, BorderLayout.CENTER);
		pack();

		//ct.add(jtf);
		//ct.add(jta);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	}

	private void setDefaultCloseOperation(int exitOnClose) {
	}

	public static void main(String args[])
	{
		new Jcalculation();
	}
}