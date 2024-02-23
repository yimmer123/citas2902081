package org.ptech.citas;
import java.time.LocalDate;
import java.time.Month;

import org.ptech.citas.entities.Consultorio;
import org.ptech.citas.entities.Especialidad;
import org.ptech.citas.entities.Medico;
import org.ptech.citas.entities.Paciente;
import org.ptech.citas.entities.TipoDocumento;
import org.ptech.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {
        
        //Crear un objeto medico 
        //Inatanciar un medico
        //Una manera de dar valor
        //a atributos privados en una clase 
        //es a traves de el constructor
        //parametrizado
        Medico m = new Medico(1, "Mariana" , "Castellanos" ,TipoDocumento.PPT, 1031807942L, 2345678L, Especialidad.MEDICINA_GENERAL );

        //instanciar otro medico
        Medico m2 = new Medico();
       //Se debe utilizar primero el setter
       //del atributo a asignar 
       m2.setNombres("Carlos");
       m2.setApellidos("Jimenez");
       m2.setNumeroDocumento(132556234L);
       System.out.println(m2.getNombres() + " " + m2.getApellidos());

        Consultorio m3 = new Consultorio(1, "Cll 130 #94-35", 324567766);
        
        Consultorio m4 = new  Consultorio();
        m4.setDirreccion("cr 45  N 15-20");
        m4.setNumero(1728365487);
        System.out.println(m4.getDirreccion() + " " + m4.getNumero());

        Paciente m5 = new Paciente(2 , "Sofia" , "Gonzales" , TipoDocumento.RC , 54354354L , "sofia@gmail.com" , 2342342342L , LocalDate.of(2005, Month.AUGUST , 5) , 186.0 , 90.5 , TipoSangre.AB , '+' );
        Paciente m6 = new Paciente();
        m6.setNombres("Sofia");
        m6.setApellidos("Gonzales");
        m6.setEmail("sofia@gmail.com");
        m6.setFactorRH('+');
        System.out.println(m6.getNombres() + " " + m6.getApellidos() + " " + m6.getEmail() + " " + m6.getFactorRH());
       


    }
     
        
    }
    
