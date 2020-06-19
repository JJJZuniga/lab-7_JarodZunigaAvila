/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_jarodzuniga;

/**
 *
 * @author Jhon Zuniga
 */
public class Archivos {
    private String nombre;
    private String linkar;
    private String exten;
    private int tamaño;

    public Archivos(String nombre, String linkar, String exten, int tamaño) {
        this.nombre = nombre;
        this.linkar = linkar;
        this.exten = exten;
        this.tamaño = tamaño;
    }

    public Archivos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLinkar() {
        return linkar;
    }

    public void setLinkar(String linkar) {
        this.linkar = linkar;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", linkar=" + linkar + ", exten=" + exten + ", tama\u00f1o=" + tamaño ;
    }
     
    
    
            
}
