package com.br.testesDeUnidade;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.br.leioSempre.LerPDF;
import com.br.leioSempre.Livros;

public class PdfTest {
	
	LerPDF pdf;
	
	@Before
	public void setUp() throws Exception {
		pdf= new LerPDF();
	}

	@Test
	public void abrirPDF() {
		assertEquals(true, pdf.abrirPDF("livro1.pdf"));
	}

	@Test
	public void abrirPDF2() {
		assertEquals(false, pdf.abrirPDF("livro5.pdf"));
	}


}
