
package com.example.service;

import com.example.model.Persona;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;


public interface PersonaService {
List<Persona>listadoPersonas();
Persona personaUnica(int id);
Persona altaPersona(Persona p);
Persona editarPersona(Persona p);
Persona eliminarPersona(int id);

}
