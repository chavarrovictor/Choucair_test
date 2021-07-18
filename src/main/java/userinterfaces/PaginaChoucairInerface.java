package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.choucairtesting.com")

    public class PaginaChoucairInerface extends PageObject{

    public static final Target BOTON_PORTAL = Target.the("Botón ir al portal de empleados")
            .located(By.xpath("//div[@class='elementor-element elementor-element-d1f45a7 elementor-align-center elementor-widget elementor-widget-button']//a[@role='button']"));

    public static final Target BOTON_APLICAR = Target.the("Botón ir al portal de empleados")
            .located(By.xpath("//img[@title='serchazuleMesa de trabajo 1']"));

    public static final Target BOTON_EMPLEOS = Target.the("Botón ir al portal de empleados")
            .located(By.xpath("//a[normalize-space()='Empleos']"));

    public static final Target BOTON_CONTINUAR = Target.the("Botón ir al portal de empleados")
            .located(By.xpath("//a[@class='elementor-button-link elementor-button elementor-size-sm']"));

    public static final Target BOTON_VACANTES = Target.the("Botón ir al portal de empleados")
            .located(By.xpath("//a[normalize-space()='Conoce nuestras vacantes']"));



}

