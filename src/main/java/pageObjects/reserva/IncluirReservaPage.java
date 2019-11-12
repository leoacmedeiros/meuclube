package pageObjects.reserva;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;

public class IncluirReservaPage extends BasePage {

	public void setPesquisa(String pesquisa) {
		escrever(By.xpath("//input[@aria-label='Digite a UF, cidade ou hotel']"), pesquisa);
		sleep(2);
		clicarBotao(By.xpath("(//div[contains(text(),'"+pesquisa+"')])[1]"));
	}

	public void clicarBotaoAplicar() {
		clicarBotao(By.xpath("//button//div[contains(text(),'Aplicar')]"));
	}
	
	public void selecionarVerQuartos() {
		clicarBotao(By.xpath("(//button//div[contains(text(),'Ver quartos')])[1]"));
	}
	
	public void clicarBotaoContinuar() {
		clicarBotao(By.xpath("//button//div[contains(text(),'CONTINUAR')]"));
	}
	
	public void informarQtdDiarias(String qtdDias) {
		escrever(By.xpath("(//div[contains(text(),'Executivo 3')]//parent::div//parent::div//input)[1]"), qtdDias);
		DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'Executivo 3')]//parent::div//parent::div//input)[1]")).sendKeys(Keys.TAB);;
		
	}
	
	public void clicarCheckAceitoTermos() {
		scrollElementoClicar(By.xpath("//div[@class='v-input__control']//input[@aria-label='Aceito os termos e políticas para reserva.'][@type='checkbox']"));
		sleep(2);
	}
	
	
	public void clicarBotaoSolicitarReserva() {
		clicarElementoScrollVisivel(By.xpath("//button//div[contains(text(),'Reserva')]"));
	}
	
	public void mensagemSucesso() {
		if (DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'reserva')])[1]")).getText().contains("Oba! A sua reserva está confirmada.")) {
			Assert.assertEquals("Oba! A sua reserva está confirmada.", obterTexto(By.xpath("//div[contains(text(),'Oba! A sua reserva está confirmada.')]")));
			
		} else if (DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'reserva')])[1]")).getText().contains("Ops! A sua reserva ainda não foi confirmada.")){
			Assert.assertEquals("Ops! A sua reserva ainda não foi confirmada.", obterTexto(By.xpath("//div[contains(text(),'Ops! A sua reserva ainda não foi confirmada.')]")));
		}

	}
	
	public void validarMenorPrecoVoo() {
		sleep(3);
		Boolean elementoVooPresente = DriverFactory.getDriver().findElements(By.xpath("//span[contains(text(),'Voos com descontos exclusivos!')]")).size() > 0;
		
		if (elementoVooPresente == true) {
			System.out.println("Menor Preço Voos: "+elementoVooPresente);
			sleep(3);
			Assert.assertEquals("Voos com descontos exclusivos!", obterTexto(By.xpath("//span[contains(text(),'Voos com descontos exclusivos!')]")));
			System.out.println("Ofertas de voos exibida: " + obterTexto(By.xpath("//span[contains(text(),'Voos com descontos exclusivos!')]")));
			
		} else {
			System.out.println("Menor Preço Voos: "+elementoVooPresente);
		}
	}
		
		
	public void validarMenorPrecoCarro() {
			sleep(3);
			Boolean elementoCarroPresente = DriverFactory.getDriver().findElements(By.xpath("//span[contains(text(),'Temos o carro ideal para sua viagem!')]")).size() > 0;
			
			if (elementoCarroPresente == true) {
				System.out.println("Menor Preço Carro: "+elementoCarroPresente);
				sleep(3);
				Assert.assertEquals("Temos o carro ideal para sua viagem!", obterTexto(By.xpath("//span[contains(text(),'Temos o carro ideal para sua viagem!')]")));
				System.out.println("Ofertas de Carro exibida: " + obterTexto(By.xpath("//span[contains(text(),'Temos o carro ideal para sua viagem!')]")));
				
			} else {
				System.out.println("Menor Preço Carro: "+elementoCarroPresente);
			}

		}
		
	
		
	
}