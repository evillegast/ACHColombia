package com.achcolombia.pruebas.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MenuPageObject extends PageObject {

    By btnModuloPagos = By.id("PaymentModule");
    By btnSubirArchivo = By.xpath("//span[contains(text(),'Subir archivo')]");
    By txtBoxEntidad = By.xpath("//*[@id=\"select2-party-container\"]");
    By txtBoxServicio = By.xpath("//*[@id=\"select2-service-container\"]");
    By txtBoxFormatoNacham = By.xpath("//span[@id='select2-inputformat-container']");
    By inpSeleccionarArchivo = By.id("uploadBtn");
    By btnCargarArchivo = By.xpath("//span[normalize-space()='Cargar']");


    public By getBtnModuloPagos() {
        return btnModuloPagos;
    }

    public By getBtnSubirArchivo() {
        return btnSubirArchivo;
    }

    public By getTxtBoxEntidad() { return txtBoxEntidad; }

    public By getTxtBoxServicio() {
        return txtBoxServicio;
    }

    public By getTxtBoxFormatoNacham() {
        return txtBoxFormatoNacham;
    }

    public By getInpSeleccionarArchivo() {
        return inpSeleccionarArchivo;
    }

    public By getBtnCargarArchivo() {
        return btnCargarArchivo;
    }
}
