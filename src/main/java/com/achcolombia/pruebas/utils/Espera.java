package com.achcolombia.pruebas.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Espera {

    public void esperaImplicitaTexto (WebDriver driver, By elemento) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
}
