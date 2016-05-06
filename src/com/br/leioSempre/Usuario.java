package com.br.leioSempre;

public class Usuario {

	@SuppressWarnings("unused")
	private String nome, email, senha;
	//String tipoPacote;

	public Usuario() {

	}

	public Usuario(String nome, String email, String senha, String tipoPacote) {

		this.setNome(nome);
		this.setEmail(email);
		this.senha = senha;
		//this.tipoPacote = tipoPacote;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
