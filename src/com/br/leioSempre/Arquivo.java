package com.br.leioSempre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class Arquivo {
	
	
	static OutputStreamWriter escrever;
	static FileOutputStream fileEscever;
	static BufferedWriter bufferedWriter;
	static FileReader arqLeitura;
	static BufferedReader lerArq;
	static String [] palavras;
	boolean flag= false;
	
	public boolean verificarLogin(String login, String senha){
		try {
			arqLeitura = new FileReader("C:\\Users\\Katiúscia Lima\\workspace\\Leio Sempre\\Arquivologin.txt");
			lerArq = new BufferedReader(arqLeitura);
			
			String linha ;
			
			
			do {
				linha = lerArq.readLine();
				if(linha != null){
					
					String [] palavras = linha.split(";");
					
					System.out.println("login:"+login);
					System.out.println("1:"+palavras[1]);
					System.out.println("senha:"+senha);
					if(palavras[0].equalsIgnoreCase(login) && palavras[1].equalsIgnoreCase(senha) ){
						return true;
						
						
					}
					
				}
			}while (linha != null); 
			
		        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	
	public void lerArquivo(){
		try {
			arqLeitura = new FileReader("C:\\Users\\Katiúscia Lima\\workspace\\Leio Sempre\\Arquivologin.txt");
			lerArq = new BufferedReader(arqLeitura);
			
			String linha ;
			
			
			do {
				linha = lerArq.readLine();
				if(linha != null){
					String [] palavras = linha.split(";");
					for (int i=0 ; i<palavras.length ; i++){
			        	System.out.println(palavras[i]);
			        	
			        }
				}
			}while (linha != null); 
		        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public void  escreverNoArquivo(String login, String senha/*, String tipoPacote*/){
		try {		
			fileEscever = new FileOutputStream("C:\\Users\\Katiúscia Lima\\workspace\\Leio Sempre\\Arquivologin.txt", true);//parâmetro true escreve no arquivo sem substituir o que ja tem.
			escrever = new OutputStreamWriter(fileEscever);//Cria o objeto para escrever no arquivo
			bufferedWriter = new BufferedWriter(escrever);
			
			bufferedWriter.write(login+";");//seta o login no Arquivo
			bufferedWriter.write(senha+";");//seta a senha no Arquivo
			bufferedWriter.newLine();//Pula uma linha no arquivo pra quando for gravar o próximo contato, gravar na linha seguinte.
			
			
			//O arquivo só é salvo quando as operações são fechadas.
			bufferedWriter.close();
			escrever.close();
			fileEscever.close();
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}

