package com.br.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_login;
	private JPasswordField passwordField;
	private JTextField textField_2;

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
		setBounds(100, 100, 450, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblLogin = new JLabel("Login:");
		
		textField_login = new JTextField();
		textField_login.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		
		passwordField = new JPasswordField();
		
		JRadioButton rdbtnPacote = new JRadioButton("Pacote 1");
		
		JRadioButton rdbtnPacote_1 = new JRadioButton("Pacote 2");
		
		JRadioButton rdbtnPacote_2 = new JRadioButton("Pacote 3");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String login = textField_login.getText();
				@SuppressWarnings("deprecation")
				String senha = passwordField.getText();
				Arquivo arq = new Arquivo();
				arq.escreverNoArquivo(login, senha);
				arq.lerArquivo();
				JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
				dispose();
			}
		});
		btnCadastrar.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 22));
		
		JLabel lblEmail = new JLabel("Email:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
								.addComponent(textField)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(passwordField, Alignment.LEADING)
									.addComponent(textField_login, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
							.addContainerGap(42, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnCadastrar)
							.addGap(137))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEmail)
							.addContainerGap(386, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblLogin)
							.addContainerGap(385, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSenha)
							.addContainerGap(380, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnPacote)
							.addGap(103)
							.addComponent(rdbtnPacote_1)
							.addPreferredGap(ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
							.addComponent(rdbtnPacote_2)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(textField_login, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnPacote)
						.addComponent(rdbtnPacote_1)
						.addComponent(rdbtnPacote_2))
					.addPreferredGap(ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
					.addComponent(btnCadastrar)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
