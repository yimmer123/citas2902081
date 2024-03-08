package org.ptech.citas.interfaces;

import java.time.LocalDateTime;

import org.ptech.citas.entities.Consultorio;

public interface IAgendable {
    //proponer un metodo para agendar las citas  
    public boolean agendarCita(LocalDateTime fecha, Consultorio c);
    //proponer un metodo para reagendar la cita
    public boolean reAgendarCita(LocalDateTime nuevaFecha , Consultorio nuevoc);
    //cancelar una cita
    public boolean cancelarCita();
}
