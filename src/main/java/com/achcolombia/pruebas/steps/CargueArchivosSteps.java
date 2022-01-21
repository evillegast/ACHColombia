package com.achcolombia.pruebas.steps;

import com.achcolombia.pruebas.pageobjects.MenuPageObject;
import com.achcolombia.pruebas.utils.EsperasExplicitas;
import com.achcolombia.pruebas.utils.ExcelDatos;
import com.achcolombia.pruebas.utils.RutaArchivos;
import net.thucydides.core.annotations.Step;
import java.io.IOException;


public class CargueArchivosSteps {


    MenuPageObject menuPageObject = new MenuPageObject();
    RutaArchivos rutaArchivos = new RutaArchivos();
    ExcelDatos excelDatos = new ExcelDatos();
    EsperasExplicitas esperasExplicitas = new EsperasExplicitas();



    @Step
    public void ingresarEntidadFinanciera() throws IOException {

        menuPageObject.getDriver().findElement(menuPageObject.getTxtBoxEntidad()).click();


    }
    @Step
            public void CargarArchivoNacham() throws IOException {
        menuPageObject.getDriver().findElement(menuPageObject.getBtnSubirArchivo()).sendKeys(rutaArchivos.obtenerRutaAbsoluta()+excelDatos.obtenerDatos("Datos.xlsx","ITAU_MONETARIA_DEBITO",1,0));

    }




}
