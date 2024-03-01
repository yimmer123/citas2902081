package org.ptech.citas.entities;
import java.time.LocalDateTime;

import org.ptech.citas.entities.enums.EstadoCita;

public class Cita {
     int id;
     LocalDateTime fecha;
     Medico medico;
     Paciente paciente;
     Consultorio consultorio;
     EstadoCita estado;




}
