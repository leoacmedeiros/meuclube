package pageObjects.login;

import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class LoginPage extends BasePage {

	private static String TESTE = "http://tst01-cbtur.bancorbras.com.br/";

	public void acessarMeuClube() {
		DriverFactory.getDriver().get(TESTE);
	}

	public void setUsuario(String usuario) {
		escrever("iptUser", usuario);
	}

	public void setSenha(String senha) {
		escrever("iptpass", senha);
	}

	public void entrar() {
		clicarBotao(By.xpath("//button[@class='btn btnEnviar']"));
		sleep(5);
		clicarBotao(By.xpath("//button[contains(text(),'Pular')]"));
	}
	
	public boolean verificaPaginaInicial() {
		String cabecalho = obterTexto(By.xpath("//div[@class='app-header__mobile-menu']//img"));
		return cabecalho.contains("Bancorbrás");
	}

}
