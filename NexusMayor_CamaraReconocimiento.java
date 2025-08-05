
package com.mycompany.nexusmayor;

import java.time.LocalDateTime;

public class NexusMayor_CamaraReconocimiento {
    public String ubicacion;
    private boolean estadoOperativo;
    protected LocalDateTime ultimaDeteccionPersona;
    public int umbralInactividad;
    private String idCamara;
    
    public NexusMayor_CamaraReconocimiento(String ubicacion, boolean estadoOperativo, 
                                          int umbralInactividad, String idCamara) {
        this.ubicacion = ubicacion;
        this.estadoOperativo = estadoOperativo;
        this.umbralInactividad = umbralInactividad;
        this.idCamara = idCamara;
        this.ultimaDeteccionPersona = null;
    }
    
    public void detectarPresenciaMovimiento() {
        if (estadoOperativo) {
            ultimaDeteccionPersona = LocalDateTime.now();
            System.out.println("Cámara " + idCamara + " detectó movimiento en " + ubicacion);
            enviarNotificacionSistema();
        }
    }
    
    public void cambiarUbicacion(String nuevaUbicacion) {
        this.ubicacion = nuevaUbicacion;
    }
    
    public void establecerUmbralInactividad(int nuevoUmbral) {
        this.umbralInactividad = nuevoUmbral;
    }
    
    public void cambiarEstadoOperativo(boolean nuevoEstado) {
        this.estadoOperativo = nuevoEstado;
    }
    
    private void enviarNotificacionSistema() {
        System.out.println("Enviando notificación al sistema - Detección en " + ubicacion);
    }
    
    public boolean isOperativa() {
        return estadoOperativo;
    }
    
    public LocalDateTime getUltimaDeteccion() {
        return ultimaDeteccionPersona;
    }
    
    public String getIdCamara() {
        return idCamara;
    }
    
    public String obtenerDatos() {
        return "Cámara " + idCamara + " - " + ubicacion + 
               " - Estado: " + (estadoOperativo ? "Activa" : "Inactiva");
    }
    
    public void mostrarInformacion() {
        System.out.println("=== CÁMARA DE RECONOCIMIENTO ===");
        System.out.println("ID: " + idCamara);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Estado operativo: " + (estadoOperativo ? "Activa" : "Inactiva"));
        System.out.println("Umbral de inactividad: " + umbralInactividad + " minutos");
        System.out.println("Última detección: " + 
                          (ultimaDeteccionPersona != null ? ultimaDeteccionPersona : "Ninguna"));
    }
}
