package runners.reserva;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/reserva/AdquirirDiariaAvulsaReserva"
				}
		,features = "src/test/resources/features/reserva/AdquirirDiariaAvulsaReserva.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class AdquirirDiariaAvulsaReservaRunner {

}
