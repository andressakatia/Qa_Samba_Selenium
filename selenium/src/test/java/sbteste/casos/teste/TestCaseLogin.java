package sbteste.casos.teste;

import java.util.logging.Level;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sbteste.util.AbstractSetDrivers;

public class TestCaseLogin extends AbstractSetDrivers{
	private static final String URL_TEST = "http://web1.qa.sambatech.com:10000/";

	private static TestCaseLoginImpl testCaseLoginImpl;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testCaseLoginImpl = TestCaseLoginImpl.instance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		setDriverGoogleChrome(URL_TEST);
		//setDriverFireFox(URL_TEST);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testGoogleChrome() {
		try {
			testCaseLoginImpl.inicioTest(driverGoogleChrome);
		} catch (InterruptedException e) {
			e.printStackTrace();
			LOGGER.log(Level.SEVERE, "Erro ao executar teste no google chrome");
		}
	}
	 
	@Test
	public void parametroFireFox() {
/*		try {
			testCaseLoginImpl.inicioTest(driverFireFox);
		} catch (InterruptedException e) {
			e.printStackTrace();
			LOGGER.log(Level.SEVERE, "Erro ao executar teste no FireFox");
		}*/
	}

}
