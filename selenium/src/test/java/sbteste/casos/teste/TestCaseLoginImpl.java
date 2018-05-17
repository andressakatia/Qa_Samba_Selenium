package sbteste.casos.teste;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCaseLoginImpl {
	protected static final Logger LOGGER = Logger.getLogger( TestCaseLoginImpl.class.getName() );
	
	public static TestCaseLoginImpl instance() {
		return new TestCaseLoginImpl();
	}
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException 
	 */
	public void inicioTest(WebDriver driver) throws InterruptedException {
		this.loginEmailInvalido(driver);
		this.loginEmailNaoCadastrado(driver);
		this.loginSenhaErrada(driver);
		this.loginEmailVazio(driver);
		this.loginSenhaVazia(driver);
		this.login(driver);
		this.esqueciSenha(driver);
		this.conectado(driver);
		this.centralSuporte(driver);
		this.sambaTech(driver);
		this.sambaVideos(driver);
		this.finalizarTest(driver);
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException > tive que adicionar o Thread.sleep(1000) pois vi que somente estava dando certo ao debugar, 
	 * então deduzi que estava rodando o teste antes de terminar de abrir o navegador - não estava tendo tempo.
	 */ 
	private void loginEmailInvalido(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		Thread.sleep(2000);
		WebElement inputEmail = driver.findElement(By.id("inputEmail"));
		inputEmail.sendKeys("avaliacao_qa_samba");
		WebElement inputPassword = driver.findElement(By.id("inputPassword"));
		inputPassword.sendKeys("123456789");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		LOGGER.log(Level.INFO, "Teste com email inválido realizado com sucesso.");
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void loginEmailNaoCadastrado(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		Thread.sleep(1000);
		WebElement inputEmail = driver.findElement(By.id("inputEmail"));
		inputEmail.sendKeys("andressakatia@gmail.com");
		WebElement inputPassword = driver.findElement(By.id("inputPassword"));
		inputPassword.sendKeys("123456789");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		LOGGER.log(Level.INFO, "Teste com email não cadastrado realizado com sucesso.");

	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void loginSenhaErrada(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		Thread.sleep(1000);
		WebElement inputEmail = driver.findElement(By.id("inputEmail"));
		inputEmail.sendKeys("avaliacao_qa_samba@sambatech.com.br");
		WebElement inputPassword = driver.findElement(By.id("inputPassword"));
		inputPassword.sendKeys("0987654321");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		LOGGER.log(Level.INFO, "Teste com senha incorreta realizado com sucesso.");
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void loginEmailVazio(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		Thread.sleep(1000);
		WebElement inputEmail = driver.findElement(By.id("inputEmail"));
		inputEmail.clear();
		WebElement inputPassword = driver.findElement(By.id("inputPassword"));
		inputPassword.sendKeys("123456789");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		LOGGER.log(Level.INFO, "Teste com o campo email vazio realizado com sucesso.");
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void loginSenhaVazia(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		Thread.sleep(1000);
		WebElement inputEmail = driver.findElement(By.id("inputEmail"));
		inputEmail.sendKeys("avaliacao_qa_samba@sambatech.com.br");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		LOGGER.log(Level.INFO, "Teste com o campo senha vazio realizado com sucesso.");
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void login(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		Thread.sleep(1000);
		WebElement inputEmail = driver.findElement(By.id("inputEmail"));
		inputEmail.clear();
		inputEmail.sendKeys("avaliacao_qa_samba@sambatech.com.br");
		WebElement inputPassword = driver.findElement(By.id("inputPassword"));
		inputPassword.sendKeys("123456789");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		LOGGER.log(Level.INFO, "Teste com login correto efetuado com sucesso.");
		Thread.sleep(3000);
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void esqueciSenha(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		Thread.sleep(5000);
		driver.navigate().back();
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		Thread.sleep(1000);
		WebElement selectRedefinirSenha = driver.findElement(By.id("forgot-pwd-link"));
		selectRedefinirSenha.click();
		LOGGER.log(Level.INFO, "Teste acesso ao link 'Esqueci minha senha' efetuado com sucesso.");
		Thread.sleep(3000);
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void centralSuporte(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement selectSuporte = driver.findElement(By.id("support-central"));
		selectSuporte.click();
		LOGGER.log(Level.INFO, "Teste acesso ao link 'Central de Suporte' efetuado com sucesso.");
		Thread.sleep(1000);
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void sambaTech(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement selectSambaTech = driver.findElement(By.id("sambatech-logo"));
		selectSambaTech.click();
		LOGGER.log(Level.INFO, "Teste acesso ao link 'SAMBATECH' efetuado com sucesso.");
		Thread.sleep(1000);
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void sambaVideos(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement selectSambaVideos = driver.findElement(By.id("know-samba"));
		selectSambaVideos.click();
		LOGGER.log(Level.INFO, "Teste acesso ao link 'Conheça do Samba Vídeos' efetuado com sucesso.");
		Thread.sleep(3000);
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void conectado(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Adicionando Sleep na Thread");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement inputEmail = driver.findElement(By.id("inputEmail"));
		inputEmail.clear();
		inputEmail.sendKeys("avaliacao_qa_samba@sambatech.com.br");
		WebElement inputPassword = driver.findElement(By.id("inputPassword"));
		inputPassword.sendKeys("123456789");
		WebElement ManterConectado = driver.findElement(By.id("rememeberMe"));
		ManterConectado.click();
		Thread.sleep(1000);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		LOGGER.log(Level.INFO, "Teste check 'Mantenha-me conectado' efetuado com sucesso.");
		Thread.sleep(3000);
	}
	
	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private void finalizarTest(WebDriver driver) throws InterruptedException {
		LOGGER.log(Level.INFO, "Finalizando Teste.");
		Thread.sleep(3000);
		driver.quit();
	}
	
}
