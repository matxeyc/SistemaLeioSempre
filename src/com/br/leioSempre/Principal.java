package com.br.leioSempre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Principal {

	public static void main(String[] args){
		//File Diretorio = new File("Novo Diretório");
		//fileLogin.mkdir();//Criar Diretório
		//fileLogin.delete();//Deletar a pasta criada
		
		File fileLogin = new File("Arquivologin.txt");
		
		try {
			//fileLogin.createNewFile();Criar um arquivo
			
			
			FileWriter  fileEscrever = new FileWriter(fileLogin);
			
			BufferedWriter escrever = new BufferedWriter(fileEscrever);
			escrever.write("Escrevendo");
			
			escrever.close();
			fileEscrever.close();//Só salva o arquivo após fechar.
			
			
			FileReader ler= new FileReader(fileLogin);//Ler um arquivo
			BufferedReader lerBuffer = new BufferedReader(ler);
			String linha = lerBuffer.readLine();//Ler a primeira linha do arquivo
			
			
			
			while(linha!= null){
				System.out.println(linha);
				linha = lerBuffer.readLine();//Linha é igual a próxima linha
			} 
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
