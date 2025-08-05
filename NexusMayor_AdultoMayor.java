
package com.mycompany.nexusmayor;

import java.util.ArrayList;

public class NexusMayor_AdultoMayor extends NexusMayor_Persona{
    public String numeroHabitacion;
    private String condicionMedica;
    protected String nivelCuidado;
    public NexusMayor_Cuidador cuidadorEncargado; // Agregación
    private ArrayList<NexusMayor_Sugerencia> sugerencias; // Composición
    
    public NexusMayor_AdultoMayor(String nombre, int edad, String telefono, String email, String id,
                                 String numeroHabitacion, String condicionMedica, String nivelCuidado) {
        super(nombre, edad, telefono, email, id);
        this.numeroHabitacion = numeroHabitacion;
        this.condicionMedica = condicionMedica;
        this.nivelCuidado = nivelCuidado;
        this.sugerencias = new ArrayList<>();
    }
    
    public void asignarCuidador(NexusMayor_Cuidador cuidador) {
        this.cuidadorEncargado = cuidador;
    }
    
    public void agregarSugerencia(NexusMayor_Sugerencia sugerencia) {
        sugerencias.add(sugerencia);
    }
    
    public void actualizarCondicionMedica(String nuevaCondicion) {
        this.condicionMedica = nuevaCondicion;
    }
    
    public String getCondicionMedica() {
        return condicionMedica;
    }
    
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + " - Habitación: " + numeroHabitacion + 
               " - Nivel: " + nivelCuidado;
    }
    
    public void mostrarInformacionCompleta() {
        System.out.println("ADULTO MAYOR: " + obtenerDatos());
        System.out.println("Condición médica: " + condicionMedica);
        System.out.println("Cuidador asignado: " + 
                          (cuidadorEncargado != null ? cuidadorEncargado.nombre : "No asignado"));
        System.out.println("Sugerencias registradas: " + sugerencias.size());
    }
}
