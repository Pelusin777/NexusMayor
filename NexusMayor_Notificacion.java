
package com.mycompany.nexusmayor;

import java.time.LocalDateTime;

public class NexusMayor_Notificacion {
    public String mensaje;
    private String estadoNotificacion;
    protected String prioridad;
    public LocalDateTime fechaLimite;
    private String destino;
    private String origenInterno;
    
    public NexusMayor_Notificacion(String mensaje, String estadoNotificacion, String prioridad,
                                  LocalDateTime fechaLimite, String destino, String origenInterno) {
        this.mensaje = mensaje;
        this.estadoNotificacion = estadoNotificacion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.destino = destino;
        this.origenInterno = origenInterno;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estadoNotificacion = nuevoEstado;
    }
    
    public void enviarNotificacion() {
        System.out.println("Enviando notificación a: " + destino);
        System.out.println("Mensaje: " + mensaje);
        cambiarEstado("enviada");
    }
    
    public String getEstado() {
        return estadoNotificacion;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public String getOrigenInterno() {
        return origenInterno;
    }
    
    public String obtenerDatos() {
        return "Notificación [" + prioridad + "] - Estado: " + estadoNotificacion + 
               " - Destino: " + destino;
    }
    
    public void mostrarDetalles() {
        System.out.println("=== NOTIFICACIÓN ===");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Estado: " + estadoNotificacion);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Destino: " + destino);
        System.out.println("Origen: " + origenInterno);
        System.out.println("Fecha límite: " + fechaLimite);
    }
}
