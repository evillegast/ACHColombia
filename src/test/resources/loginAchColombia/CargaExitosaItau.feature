#language: es

Característica: Realizar carga exitosa de archivo nacham banco Itau y revisar que cargue correctamente

  Antecedentes:
    Dado  que el usuario se encuentre en la página web
    Cuando ingresa sus credenciales

  @CargaExitosa
  Escenario:Realizar carga exitosa archivo nacham
    Cuando el usuario ingrese a modulo carga
    Y Realice la carga del archivo nacham hasta su finalizacion
    Entonces se visualiza mensaje de carga completa