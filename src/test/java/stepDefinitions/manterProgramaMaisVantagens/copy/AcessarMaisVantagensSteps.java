package stepDefinitions.manterProgramaMaisVantagens.copy;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterProgramaMaisVantagens.AcessarMaisVantagensPage;
import pageObjects.menu.MenuPage;

public class AcessarMaisVantagensSteps {
	
	MenuPage menu = new MenuPage();
	AcessarMaisVantagensPage acessarMaisVantagens = new AcessarMaisVantagensPage();
	
	@Dado("^que o usuário acesse o menu do programa Mais Vantagens$")
	public void que_o_usuário_acesse_o_menu_do_programa_Mais_Vantagens() throws Throwable {
		menu.maisVantagens();
	}

	@Quando("^clicar no card do programa$")
	public void clicar_no_card_do_programa() throws Throwable {
		acessarMaisVantagens.acessarMaisVantagens();
	}

	@Então("^será direcionado para a tela do programa Mais Vantagens$")
	public void será_direcionado_para_a_tela_do_programa_Mais_Vantagens() throws Throwable {
	}

}