package pageObjects.reserva;

import org.openqa.selenium.By;
import core.BasePage;
import org.junit.Assert;



public class DetalharReservaPaginaInicialPage extends BasePage {

	public void detalharReservaConfirmadaPaginaInicial() {
		clicarBotao(By.xpath("(//div[contains(text(),'Minhas Reservas')]//parent::div//parent::div//div[contains(text(),'Detalhes')])[1]"));
	}
	
	public void validarTituloHospedeResp() {
		sleep(3);
		Assert.assertEquals("Hóspede responsável", obterTexto(By.xpath("//div[contains(text(),'Hóspede responsável')]")));
		
	}
}