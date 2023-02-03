#Español

Feature: Yo como usuario de Online Notepad
  necesito hacer uso de la pagina de forma exitosa

  Background:
    Given El usuario ingresa a la pagina

  @CreacionDeNota
  Scenario: Crear una nota de texto enriquecido con letra en negrita
    When La nota se guarda

  @EliminacionDeNota
  Scenario: Eliminar un artículo de una lista de 5 elementos
    When El usuario elemina la nota
