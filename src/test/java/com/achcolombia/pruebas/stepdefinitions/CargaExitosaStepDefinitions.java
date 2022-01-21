package com.achcolombia.pruebas.stepdefinitions;

import com.achcolombia.pruebas.pageobjects.MenuPageObject;
import com.achcolombia.pruebas.steps.CargueArchivosSteps;
import com.achcolombia.pruebas.steps.MenuSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;


public class CargaExitosaStepDefinitions {


    @Steps
    MenuSteps menuSteps;
    @Steps
    CargueArchivosSteps cargueArchivosSteps;
    @Steps
    MenuPageObject menuPageObject;



    @Cuando("^el usuario ingrese a modulo carga$")
    public void elUsuarioIngreseAModuloCarga() {
        menuSteps.clicEnModuloPago();
        menuSteps.clicEnEntidad();
        menuSteps.clicEnSubirArchivo();



    }

    @Cuando("^Realice la carga del archivo nacham hasta su finalizacion$")
    public void realiceLaCargaDelArchivoNachamHastaSuFinalizacion() throws IOException {


        cargueArchivosSteps.ingresarEntidadFinanciera();
        menuSteps.clicEnEntidad();
        cargueArchivosSteps.CargarArchivoNacham();
        menuSteps.clicEnServicio();


    }

    @Entonces("^se visualiza mensaje de carga completa$")
    public void seVisualizaMensajeDeCargaCompleta() {

    }
}
