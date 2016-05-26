package com.br.leioSempre;

import java.awt.Desktop;
import java.io.File;

import javax.swing.JOptionPane;

public class LerPDF {
	boolean flagPDF = false;

	public boolean abrirPDF(String caminho) {
		try {
			Desktop.getDesktop().open(new File(caminho));
			flagPDF = true;
		} catch (Exception ex) {
			ex.printStackTrace();
			//JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
			return flagPDF;
		}
		return flagPDF;
	}
	
}
