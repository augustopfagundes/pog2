package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class Login {

	private JFrame frmLogin;
	private JTextField txtEmail;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login ");
		frmLogin.setBounds(100, 100, 387, 489);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(new GridLayout(2, 1, 0, 20));
		
		JPanel panel_1 = new JPanel();
		frmLogin.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new GridLayout(1, 5, 20, 0));
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		panel_5.add(btnEntrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		panel_5.add(btnCancelar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		panel_5.add(btnCadastrar);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		flowLayout_1.setVgap(20);
		panel_6.add(panel_7);
		
		JLabel lblNewLabel_7 = new JLabel("SEJA BEM-VINDO AO BINGO ONLINE");
		lblNewLabel_7.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		panel_7.add(lblNewLabel_7);
		
		JPanel panel_8 = new JPanel();
		panel_6.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 15));
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		panel_8.add(lblEmail);
		
		txtEmail = new JTextField();
		panel_8.add(txtEmail);
		txtEmail.setColumns(20);
		
		JPanel panel_9 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_9.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(20);
		flowLayout.setHgap(30);
		panel_6.add(panel_9);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		panel_9.add(lblSenha);
		
		txtSenha = new JTextField();
		panel_9.add(txtSenha);
		txtSenha.setColumns(20);
		
		JPanel panel_10 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_10.getLayout();
		flowLayout_2.setVgap(1);
		panel_6.add(panel_10);
		
		JPanel panel = new JPanel();
		frmLogin.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 20));
		
		JLabel lblNewLabel = new JLabel("Records do m\u00EAs");
		lblNewLabel.setFont(new Font("Leelawadee", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 2, 0, 10));
		
		JLabel lblPrimeiroLugar = new JLabel("Maria");
		lblPrimeiroLugar.setBackground(Color.WHITE);
		lblPrimeiroLugar.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		lblPrimeiroLugar.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblPrimeiroLugar);
		
		JLabel lblPontuacaoPrimeiro = new JLabel("13");
		lblPontuacaoPrimeiro.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		lblPontuacaoPrimeiro.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblPontuacaoPrimeiro);
		
		JLabel lblSegundoLugar = new JLabel("Antonio");
		lblSegundoLugar.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		lblSegundoLugar.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblSegundoLugar);
		
		JLabel lblPontuacaoSegundo = new JLabel("5");
		lblPontuacaoSegundo.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		lblPontuacaoSegundo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblPontuacaoSegundo);
		
		JLabel lblTerceiroLugar = new JLabel("Isabel");
		lblTerceiroLugar.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		lblTerceiroLugar.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblTerceiroLugar);
		
		JLabel lblPontuacaoTerceiro = new JLabel("4");
		lblPontuacaoTerceiro.setFont(new Font("Leelawadee", Font.PLAIN, 18));
		lblPontuacaoTerceiro.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblPontuacaoTerceiro);
	}

}
