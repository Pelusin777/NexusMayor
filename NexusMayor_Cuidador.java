
package com.mycompany.nexusmayor;
import java.util.ArrayList;

public class NexusMayor_Cuidador extends NexusMayor_Persona {
    public String areaEncargada;
    private int tiempoExperiencia;
    protected boolean disponibilidad;
    private String especialidad;
    private ArrayList<NexusMayor_AdultoMayor> adultosAsignados; // Composición
    
    public NexusMayor_Cuidador(String nombre, int edad, String telefono, String email, String id,
                              String areaEncargada, int tiempoExperiencia, boolean disponibilidad,
                              String especialidad) {
        super(nombre, edad, telefono, email, id);
        this.areaEncargada = areaEncargada;
        this.tiempoExperiencia = tiempoExperiencia;
        this.disponibilidad = disponibilidad;
        this.especialidad = especialidad;
        this.adultosAsignados = new ArrayList<>();
    }
    
    public void agregarAdultoMayor(NexusMayor_AdultoMayor adultoMayor) {
        adultosAsignados.add(adultoMayor);
        adultoMayor.asignarCuidador(this);
    }
    
    public void cambiarDisponibilidad(boolean nuevaDisponibilidad) {
        this.disponibilidad = nuevaDisponibilidad;
    }
    
    public void actualizarExperiencia(int nuevaExperiencia) {
        this.tiempoExperiencia = nuevaExperiencia;
    }
    
    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public boolean isDisponible() {
        return disponibilidad;
    }
    
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + " - Área: " + areaEncargada + 
               " - Experiencia: " + tiempoExperiencia + " años";
    }
    
    public void mostrarInformacionCompleta() {
        System.out.println("CUIDADOR: " + obtenerDatos());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Disponible: " + (disponibilidad ? "Sí" : "No"));
        System.out.println("Adultos mayores asignados: ");
        for (NexusMayor_AdultoMayor adulto : adultosAsignados) {
            System.out.println("  - " + adulto.obtenerDatos());
        }
    }
    
}
