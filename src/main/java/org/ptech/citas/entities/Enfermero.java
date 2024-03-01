package org.ptech.citas.entities;

import java.util.ArrayList;
import java.util.List;

import org.ptech.citas.entities.enums.TipoDocumento;

public class Enfermero extends Usuario {
 
    private List<String> procedimientos;

    public Enfermero(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento) {
    //1 llamar al constructor de la super clase
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        //2 inicializar atributos intrinsecos
        this.procedimientos = new ArrayList<String>();
}

 public void addProcedure(String procedure){
    //añadir el string procedimiento 
    //a la lista de procedimientos
    this.procedimientos.add(procedure);
 }

public List<String> getProcedimientos() {
    return procedimientos;
}

}
