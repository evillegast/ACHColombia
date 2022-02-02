package com.achcolombia.pruebas.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://aws-prb-alb-public-hpagos-1818123813.us-east-1.elb.amazonaws.com:8443/VolPayHubUI/#/hybridlogin")

public class AchPaginaPpalPageObject extends PageObject {

    By select = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/select[1]");
    By btnLogin = By.xpath("//button[@type='submit']");
    By inpUsuario = By.id("username");
    By inpContrasena = By.id("password");
    By btnIngresar = By.xpath("//button[@type='submit']");
    By txtBienvenido = By.xpath("//h2[@class='ng-scope']");
    By txtOperador = By.xpath("//span[@class='namecls ng-binding']");
    By btnLogOut = By.xpath("//div[@class='content-wrapper']//li[3]//a[1]");

    public By getSelect() {return select;}

    public By getBtnLogin() {return btnLogin;}

    public By getInpUsuario() {return inpUsuario;}

    public By getInpContrasena() {return inpContrasena;}

    public By getBtnIngresar() {return btnIngresar;}

    public By getTxtBienvenido() {return txtBienvenido;}

    public By getBtnLogOut() {return btnLogOut;}
}
