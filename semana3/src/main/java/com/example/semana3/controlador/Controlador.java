package com.example.semana3.controlador;

import com.example.semana3.modelo.Equipos;
import com.example.semana3.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controlador {
    @Autowired
    private Repositorio repo;
    @Autowired
    private PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor;

    @GetMapping
    public String index(){
        return "Conectado";
    }
    @GetMapping("Equipos")
    public List<Equipos> getEquipos(){
        return repo.findAll();
    }
    @PostMapping("grabar")
    public String post(@RequestBody Equipos equipos){
        repo.save(equipos);
        return "Grabado";
    }
    @PutMapping("editar/{idEquipo}")
    public String update(@PathVariable Long id, @RequestBody Equipos equipos){
        Equipos updateEquipos = repo.findById(id).get();
        updateEquipos.setNombreEquipo(equipos.getNombreEquipo());
        updateEquipos.setDescripcionEquipo(equipos.getDescripcionEquipo());
        updateEquipos.setFecha_adquisicio(equipos.getFecha_adquisicio());
        updateEquipos.setCosto(equipos.getCosto());
        updateEquipos.setEstado(equipos.getEstado());
        updateEquipos.setFecha_ultimo_mantenimiento(equipos.getFecha_ultimo_mantenimiento());
        updateEquipos.setProveedor(equipos.getProveedor());
        updateEquipos.setGarantia(equipos.getGarantia());
        updateEquipos.setSerial(equipos.getSerial());
        updateEquipos.setModelo(equipos.getModelo());
        updateEquipos.setTipo(equipos.getTipo());
        updateEquipos.setResponsable(equipos.getResponsable());
        updateEquipos.setFecha_creacion(equipos.getFecha_creacion());
        repo.save(updateEquipos);
        return "Actualizado";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        Equipos deleteequipos = repo.findById(id).get();
        repo.deleteById(id);
        return "Eliminado";
    }
}
