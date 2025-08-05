
package com.mycompany.nexusmayor;


public class NexusMayor_Persona {
    public String nombre;
    protected int edad;
    private String telefono;
    public String email;
    private String id;
    
    public NexusMayor_Persona(String nombre, int edad, String telefono, String email, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.id = id;
    }
    
    public String obtenerDatos() {
        return nombre + " (" + id + ") - Teléfono: " + telefono;
    }
    
    public void actualizarTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public String getId() {
        return id;
    }
}
