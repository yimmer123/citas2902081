package org.ptech.citas.entities;

import java.time.LocalDateTime;

import org.ptech.citas.entities.enums.EstadoCita;
import org.ptech.citas.interfaces.IAgendable;

public class CitaEnfermero extends Cita implements IAgendable  {

    public CitaEnfermero(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente) {
        super(id, fecha, consultorio, paciente);
        
    }
    Enfermero enfermero;
    EstadoCita estadoCita;
    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }
    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc) {
        
        throw new UnsupportedOperationException("Unimplemented method 'reAgendarCita'");
    }
    @Override
    public boolean cancelarCita() {
       
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    

    


}
