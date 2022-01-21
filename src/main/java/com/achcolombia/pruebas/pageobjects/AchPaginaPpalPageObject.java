package com.achcolombia.pruebas.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://34.201.92.167:8443/VolPayHubUI/#")

public class AchPaginaPpalPageObject extends PageObject {

    By InpUsuario = By.id("username");
    By InpContrasena = By.id("password");
    By btnIngresar = By.xpath("//button[@type='submit']");
    By txtBienvenido = By.xpath("//h2[@class='ng-scope']");
    By txtOperador = By.xpath("//span[@class='namecls ng-binding']");
    By btnLogOut = By.xpath("//div[@class='content-wrapper']//li[3]//a[1]");

    public By getInpUsuario() {
        return InpUsuario;
    }

    public By getInpContrasena() {
        return InpContrasena;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }

    public By getTxtBienvenido() { return txtBienvenido;}

    public By getBtnLogOut() { return btnLogOut;}

    public By getTxtOperador() { return txtOperador;}
}
