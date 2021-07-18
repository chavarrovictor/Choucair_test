package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.mockito.stubbing.Answer;
import userinterfaces.PaginaChoucairInerface;

import static userinterfaces.PaginaChoucairInerface.BOTON_VACANTES;

public class ValidacionPortalEmpleados implements Question <Boolean> {

    private String question;


    public ValidacionPortalEmpleados (String question){
        this.question = question;
    }

    public static ValidacionPortalEmpleados toThe (String question){
        return new ValidacionPortalEmpleados (question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String vacantes = Text.of(BOTON_VACANTES).viewedBy(actor).asString();
        if (question.equals(vacantes)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
