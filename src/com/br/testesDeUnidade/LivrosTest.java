package com.br.testesDeUnidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.br.leioSempre.Livros;

public class LivrosTest {
	
	Livros lvr;

	@Before
	public void setUp() throws Exception {
		lvr= new Livros();
	}

	@Test
	public void testProcurarLivro() {
		assertEquals(true, lvr.procurarLivro("livro1"));
	}
	
	@Test
	public void testProcurarCaminho(){
		assertEquals("livro1.pdf" ,lvr.procurarCaminho("livro1"));
	}
	
	@Test
	public void testProcurarAutor(){
		assertEquals("Matheus",lvr.procurarAutor("livro1"));
	}
	
	@Test
	public void testeprocurarDescricao(){
		
		assertEquals("Jogo da Velha em java", lvr.procurarDescricao("livro1"));
	}

}
