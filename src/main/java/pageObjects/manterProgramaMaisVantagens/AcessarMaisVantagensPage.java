package pageObjects.manterProgramaMaisVantagens;

import org.openqa.selenium.By;

import core.BasePage;

public class AcessarMaisVantagensPage extends BasePage {

	public void acessarMaisVantagens() {
		clicarBotao(By.xpath(
				"//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@class='v-responsive__content']"));
	}

	public void acessarMinhasIndicacoes() {
	}

	public void acessarRegulamento() {
	}

}
