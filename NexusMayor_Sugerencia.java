
package com.mycompany.nexusmayor;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class NexusMayor_Sugerencia {
    public String contenido;
    private LocalDateTime fechaCreacion;
    protected String estado;
    public NexusMayor_AdultoMayor adultoRelacionado; // Agregación
    private ArrayList<NexusMayor_Cuidador> cuidadoresAsignados; // Composición
    
    public NexusMayor_Sugerencia(String contenido, NexusMayor_AdultoMayor adultoRelacionado) {
        this.contenido = contenido;
        this.fechaCreacion = LocalDateTime.now();
        this.estado = "pendiente";
        this.adultoRelacionado = adultoRelacionado;
        this.cuidadoresAsignados = new ArrayList<>();
    }
    
    public void agregarCuidadorAsignado(NexusMayor_Cuidador cuidador) {
        cuidadoresAsignados.add(cuidador);
    }
    
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
    
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public String obtenerDatos() {
        return "Sugerencia [" + estado + "] para " + adultoRelacionado.nombre + 
               " - Fecha: " + fechaCreacion.toLocalDate();
    }
    
    public void mostrarDetalles() {
        System.out.println("=== SUGERENCIA ===");
        System.out.println("Contenido: " + contenido);
        System.out.println("Estado: " + estado);
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println("Adulto relacionado: " + adultoRelacionado.nombre);
        System.out.println("Cuidadores asignados: ");
        for (NexusMayor_Cuidador cuidador : cuidadoresAsignados) {
            System.out.println("  - " + cuidador.nombre);
        }
    }
}
