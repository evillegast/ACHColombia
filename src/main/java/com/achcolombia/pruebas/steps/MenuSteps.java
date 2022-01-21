package com.achcolombia.pruebas.steps;

import com.achcolombia.pruebas.pageobjects.MenuPageObject;
import com.achcolombia.pruebas.utils.EsperasExplicitas;
import com.achcolombia.pruebas.utils.ExcelDatos;
import com.achcolombia.pruebas.utils.RutaArchivos;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class MenuSteps {
    MenuPageObject menuPageObject = new MenuPageObject();
    RutaArchivos rutaArchivos = new RutaArchivos();
    ExcelDatos excelDatos = new ExcelDatos();
    CargueArchivosSteps cargueArchivosSteps;
    EsperasExplicitas esperasExplicitas = new EsperasExplicitas();


    @Step
    public void clicEnModuloPago(){
        //menuPageObject.getDriver().findElement(menuPageObject.getBtnModuloPagos()).click();

        JavascriptExecutor jse = (JavascriptExecutor)menuPageObject.getDriver();
        WebElement element = menuPageObject.getDriver().findElement(menuPageObject.getBtnModuloPagos());
        jse.executeScript("arguments[0].scrollIntoView()", element);
        esperasExplicitas.esperaImplicitaTexto(menuPageObject.getDriver(), menuPageObject.getBtnModuloPagos());
        menuPageObject.getDriver().findElement(By.id("PaymentModule")).click();
    }

    @Step
    public void clicEnEntidad(){

        JavascriptExecutor jse = (JavascriptExecutor)menuPageObject.getDriver();
        WebElement element = menuPageObject.getDriver().findElement(menuPageObject.getTxtBoxEntidad());
        jse.executeScript("arguments[0].scrollIntoView()", element);
        esperasExplicitas.esperaImplicitaTexto(menuPageObject.getDriver(), menuPageObject.getTxtBoxEntidad());
        menuPageObject.getDriver().findElement(By.xpath("//*[@id=\"select2-party-container\"]")).click();
        Select lista = new Select(menuPageObject.getDriver().findElement(menuPageObject.getTxtBoxEntidad()));
        lista.selectByIndex(0);


    }

    @Step
    public void clicEnServicio(){
        esperasExplicitas.esperaImplicitaTexto(menuPageObject.getDriver(), menuPageObject.getTxtBoxServicio());
        menuPageObject.getDriver().findElement(menuPageObject.getTxtBoxServicio()).click();
        Select lista = new Select(menuPageObject.getDriver().findElement(menuPageObject.getTxtBoxServicio()));
        lista.selectByIndex(0);

    }

    @Step
    public void clicEnSubirArchivo(){

        menuPageObject.getDriver().findElement(menuPageObject.getBtnSubirArchivo()).click();
    }


}
