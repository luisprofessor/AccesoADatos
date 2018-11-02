/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos.modelo;

import java.time.LocalDate;

/**
 *
 * @author programador
 */
public class Alumno {

    private int id = -1;
    private String nombre;
    private LocalDate fecNac;
    private boolean activo;

    public Alumno(String nombre, LocalDate fecNac, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.activo = activo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fecNac
     */
    public LocalDate getFecNac() {
        return fecNac;
    }

    /**
     * @param fecNac the fecNac to set
     */
    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

            
}
