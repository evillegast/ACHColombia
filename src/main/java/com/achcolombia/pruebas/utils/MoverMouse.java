package com.achcolombia.pruebas.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class MoverMouse {

    public void moverMouseAlElememto (By elememtoDestino, WebDriver driver) throws AWTException {

        WebElement destino = driver.findElement(elememtoDestino);
        Actions actions = new Actions(driver);
        actions.moveToElement(destino).build().perform();

    }

}
