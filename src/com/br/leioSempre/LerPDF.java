package com.br.leioSempre;

import java.awt.Desktop;
import java.io.File;

import javax.swing.JOptionPane;

public class LerPDF {

	public void abrirPDF(String caminho) {
		try {
			Desktop.getDesktop().open(new File(caminho));
		} catch (Exception ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);

		}
	}
}
