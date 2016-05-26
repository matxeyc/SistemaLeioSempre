package com.br.testesDeUnidade;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({

		ArquivoTest.class, LivrosTest.class, 
		//PdfTest.class,
		})
public class AllTests {

}
