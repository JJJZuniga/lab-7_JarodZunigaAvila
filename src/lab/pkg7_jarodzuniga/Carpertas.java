/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_jarodzuniga;

import java.util.ArrayList;

/**
 *
 * @author Jhon Zuniga
 */
public class Carpertas {
    private String nombre;
    private String link;
    private ArrayList archycarp;

    public Carpertas(String nombre, String link, ArrayList archycarp) {
        this.nombre = nombre;
        this.link = link;
        this.archycarp = archycarp;
    }

    public Carpertas() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList getArchycarp() {
        return archycarp;
    }

    public void setArchycarp(ArrayList archycarp) {
        this.archycarp = archycarp;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", link=" + link + ", archycarp=" + archycarp;
    }
    
}
