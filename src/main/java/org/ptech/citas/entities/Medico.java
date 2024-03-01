package org.ptech.citas.entities;
import org.ptech.citas.entities.enums.Especialidad;
import org.ptech.citas.entities.enums.TipoDocumento;

//clases que heradan:
// - clases hijas
// - subclases
// - clases detalle
// - clases especificas 

public class Medico extends Usuario {
   
   private Long registroMedico;
   private Especialidad especialidad;

public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento, Long registroMedico, Especialidad especialidad) {
    //Si quieres instanciar un medico 
    //Tambien debes instanciar el usuario
    //super en el constructor invoca(llama, ejecuta)
    //al constructor de la clase padre(superclase)
    //debe ser llamada al constructor de la superclase
    //debe ser la primera que aprezaca en el constructor de la clase hija

    super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
     // a continuacion inicializamos
    //atributos propios de la clase hija
    this.registroMedico = registroMedico;
    this.especialidad = especialidad;
}

public Long getRegistroMedico() {
    return registroMedico;
}

public void setRegistroMedico(Long registroMedico) {
    this.registroMedico = registroMedico;
}

public Especialidad getEspecialidad() {
    return especialidad;
}

public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
}

   
}