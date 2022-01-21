package com.achcolombia.pruebas.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\loginAchColombia\\CargaExitosaItau.feature",
        glue = "com\\achcolombia\\pruebas\\stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class CargaExitosaItau {

}
