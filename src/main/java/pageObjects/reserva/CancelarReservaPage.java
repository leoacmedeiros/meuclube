package pageObjects.reserva;

import org.openqa.selenium.By;
import core.BasePage;


public class CancelarReservaPage extends BasePage {

	public void detalharReservaConfirmada() {
		clicarElementoScrollVisivel(By.xpath("(//span[contains(text(),'Confirmada')]//parent::span//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'DETALHES')])[1]"));
	}
	
	public void cancelarReserva() {
		clicarElementoScrollVisivel(By.xpath("//button//div[contains(text(),'Cancelar Reserva')]"));
	}
	
	public void clicarCancelarReserva() {
		clicarBotao(By.name("cmdConfirmar"));
	}

}