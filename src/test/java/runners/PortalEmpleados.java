package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ir_portal_empleados.feature",
        glue = "stepdefinitions",
        monochrome = true,
        snippets = SnippetType.CAMELCASE
)
public class PortalEmpleados {
}