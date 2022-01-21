#language: es

Característica: ingresar a la pagina ACH Colombia
  Para validar los datos del usuario

  @EscenarioLogin
  Escenario:  Acceso  la pagina Principal ach colombia
    Dado  que el usuario se encuentre en la página web
    Cuando ingresa sus credenciales
    Entonces se visualiza el panel principal 