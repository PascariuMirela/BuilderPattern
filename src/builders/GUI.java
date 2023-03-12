package builders;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.SwingConstants;

import builders.Casa;
import builders.CasaBuilder;
import builders.CasaEngineer;
import builders.OldCasaBuilder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.List;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import java.awt.CardLayout;
import java.awt.Canvas;
import java.awt.ComponentOrientation;
import java.awt.Label;
import javax.swing.JSplitPane;
import javax.swing.*;
import java.awt.event.*;
import builders.*;




class GUI extends JFrame implements ActionListener{
	
	
	
	public static Casa casa;
	static JLabel frame;
	
	
	
	JLabel casa_simpla=new JLabel("");
	JButton b_casa_simpla;
	JButton copaci;
	JButton piscina;
	JButton garaj;
	JButton statui;
	private JTextField txtCasaSimpla=new JTextField();
	private JTextField txtAlegetiCeDoriti;
	

	
	GUI()
	{
		
		//GUI 
		
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		casa_simpla.setBackground(new Color(0, 0, 0));
		casa_simpla.setBounds(0, 115, 307, 192);
		Image casa_simpla_image=new ImageIcon(this.getClass().getResource("/casa_simpla.jpg")).getImage();
		casa_simpla.setIcon(new ImageIcon(casa_simpla_image));
		getContentPane().add(casa_simpla);
		
		//BUTON COPACI 
		
		JButton buton_copaci = new JButton("COPACI");
		buton_copaci.setBackground(new Color(192, 192, 192));
		buton_copaci.setForeground(new Color(0, 128, 0));
		buton_copaci.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		
		buton_copaci.addActionListener(this);
		
		buton_copaci.setBounds(317, 95, 89, 23);
		getContentPane().add(buton_copaci);
		//BUTON PISCINA
		JButton buton_piscina = new JButton("PISCINA");
		buton_piscina.setBackground(new Color(192, 192, 192));
		buton_piscina.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buton_piscina.setForeground(new Color(0, 158, 234));
		
		
		buton_piscina.addActionListener(this);
		buton_piscina.setBounds(317, 144, 89, 23);
		getContentPane().add(buton_piscina);
		//BUTON GARAJ
		JButton buton_garaj = new JButton("GARAJ");
		buton_garaj.setBackground(new Color(192, 192, 192));
		buton_garaj.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buton_garaj.setForeground(new Color(102, 0, 0));
		
		buton_garaj.addActionListener(this);
		buton_garaj.setBounds(317, 192, 89, 23);
		getContentPane().add(buton_garaj);
		//BUTON STATUI
		JButton buton_statui = new JButton("STATUI");
		buton_statui.setFont(new Font("Times New Roman", Font.BOLD, 15));
		buton_statui.setBackground(new Color(192, 192, 192));
		buton_statui.setForeground(new Color(105, 105, 105));
		
		buton_statui.addActionListener(this);
		buton_statui.setBounds(317, 243, 89, 23);
		getContentPane().add(buton_statui);
		txtCasaSimpla.setBorder(null);
		txtCasaSimpla.setCaretColor(new Color(255, 255, 255));
		
		
		txtCasaSimpla.setHorizontalAlignment(SwingConstants.CENTER);
		txtCasaSimpla.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtCasaSimpla.setText("Casa simpla");
		txtCasaSimpla.setBounds(0, 51, 191, 84);
		getContentPane().add(txtCasaSimpla);
		txtCasaSimpla.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(238, 0, 9, 307);
		getContentPane().add(separator);
		
		txtAlegetiCeDoriti = new JTextField();
		txtAlegetiCeDoriti.setBorder(null);
		txtAlegetiCeDoriti.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtAlegetiCeDoriti.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlegetiCeDoriti.setText("Alegeti ce doriti");
		txtAlegetiCeDoriti.setBounds(243, 30, 229, 23);
		getContentPane().add(txtAlegetiCeDoriti);
		txtAlegetiCeDoriti.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("sa puneti la casa:");
		lblNewLabel.setBorder(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(238, 51, 234, 23);
		getContentPane().add(lblNewLabel);
		
		
	}
		


		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand()=="Copaci")
			{
			
			System.out.println("Copaci adaugati");
			
			Image casa_copaci=new ImageIcon(this.getClass().getResource("/casa_copaci.jpg")).getImage();
			casa_simpla.setIcon(new ImageIcon(casa_copaci));
			txtCasaSimpla.setText("Casa cu copaci");
			
			}
			
			
			if(e.getActionCommand()=="Piscina")
			{
			System.out.println("Piscina adaugata");
			Image casa_piscina=new ImageIcon(this.getClass().getResource("/casa_piscina.jpg")).getImage();
			casa_simpla.setIcon(new ImageIcon(casa_piscina));
			txtCasaSimpla.setText("Casa cu piscina");
			
			
			}
			
			
			if(e.getActionCommand()=="Garaj")
			{
				
			
			System.out.println("Garaj adaugat");
			Image casa_garaj=new ImageIcon(this.getClass().getResource("/casa_garaj.jpg")).getImage();
			casa_simpla.setIcon(new ImageIcon(casa_garaj));
			txtCasaSimpla.setText("Casa cu garaj");
			
			
			}
			
			
			if(e.getActionCommand()=="Statui")
			{
			
			
			System.out.println("Statui adaugate");
			Image casa_statui=new ImageIcon(this.getClass().getResource("/casa_statui.jpg")).getImage();
			casa_simpla.setIcon(new ImageIcon(casa_statui));
			txtCasaSimpla.setText("Casa cu statui");
			
			
			}
			
		}

	public static void main(String[] args) {
	
	
	GUI f=new GUI();
	f.setVisible(true);
	
	
	CasaBuilder oldStyleCasa=new OldCasaBuilder();
	
	CasaEngineer casaEngineer= new CasaEngineer(oldStyleCasa);
	casaEngineer.makeCasa();
	Casa casa = casaEngineer.getCasa();
	
	casaEngineer.makeCasa();
	System.out.println("Casa construita!");
	
	}
}