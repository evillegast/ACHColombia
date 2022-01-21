package com.achcolombia.pruebas.steps;

import com.achcolombia.pruebas.utils.EsperasExplicitas;
import com.achcolombia.pruebas.utils.ExcelDatos;
import com.achcolombia.pruebas.pageobjects.AchPaginaPpalPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.awt.*;


public class LoginPaginaPrincipalStep {

    AchPaginaPpalPageObject achPaginaPpalPageObject = new AchPaginaPpalPageObject();
    ExcelDatos excelDatos = new ExcelDatos();
    EsperasExplicitas esperasExplicitas = new EsperasExplicitas();
    private static final String NOMBRE_EXCEL="Datos.xlsx";
    private static final String NOMBRE_HOJA="Usuario";

    @Step
    public void openBrowser(){
        achPaginaPpalPageObject.open();
    }

    @Step
    public void ingresarUsuario () throws IOException {
        achPaginaPpalPageObject.getDriver().findElement(achPaginaPpalPageObject.getInpUsuario()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA,1,0));

    }

    @Step
    public void ingresarClave () throws IOException {
        achPaginaPpalPageObject.getDriver().findElement(achPaginaPpalPageObject.getInpContrasena()).sendKeys(excelDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA,1,1));

    }
    @Step
    public void clikBotonIngreso(){
        achPaginaPpalPageObject.getDriver().findElement(achPaginaPpalPageObject.getBtnIngresar()).click();

    }

    @Step

    public void clickLogOut(){
        achPaginaPpalPageObject.getDriver().findElement(achPaginaPpalPageObject.getBtnLogOut()).click();
    }

    @Step
    public void clicOperador(){
        achPaginaPpalPageObject.getDriver().findElement(achPaginaPpalPageObject.getTxtOperador()).click();
    }

    @Step
    public void validarIngresoUsuario(){
        esperasExplicitas.esperaImplicitaTexto(achPaginaPpalPageObject.getDriver(),achPaginaPpalPageObject.getTxtBienvenido());
        Assert.assertThat(achPaginaPpalPageObject.getDriver().findElement(achPaginaPpalPageObject.getTxtBienvenido()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void cerrarSesion(){
        JavascriptExecutor jse = (JavascriptExecutor)achPaginaPpalPageObject.getDriver();
        WebElement element = achPaginaPpalPageObject.getDriver().findElement(achPaginaPpalPageObject.getBtnLogOut());
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }

    }


