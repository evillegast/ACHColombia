package com.achcolombia.pruebas.utils;

import java.io.File;

public class RutaArchivos {

    public String obtenerRutaAbsoluta (){

        String  ruta = new File("").getAbsolutePath ();

        return ruta;
    }
}
