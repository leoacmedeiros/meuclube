package pageObjects.reserva;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;


public class AlterarReservaPage extends BasePage {

	public void detalharReservaConfirmada() {
		clicarElementoScrollVisivel(By.xpath("(//span[contains(text(),'Confirmada')]//parent::span//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'DETALHES')])[1]"));
	}
	
	public void clicarAlterarReserva() {
		clicarElementoScrollVisivel(By.xpath("//button//div[contains(text(),'Alterar Reserva')]"));
	}
	
	public void clicarPedirRevisaoReserva() {
		clicarBotao(By.name("cmdConfirmar"));
	}
	
	public void clicarAvancar() {
		clicarBotao(By.name("cmdAcao"));
	}

}