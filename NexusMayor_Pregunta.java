
package com.mycompany.nexusmayor;

import java.util.ArrayList;
public class NexusMayor_Pregunta {
    public String textoPregunta;
    private String tipoPregunta;
    protected ArrayList<String> opcionesRespuesta;
    public String respuesta;
    private boolean esObligatoria;
    
    public NexusMayor_Pregunta(String textoPregunta, String tipoPregunta, boolean esObligatoria) {
        this.textoPregunta = textoPregunta;
        this.tipoPregunta = tipoPregunta;
        this.esObligatoria = esObligatoria;
        this.opcionesRespuesta = new ArrayList<>();
    }
    
    public void agregarOpcion(String opcion) {
        opcionesRespuesta.add(opcion);
    }
    
    public void editarPregunta(String nuevoTexto) {
        this.textoPregunta = nuevoTexto;
    }
    
    public void guardarRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    public ArrayList<String> obtenerOpciones() {
        return new ArrayList<>(opcionesRespuesta);
    }
    
    public String getTipoPregunta() {
        return tipoPregunta;
    }
    
    public boolean isObligatoria() {
        return esObligatoria;
    }
    
    public String obtenerDatos() {
        return tipoPregunta + ": " + textoPregunta + 
               (esObligatoria ? " (Obligatoria)" : " (Opcional)");
    }
    
    public void mostrarPregunta() {
        System.out.println("Pregunta: " + textoPregunta);
        System.out.println("Tipo: " + tipoPregunta);
        System.out.println("Obligatoria: " + (esObligatoria ? "Sí" : "No"));
        if (!opcionesRespuesta.isEmpty()) {
            System.out.println("Opciones:");
            for (int i = 0; i < opcionesRespuesta.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + opcionesRespuesta.get(i));
            }
        }
        if (respuesta != null) {
            System.out.println("Respuesta: " + respuesta);
        }
    }
}
