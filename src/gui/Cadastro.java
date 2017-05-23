package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Font;

public class Cadastro {

	private JFrame frmCadastro;
	private JTextField txtEmailCadastro;
	private JTextField txtConfirmacao;
	private JTextField txtSenhaCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frmCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastro = new JFrame();
		frmCadastro.setTitle("Cadastro");
		frmCadastro.setBounds(100, 100, 450, 445);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastro.getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		frmCadastro.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setHgap(45);
		flowLayout.setVgap(40);
		panel_1.add(panel_3);
		
		JLabel lblEmailCadastro = new JLabel("E-mail");
		lblEmailCadastro.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblEmailCadastro.setToolTipText("");
		panel_3.add(lblEmailCadastro);
		
		txtEmailCadastro = new JTextField();
		txtEmailCadastro.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		panel_3.add(txtEmailCadastro);
		txtEmailCadastro.setColumns(20);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setHgap(50);
		flowLayout_2.setVgap(25);
		panel_1.add(panel_4);
		
		JLabel lblSenhaCadastro = new JLabel("Senha");
		lblSenhaCadastro.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblSenhaCadastro.setToolTipText("");
		panel_4.add(lblSenhaCadastro);
		
		txtSenhaCadastro = new JTextField();
		txtSenhaCadastro.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		panel_4.add(txtSenhaCadastro);
		txtSenhaCadastro.setColumns(20);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setHgap(10);
		flowLayout_1.setVgap(20);
		panel_1.add(panel_2);
		
		JLabel lblConfirmacao = new JLabel("Confirma\u00E7\u00E3o");
		lblConfirmacao.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		panel_2.add(lblConfirmacao);
		
		txtConfirmacao = new JTextField();
		txtConfirmacao.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		panel_2.add(txtConfirmacao);
		txtConfirmacao.setColumns(20);
		
		JPanel panel = new JPanel();
		frmCadastro.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_6.getLayout();
		flowLayout_4.setVgap(0);
		panel.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_7.getLayout();
		flowLayout_3.setVgap(0);
		flowLayout_3.setHgap(40);
		panel.add(panel_7);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		panel_7.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		panel_7.add(btnCancelar);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
	}

}
