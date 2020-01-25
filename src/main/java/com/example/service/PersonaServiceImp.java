/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;
import com.example.dao.PersonaRepository;
import com.example.service.PersonaService;
import com.example.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService
{
@Autowired
private PersonaRepository repositorio;
	@Override
	public List<Persona> listadoPersonas() {
		return repositorio.findAll();
	}

	@Override
	public Persona personaUnica(int id) {
		return repositorio.findById(id);
		
	}

	@Override
	public Persona altaPersona(Persona p) {
		
		return repositorio.save(p);
	}

	@Override
	public Persona editarPersona(Persona p) {
		return repositorio.save(p);
		
	}

	@Override
	public Persona eliminarPersona(int id) {
            Persona p = repositorio.findById(id);
            if (p!=null)
            {
                repositorio.delete(p);
            }
            return p;
	}

}

