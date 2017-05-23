package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Jogo {

	private JFrame frmCartelaBingo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jogo window = new Jogo();
					window.frmCartelaBingo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Jogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCartelaBingo = new JFrame();
		frmCartelaBingo.setTitle("Cartela - Bingo");
		frmCartelaBingo.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(15);
		frmCartelaBingo.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JLabel lblMensagem = new JLabel("Numero sorteado: ");
		lblMensagem.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		panel.add(lblMensagem);
		
		JLabel lblMensagemConteudo = new JLabel("3");
		lblMensagemConteudo.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		panel.add(lblMensagemConteudo);
		
		JPanel panel_1 = new JPanel();
		frmCartelaBingo.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(6, 5, 0, 0));
		
		JButton btnB = new JButton("B");
		btnB.setFont(new Font("Leelawadee", Font.BOLD, 20));
		panel_1.add(btnB);
		
		JButton btnI = new JButton("I");
		btnI.setFont(new Font("Leelawadee", Font.BOLD, 20));
		panel_1.add(btnI);
		
		JButton btnN = new JButton("N");
		btnN.setFont(new Font("Leelawadee", Font.BOLD, 20));
		panel_1.add(btnN);
		
		JButton btnG = new JButton("G");
		btnG.setFont(new Font("Leelawadee", Font.BOLD, 20));
		panel_1.add(btnG);
		
		JButton btnO = new JButton("O");
		btnO.setFont(new Font("Leelawadee", Font.BOLD, 20));
		panel_1.add(btnO);
		
		JButton btnNumero = new JButton("N");
		btnNumero.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero);
		
		JButton btnNumero2 = new JButton("N");
		btnNumero2.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero2);
		
		JButton btnNumero3 = new JButton("N");
		btnNumero3.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero3);
		
		JButton btnNumero4 = new JButton("N");
		btnNumero4.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero4);
		
		JButton btnNumero5 = new JButton("N");
		btnNumero5.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero5);
		
		JButton btnNumero6 = new JButton("N");
		btnNumero6.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero6);
		
		JButton btnNumero7 = new JButton("N");
		btnNumero7.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero7);
		
		JButton btnNumero8 = new JButton("N");
		btnNumero8.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero8);
		
		JButton btnNumero9 = new JButton("N");
		btnNumero9.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero9);
		
		JButton btnNumero10 = new JButton("N");
		btnNumero10.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero10);
		
		JButton btnNumero11 = new JButton("N");
		btnNumero11.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero11);
		
		JButton btnNumero12 = new JButton("N");
		btnNumero12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNumero12.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero12);
		
		JButton btnBINGO = new JButton("BINGO");
		btnBINGO.setFont(new Font("Leelawadee", Font.BOLD, 17));
		panel_1.add(btnBINGO);
		
		JButton btnNumero13 = new JButton("N");
		btnNumero13.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero13);
		
		JButton btnNumero14 = new JButton("N");
		btnNumero14.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero14);
		
		JButton btnNumero15 = new JButton("N");
		btnNumero15.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero15);
		
		JButton btnNumero16 = new JButton("N");
		btnNumero16.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero16);
		
		JButton btnNumero17 = new JButton("N");
		btnNumero17.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero17);
		
		JButton btnNumero18 = new JButton("N");
		btnNumero18.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero18);
		
		JButton btnNumero19 = new JButton("N");
		btnNumero19.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero19);
		
		JButton btnNumero20 = new JButton("N");
		btnNumero20.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero20);
		
		JButton btnNumero21 = new JButton("N");
		btnNumero21.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero21);
		
		JButton btnNumero22 = new JButton("N");
		btnNumero22.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero22);
		
		JButton btnNumero23 = new JButton("N");
		btnNumero23.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero23);
		
		JButton btnNumero24 = new JButton("N");
		btnNumero24.setFont(new Font("Leelawadee", Font.PLAIN, 15));
		panel_1.add(btnNumero24);
	}

}
