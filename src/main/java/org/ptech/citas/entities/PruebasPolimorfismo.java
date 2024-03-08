package org.ptech.citas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.citas.entities.enums.Especialidad;
import org.ptech.citas.entities.enums.TipoDocumento;

public class PruebasPolimorfismo {
    public static void main(String[] args) {
        //instanciar un usuario
        Usuario u = new Medico(1, "mariana", "castellanos", TipoDocumento.CE, 14552892L, 158625L, Especialidad.DERMATOLOGIA);
        System.out.println(u.toString());
        Usuario u1 = new Enfermero(2, "Yimmer", "Guzman", TipoDocumento.CC, 615376428L);
        System.out.println(u1.toString());
        Consultorio u2 = new Consultorio(3, "calle127 #89-90", 32765385);
        System.out.println(u2.toString());
    

      
    }
}
