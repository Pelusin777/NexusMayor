
package com.mycompany.nexusmayor;

import java.util.ArrayList;

public class NexusMayor_Encuesta {
    public String nombre;
    private String estadoEncuesta;
    protected String frecuencia;
    public ArrayList<NexusMayor_Pregunta> bancoPreguntas; // Composición
    private boolean completada;
    
    public NexusMayor_Encuesta(String nombre, String estadoEncuesta, String frecuencia) {
        this.nombre = nombre;
        this.estadoEncuesta = estadoEncuesta;
        this.frecuencia = frecuencia;
        this.bancoPreguntas = new ArrayList<>();
        this.completada = false;
    }
    
    public void agregarPregunta(NexusMayor_Pregunta pregunta) {
        bancoPreguntas.add(pregunta);
    }
    
    public ArrayList<NexusMayor_Pregunta> obtenerPreguntas() {
        return new ArrayList<>(bancoPreguntas);
    }
    
    public void guardarRespuestas() {
        System.out.println("Guardando respuestas de la encuesta: " + nombre);
        this.completada = true;
        this.estadoEncuesta = "completada";
    }
    
    public void mostrarEncuesta() {
        System.out.println("=== ENCUESTA: " + nombre + " ===");
        System.out.println("Estado: " + estadoEncuesta);
        System.out.println("Frecuencia: " + frecuencia);
        System.out.println("Total de preguntas: " + bancoPreguntas.size());
        System.out.println("Preguntas:");
        for (int i = 0; i < bancoPreguntas.size(); i++) {
            System.out.println("\n" + (i + 1) + ". ");
            bancoPreguntas.get(i).mostrarPregunta();
        }
    }
    
    public String getEstado() {
        return estadoEncuesta;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estadoEncuesta = nuevoEstado;
    }
    
    public boolean isCompletada() {
        return completada;
    }
    
    public String obtenerDatos() {
        return nombre + " - Estado: " + estadoEncuesta + " - Preguntas: " + bancoPreguntas.size();
    }
}
