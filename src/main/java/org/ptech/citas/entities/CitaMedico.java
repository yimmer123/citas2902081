package org.ptech.citas.entities;

import java.time.LocalDateTime;

import org.ptech.citas.entities.enums.EstadoCita;
import org.ptech.citas.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable {

    Medico medico;
    EstadoCita estado;
    
    public CitaMedico(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente) {
        super(id, fecha, consultorio, paciente);
        this.estado = EstadoCita.AGENDADA;
        
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
       this.setFecha(fecha);
       this.setConsultorio(c);
        return true;
    }

    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc) {
        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevoc);
        return true;
    }

    @Override
    public boolean cancelarCita() {
        this.estado = EstadoCita.CANCELADA;
        return true;
    }
    
    

}
