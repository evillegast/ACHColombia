package com.achcolombia.pruebas.stepdefinitions;

import com.achcolombia.pruebas.steps.LoginPaginaPrincipalStep;
import cucumber.api.java.After;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class LoginPaginaPrincipalStepDefinitions {

    @Steps
    LoginPaginaPrincipalStep loginPaginaPrincipalStep;



    @Dado("^que el usuario se encuentre en la página web$")
    public void queElUsuarioSeEncuentreEnLaPáginaWeb() {
        loginPaginaPrincipalStep.openBrowser();

    }


    @Cuando("^ingresa sus credenciales$")
    public void ingresaSusCredenciales() throws IOException {
        loginPaginaPrincipalStep.ingresarUsuario();
        loginPaginaPrincipalStep.ingresarClave();
        loginPaginaPrincipalStep.clikBotonIngreso();

    }

    @Entonces("^se visualiza el panel principal$")
    public void seVisualizaElPanelPrincipal() {
        loginPaginaPrincipalStep.validarIngresoUsuario();


    }

    @After
    public void cerrarSesionUsuario(){
        loginPaginaPrincipalStep.cerrarSesion();
    }




}
