package com.br.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import com.br.leioSempre.Arquivo;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_login;
	private JPasswordField passwordField;
	private static String tipoPacote;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLogin = new JLabel("Login:");
		
		textField_login = new JTextField();
		textField_login.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		
		passwordField = new JPasswordField();
		
		
		JRadioButton rdbtnPacote = new JRadioButton("Pacote 1");
		
		JRadioButton rdbtnPacote_1 = new JRadioButton("Pacote 2");
		
		JRadioButton rdbtnPacote_2 = new JRadioButton("Pacote 3");
		
		rdbtnPacote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tipoPacote = "1";
				
			}
		});
		
		rdbtnPacote_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tipoPacote = "2";
				
			}
		});
		
		rdbtnPacote_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tipoPacote = "3";
			}
		});
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String login = textField_login.getText();
				@SuppressWarnings("deprecation")
				String senha = passwordField.getText();
				
				
				Arquivo arq = new Arquivo();
				arq.escreverNoArquivo(login, senha,tipoPacote);
				arq.lerArquivo();
				JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
				dispose();
			
			}
		});
		btnCadastrar.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 22));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnPacote)
							.addGap(18)
							.addComponent(rdbtnPacote_1)
							.addGap(18)
							.addComponent(rdbtnPacote_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lblLogin)
									.addGap(18)
									.addComponent(textField_login, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lblSenha)
									.addGap(18)
									.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(60)
					.addComponent(btnCadastrar)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(textField_login, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnPacote)
						.addComponent(rdbtnPacote_1)
						.addComponent(rdbtnPacote_2))
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(btnCadastrar)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
