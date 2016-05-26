package com.br.testesDeUnidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.*;

import com.br.leioSempre.Arquivo;

public class ArquivoTest {
	Arquivo arq;
	
	@Before
	public void setUp() throws Exception {
		 arq= new Arquivo();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testVerificarLogin() {
			assertEquals(true, arq.verificarLogin("Matheus", "123"));
	}

}
