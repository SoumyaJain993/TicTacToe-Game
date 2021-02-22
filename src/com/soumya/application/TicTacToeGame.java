package com.soumya.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TicTacToeGame implements ActionListener{
	// declaring all the instance variables
	JFrame jf1,jf;
	JButton jb11, jb22, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
	JLabel jlb1, jlb2;
	JTextField jtxt1, jtxt2;
	String str,name1,name2;
	Color colour;
	static int count;
	boolean win = false;

	public static void main(String[] args) {
		new TicTacToeGame();	
	}
	
	public TicTacToeGame() {
		// this frame gets displayed as soon as the game begins, user is asked to enter the name or directly enter the game,
		// upon clicking the button action listener is called
	    jf1 = new JFrame();
		jf1.setSize(350, 300);
		jf1.setLocationRelativeTo(null);
		jf1.setLayout(null);
		jlb1 = new JLabel("Enter 1st player name: ");
		jlb1.setBounds(20, 20, 150, 50);
		jlb2 = new JLabel("Enter 2nd player name: ");
		jlb2.setBounds(20, 80, 150, 50);
		jtxt1 = new JTextField();
		jtxt1.setBounds(200, 33, 100,25);
		jtxt2 = new JTextField();
		jtxt2.setBounds(200, 93, 100,25);
		jb11 = new JButton("Play Game");
		jb11.addActionListener(this);
		jb11.setBounds(20, 150, 100, 25);
		jb22 = new JButton("Skip >>");
		jb22.setBounds(200, 150, 100, 25);
		jb22.addActionListener(this);
		jf1.add(jlb1);
		jf1.add(jtxt1);
		jf1.add(jlb2);
		jf1.add(jtxt2);
		jf1.add(jb11);
		jf1.add(jb22);
		jf1.setVisible(true);
		
	}
// Action listener method	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ------------- Coding for 1st Frame -------------------
		if(e.getSource() == jb11)
		{
			name1 = jtxt1.getText();
			name2 = jtxt2.getText();
			if(name1.equals("") || name2.equals(""))
			{
				JOptionPane.showMessageDialog(jf, "Please enter player name");
			}
			else
			{
			JOptionPane.showMessageDialog(jf, "Hello "+name1 + " ,"+name2+" \nLet's begin the Game!");
			startGame();
			}
		}
		if(e.getSource() == jb22)
		{	
			name1 = "";
			name2 = "";
			startGame();
		}
		
		//--------------Coding for JFrame of Game ----------------
		if(!jf1.isVisible())
		{
			count += 1;
			if (count % 2 == 0) {
				str = "X";
				colour = Color.GREEN;
				if(e.getSource() == jb11)
					name1 = jtxt1.getText();
				
			} else {
				str = "O";
				colour = Color.RED;
				if(e.getSource() == jb11)
					name2 = jtxt2.getText();
			}
			// background and display of icon 'X' or 'O' is defined for each button
			Font font = new Font("Arial", 1, 50);

			if (e.getSource() == jb1) {
				jb1.setText(str);
				jb1.setBackground(colour);
				jb1.setFont(font);
				jb1.setEnabled(false);
			}
			if (e.getSource() == jb2) {
				jb2.setText(str);
				jb2.setBackground(colour);
				jb2.setFont(font);
				jb2.setEnabled(false);
			}

			if (e.getSource() == jb3) {
				jb3.setText(str);
				jb3.setBackground(colour);
				jb3.setFont(font);
				jb3.setEnabled(false);

			}

			if (e.getSource() == jb4) {
				jb4.setText(str);
				jb4.setBackground(colour);
				jb4.setFont(font);
				jb4.setEnabled(false);
			}

			if (e.getSource() == jb5) {
				jb5.setText(str);
				jb5.setBackground(colour);
				jb5.setFont(font);
				jb5.setEnabled(false);
			}

			if (e.getSource() == jb6) {
				jb6.setText(str);
				jb6.setBackground(colour);
				jb6.setFont(font);
				jb6.setEnabled(false);
			}

			if (e.getSource() == jb7) {
				jb7.setText(str);
				jb7.setBackground(colour);
				jb7.setFont(font);
				jb7.setEnabled(false);
			}

			if (e.getSource() == jb8) {
				jb8.setText(str);
				jb8.setBackground(colour);
				jb8.setFont(font);
				jb8.setEnabled(false);
			}

			if (e.getSource() == jb9) {
				jb9.setText(str);
				jb9.setBackground(colour);
				jb9.setFont(font);
				jb9.setEnabled(false);
			}
			// as players click on their choices winPossibilities method gets called to check if any player is winning 
				winPossibilities();
		}	
	}
	// players click on the button turn by turn and action listener is invoked on each button call
	void startGame()
	{
		count =0;
		jf1.setVisible(false);
		jf = new JFrame("Let's play Tic Tac Toe");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(450, 450);
		jf.setLocationRelativeTo(null);
		jf.setLayout(new GridLayout(3,3));
		
		jb1 = new JButton();
		jb1.addActionListener(this);
		jf.add(jb1);
		
		jb2 = new JButton();
		jb2.addActionListener(this);
		jf.add(jb2);
		
		jb3 = new JButton();
		jb3.addActionListener(this);
		jf.add(jb3);
		
		jb4 = new JButton();
		jb4.addActionListener(this);
		jf.add(jb4);
		
		jb5 = new JButton();
		jb5.addActionListener(this);
		jf.add(jb5);
		
		jb6 = new JButton();
		jb6.addActionListener(this);
		jf.add(jb6);
		
		jb7 = new JButton();
		jb7.addActionListener(this);
		jf.add(jb7);
		
		jb8 = new JButton();
		jb8.addActionListener(this);
		jf.add(jb8);
		
		jb9 = new JButton();
		jb9.addActionListener(this);
		jf.add(jb9);
		jf.setVisible(true);
}

	void winPossibilities() {
		// total 8 winning combinations are defined here - 3 for row, 3 for column and 2 for diagonal
		//possibility of winning in a row
		if(jb1.getText() != "" && jb1.getText() == jb2.getText() && jb2.getText() == jb3.getText() )
		{
			win = true;
		}
		else if(jb4.getText() == jb5.getText() && jb5.getText() == jb6.getText() && jb4.getText() != "")
		{
			win = true;
		}
		else if(jb7.getText() == jb8.getText() && jb8.getText() == jb9.getText() && jb7.getText() != "")
		{
			win = true;
		}	
		// possibility of winning in a column
		else if(jb1.getText() == jb4.getText() && jb4.getText() == jb7.getText() && jb1.getText() != "")
		{
			win = true;
		}
		else if(jb2.getText() == jb5.getText() && jb5.getText() == jb8.getText() && jb2.getText() != "")
		{
			win = true;
		}
		else if(jb3.getText() == jb6.getText() && jb6.getText() == jb9.getText() && jb3.getText() != "")
		{
			win = true;
		}	
		// winning diagonally
		else if(jb1.getText() == jb5.getText() && jb5.getText() == jb9.getText() && jb1.getText() != "")
		{
			win = true;
		}
		else if(jb3.getText() == jb5.getText() && jb5.getText() == jb7.getText() && jb3.getText() != "")
		{
			win = true;
		}
		else
		{
			win = false;
		}
		whoWins();  // this method gets called to check which player is winning and to display the winning player's name
	}	
	void whoWins()
	{
		if(win == true && str == "X")
		{
			if(!name1.equals("")) {
			JOptionPane.showMessageDialog(jf, name1 + " Wins!!!"); // if player1 wins, his/her name is displayed
			restartGame(); // this method is called to start the game again
			}
			else
			{
				JOptionPane.showMessageDialog(jf, str + " Wins!!!"); // if you play as anonymous 1st player, then 'X' wins is displayed
				restartGame();
			}
		}
		else if(win == true && str == "O")
		{
			if(!name2.equals("")) {
				JOptionPane.showMessageDialog(jf, name2 + " Wins!!!"); // if player1 wins, his/her name is displayed
				restartGame();
				}
			else
			{
			JOptionPane.showMessageDialog(jf, str + " Wins!!!"); // if you play as anonymous 2nd player, then 'O' wins is displayed
			restartGame();
			}
		}
		else if(win == false && count == 9)
		{
			JOptionPane.showMessageDialog(jf, "Match Draw");
			restartGame();
		}
	}
	void restartGame()
	{
		int i = JOptionPane.showConfirmDialog(jf, "Do you want to play again?");
		if(i == 0) // if Player enters Yes
		{
		    int j = JOptionPane.showConfirmDialog(jf, "Play as new User, press Yes"); // User is asked if he wants to play as a new Player or continue as existing player
		    if(j == 0)            // if he/she wishes to play as new Player, then again Player names are asked for and game is started                                                     
		    {
		    	jf.setVisible(false);
		    	new TicTacToeGame();
		    	
		    }
		    if(j == 0 || j == 1) // if user wishes to play as new user or continue as new user and start as fresh game clearAll() method gets called
		    { 
				clearAll();      
		    }
		    if(j == 2)  // if player wants to cancel the game then game is freezed and user may close the window
		    {
		    	disableAll();     	
		    }
		}
		else if(i == 1) // if user is not interested in playing another game, he/she may press "No" to exit.
		{
			System.exit(0);
		}
		else 
		{
			disableAll();  // if user presses Cancel then game is freezed and user may close the window
			
		}
		
	}
	void clearAll()  // this method is used to clear all the previously played game data
	{
		str = "";
		colour = null;
		count = 1;
		win = false;

		jb1.setText(str);
		jb1.setBackground(colour);
		jb1.setEnabled(true);

		jb2.setText(str);
		jb2.setBackground(colour);
		jb2.setEnabled(true);

		jb3.setText(str);
		jb3.setBackground(colour);
		jb3.setEnabled(true);

		jb4.setText(str);
		jb4.setBackground(colour);
		jb4.setEnabled(true);

		jb5.setText(str);
		jb5.setBackground(colour);
		jb5.setEnabled(true);

		jb6.setText(str);
		jb6.setBackground(colour);
		jb6.setEnabled(true);

		jb7.setText(str);
		jb7.setBackground(colour);
		jb7.setEnabled(true);

		jb8.setText(str);
		jb8.setBackground(colour);
		jb8.setEnabled(true);

		jb9.setText(str);
		jb9.setBackground(colour);
		jb9.setEnabled(true);
	}
	void disableAll() // if user cancels the game then all the fields get disabled
	{
		jb1.setEnabled(false);
		jb2.setEnabled(false);
		jb3.setEnabled(false);
		jb4.setEnabled(false);
		jb5.setEnabled(false);
		jb6.setEnabled(false);
		jb7.setEnabled(false);
		jb8.setEnabled(false);
		jb9.setEnabled(false);
	}
}
