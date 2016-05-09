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
	boolean flag= false;
	
	String caminho;
	String Título;
	String Autor;
	
	
	public String procurarCaminho(String titulo){
		try {
			arqLeitura = new FileReader("ArquivoLivros.txt");
			lerArq = new BufferedReader(arqLeitura);
			
			String linha ;
			
			
			do {
				linha = lerArq.readLine();
				if(linha != null){
					
					String [] palavras = linha.split(";");
					
					System.out.println("caminho:"+caminho);
					System.out.println("1:"+palavras[1]);
					if(palavras[0].equalsIgnoreCase(titulo) ){
						return palavras[2] ;
						
						
					}
					
				}
			}while (linha != null); 
			
		        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;
		
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
						return true;
						
						
					}
					
				}
			}while (linha != null); 
			
		        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	
	
	
	
	
	public void  salvarLivroNoArquivo(String titulo, String autor){
		try {		
			fileEscever = new FileOutputStream("ArquivoLivros.txt", true);//parâmetro true escreve no arquivo sem substituir o que ja tem.
			escrever = new OutputStreamWriter(fileEscever);//Cria o objeto para escrever no arquivo
			bufferedWriter = new BufferedWriter(escrever);
			
			bufferedWriter.write(titulo+";");//seta o titulo no Arquivo
			bufferedWriter.write(autor+";");//seta o autor no Arquivo
			bufferedWriter.newLine();//Pula uma linha no arquivo pra quando for gravar o próximo livro, gravar na linha seguinte.
			
			
			//O arquivo só é salvo quando as operações são fechadas.
			bufferedWriter.close();
			escrever.close();
			fileEscever.close();
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
