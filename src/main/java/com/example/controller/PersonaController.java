package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Persona;
import com.example.model.Persona;
import com.example.service.PersonaService;
import com.example.service.PersonaService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping
public class PersonaController {
	@Autowired
	PersonaService service;
@GetMapping("/personas")
public List<Persona>listar()
{
	return service.listadoPersonas();
}
@PostMapping("/personas")
public Persona agregar(@RequestBody Persona p){
   return service.altaPersona(p); 
}
@GetMapping({"/personas/{id}"})
public Persona listarId(@PathVariable("id") int id)
{
    return service.personaUnica(id);
}
@PutMapping(path={"/personas/{id}"})
public Persona editar(@RequestBody Persona p, @PathVariable("id") int id)
{
    p.setId(id);
    return service.editarPersona(p);
}  
@DeleteMapping(path={"/personas/{id}"})
public Persona delete(@PathVariable ("id") int id)
{
    return service.eliminarPersona(id);
}
}
