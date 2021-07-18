package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidacionPortalEmpleados;
import tasks.Abrir;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.PaginaChoucairInerface.*;

public class IrPortalEmpleadosStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que se requiere ingresar a la pagina de choucair$")
    public void queSeRequiereIngresarALaPaginaDeChoucair() throws Exception {
        OnStage.theActorCalled("usuario").wasAbleTo(Abrir.lapagina());
    }

    @Cuando("^se da clic en el boton empleos$")
    public void seDaClicEnElBotonEmpleos() throws Exception {
        OnStage.theActorCalled("Usuario").attemptsTo(
                Click.on(BOTON_EMPLEOS)
        );
    }

    @Cuando("^se da clic en el boton ir al portal de empleados$")
    public void seDaClicEnElBotonIrAlPortalDeEmpleados() throws Exception {
        OnStage.theActorCalled("Usuario").attemptsTo(
                Click.on(BOTON_APLICAR),
                Click.on(BOTON_PORTAL),
                Click.on(BOTON_CONTINUAR)
        );

    }

    @Entonces("^se deberia ver el boton que dice (.*)$")
    public void seDeberiaVerElBotonQueDiceConoceNuestrasVacantes(String question) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionPortalEmpleados.toThe(question)));
    }

}

