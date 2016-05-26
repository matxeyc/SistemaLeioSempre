package com.br.leioSempre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Livros {
	
	static OutputStreamWriter escrever;
	static FileOutputStream fileEscever;
	static BufferedWriter bufferedWriter;
	static FileReader arqLeitura;
	static BufferedReader lerArq;
	static String [] palavras;
	static boolean flagPL= false;
	String flagNomeAutor;
	String flagDescricao;	
	String flagCaminho;
	//String T�tulo;
	//String Autor;
	
	
	public String procurarCaminho(String titulo){
		try {
			arqLeitura = new FileReader("ArquivoLivros.txt");
			lerArq = new BufferedReader(arqLeitura);
			
			String linha ;
			
			
			do {
				linha = lerArq.readLine();
				if(linha != null){
					
					String [] palavras = linha.split(";");
					
					//System.out.println("caminho:"+caminho);
					//System.out.println("1:"+palavras[1]);
					if(palavras[0].equalsIgnoreCase(titulo) ){
						flagCaminho = palavras[2] ;
						
						
					}
					
				}
			}while (linha != null); 
			
		        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return flagCaminho;
		
	}
	
	public String procurarAutor(String titulo){
		
		
		try {
			arqLeitura = new FileReader("ArquivoLivros.txt");
			lerArq = new BufferedReader(arqLeitura);
			
			String linha ;
			
			
			do {
				linha = lerArq.readLine();
				if(linha != null){
					
					String [] palavras = linha.split(";");
					
					//System.out.println("caminho:"+caminho);
					//System.out.println("1:"+palavras[1]);
					if(palavras[0].equalsIgnoreCase(titulo) ){
						flagNomeAutor = palavras[1] ;//posi��o 1  autor
						
						
					}
					
				}
			}while (linha != null); 
			
		        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return flagNomeAutor;
		
	}
	
	public String procurarDescricao(String titulo){
		try {
			arqLeitura = new FileReader("ArquivoLivros.txt");
			lerArq = new BufferedReader(arqLeitura);
			
			String linha ;
			
			
			do {
				linha = lerArq.readLine();
				if(linha != null){
					
					String [] palavras = linha.split(";");
					
					System.out.println("caminho:"+flagCaminho);
					System.out.println("1:"+palavras[1]);
					if(palavras[0].equalsIgnoreCase(titulo) ){
						flagDescricao = palavras[3] ;
						//posi��o 0  T�tulo
						//posi��o 1  autor
						//posi��o 2  caminho
						//posi��o 3  Descri��o
						
						
					}
					
				}
			}while (linha != null); 
			
		        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return flagDescricao;
		
	}
	
	
	
	public boolean procurarLivro(String titulo){
		
		
		try {
			arqLeitura = new FileReader("ArquivoLivros.txt");
			lerArq = new BufferedReader(arqLeitura);
			
			String linha ;
			
			
			do {
				linha = lerArq.readLine();
				if(linha != null){
					
					String [] palavras = linha.split(";");
					
					System.out.println("titulo:"+titulo);
					System.out.println("1:"+palavras[1]);
					if(palavras[0].equalsIgnoreCase(titulo) ){
						flagPL = true;
					}
					
				}
			}while (linha != null); 
			
		        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return flagPL;
		
	}
	
	
	
	
	
	
	
	public void  salvarLivroNoArquivo(String titulo, String autor){
		try {		
			fileEscever = new FileOutputStream("ArquivoLivros.txt", true);//par�metro true escreve no arquivo sem substituir o que ja tem.
			escrever = new OutputStreamWriter(fileEscever);//Cria o objeto para escrever no arquivo
			bufferedWriter = new BufferedWriter(escrever);
			
			bufferedWriter.write(titulo+";");//seta o titulo no Arquivo
			bufferedWriter.write(autor+";");//seta o autor no Arquivo
			bufferedWriter.newLine();//Pula uma linha no arquivo pra quando for gravar o pr�ximo livro, gravar na linha seguinte.
			
			
			//O arquivo s� � salvo quando as opera��es s�o fechadas.
			bufferedWriter.close();
			escrever.close();
			fileEscever.close();
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
