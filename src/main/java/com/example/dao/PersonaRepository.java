/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;
import com.example.model.Persona;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.Repository;



public interface PersonaRepository extends Repository<Persona,Integer>{
List<Persona>findAll();
Persona findById(int id);
//Persona findByNombre(String nombre);
Persona save(Persona p);
void delete(Persona p);
}
