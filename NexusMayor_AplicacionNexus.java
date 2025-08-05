
package com.mycompany.nexusmayor;

import java.util.ArrayList;

public class NexusMayor_AplicacionNexus {
    public String nombre;
    private String version;
    protected String idiomaPredeterminado;
    public boolean sesionActiva;
    private ArrayList<NexusMayor_AdultoMayor> adultosRegistrados; // Composición
    private ArrayList<NexusMayor_Cuidador> cuidadoresRegistrados; // Composición
    
    public NexusMayor_AplicacionNexus(String nombre, String version, String idiomaPredeterminado) {
        this.nombre = nombre;
        this.version = version;
        this.idiomaPredeterminado = idiomaPredeterminado;
        this.sesionActiva = false;
        this.adultosRegistrados = new ArrayList<>();
        this.cuidadoresRegistrados = new ArrayList<>();
    }
    
    public void iniciarSesion() {
        this.sesionActiva = true;
        System.out.println("Sesión iniciada en " + nombre);
    }
    
    public void cerrarSesion() {
        this.sesionActiva = false;
        System.out.println("Sesión cerrada en " + nombre);
    }
    
    public void registrarAdultoMayor(NexusMayor_AdultoMayor adultoMayor) {
        adultosRegistrados.add(adultoMayor);
        System.out.println("Adulto mayor registrado: " + adultoMayor.nombre);
    }
    
    public void registrarCuidador(NexusMayor_Cuidador cuidador) {
        cuidadoresRegistrados.add(cuidador);
        System.out.println("Cuidador registrado: " + cuidador.nombre);
    }
    
    public void cambiarIdioma(String nuevoIdioma) {
        this.idiomaPredeterminado = nuevoIdioma;
    }
    
    public String getVersion() {
        return version;
    }
    
    public String getIdioma() {
        return idiomaPredeterminado;
    }
    
    public boolean isSesionActiva() {
        return sesionActiva;
    }
    
    public String obtenerDatos() {
        return nombre + " v" + version + " - Idioma: " + idiomaPredeterminado + 
               " - Sesión: " + (sesionActiva ? "Activa" : "Inactiva");
    }
    
    public void mostrarEstadisticas() {
        System.out.println("=== ESTADÍSTICAS DE " + nombre + " ===");
        System.out.println("Versión: " + version);
        System.out.println("Idioma: " + idiomaPredeterminado);
        System.out.println("Sesión activa: " + (sesionActiva ? "Sí" : "No"));
        System.out.println("Adultos mayores registrados: " + adultosRegistrados.size());
        System.out.println("Cuidadores registrados: " + cuidadoresRegistrados.size());
    }
    
    public void mostrarUsuarios() {
        System.out.println("\n=== ADULTOS MAYORES REGISTRADOS ===");
        for (NexusMayor_AdultoMayor adulto : adultosRegistrados) {
            System.out.println("- " + adulto.obtenerDatos());
        }
        
        System.out.println("\n=== CUIDADORES REGISTRADOS ===");
        for (NexusMayor_Cuidador cuidador : cuidadoresRegistrados) {
            System.out.println("- " + cuidador.obtenerDatos());
        }
    }
}
