
package com.mycompany.nexusmayor;


import java.time.LocalDateTime;

public class NexusMayor {
    
    public static void main(String[] args) {
        // Crear la aplicación principal
        NexusMayor_AplicacionNexus app = new NexusMayor_AplicacionNexus(
            "NexusMayor", "1.0.0", "Español"
        );
        
        app.iniciarSesion();
        
        // Crear adultos mayores
        NexusMayor_AdultoMayor adulto1 = new NexusMayor_AdultoMayor(
            "María González", 78, "333-1234567", "maria@email.com", "AM001",
            "101", "Diabetes tipo 2", "Medio"
        );
        
        NexusMayor_AdultoMayor adulto2 = new NexusMayor_AdultoMayor(
            "José Ramírez", 82, "333-7654321", "jose@email.com", "AM002",
            "102", "Hipertensión", "Alto"
        );
        
        NexusMayor_AdultoMayor adulto3 = new NexusMayor_AdultoMayor(
            "Carmen López", 75, "333-9876543", "carmen@email.com", "AM003",
            "103", "Artritis", "Bajo"
        );
        
        // Crear cuidadores
        NexusMayor_Cuidador cuidador1 = new NexusMayor_Cuidador(
            "Ana Martínez", 35, "333-1111111", "ana@nexus.com", "C001",
            "Medicina General", 8, true, "Geriatría"
        );
        
        NexusMayor_Cuidador cuidador2 = new NexusMayor_Cuidador(
            "Carlos Hernández", 42, "333-2222222", "carlos@nexus.com", "C002",
            "Fisioterapia", 12, true, "Rehabilitación"
        );
        
        NexusMayor_Cuidador cuidador3 = new NexusMayor_Cuidador(
            "Lucía Fernández", 29, "333-3333333", "lucia@nexus.com", "C003",
            "Enfermería", 5, false, "Cuidados Intensivos"
        );
        
        // Registrar usuarios en la aplicación
        app.registrarAdultoMayor(adulto1);
        app.registrarAdultoMayor(adulto2);
        app.registrarAdultoMayor(adulto3);
        
        app.registrarCuidador(cuidador1);
        app.registrarCuidador(cuidador2);
        app.registrarCuidador(cuidador3);
        
        // Asignar cuidadores a adultos mayores
        cuidador1.agregarAdultoMayor(adulto1);
        cuidador1.agregarAdultoMayor(adulto2);
        cuidador2.agregarAdultoMayor(adulto3);
        
        // Crear encuesta
        NexusMayor_Encuesta encuestaBienestar = new NexusMayor_Encuesta(
            "Encuesta de Bienestar Diario", "activa", "diaria"
        );
        
        // Crear preguntas para la encuesta
        NexusMayor_Pregunta pregunta1 = new NexusMayor_Pregunta(
            "¿Cómo se siente hoy?", "opcion_multiple", true
        );
        pregunta1.agregarOpcion("Muy bien");
        pregunta1.agregarOpcion("Bien");
        pregunta1.agregarOpcion("Regular");
        pregunta1.agregarOpcion("Mal");
        
        NexusMayor_Pregunta pregunta2 = new NexusMayor_Pregunta(
            "¿Ha tomado sus medicamentos?", "si_no", true
        );
        pregunta2.agregarOpcion("Sí");
        pregunta2.agregarOpcion("No");
        
        NexusMayor_Pregunta pregunta3 = new NexusMayor_Pregunta(
            "¿Tiene algún dolor o molestia?", "texto_libre", false
        );
        
        // Agregar preguntas a la encuesta
        encuestaBienestar.agregarPregunta(pregunta1);
        encuestaBienestar.agregarPregunta(pregunta2);
        encuestaBienestar.agregarPregunta(pregunta3);
        
        // Simular respuestas de adulto mayor
        pregunta1.guardarRespuesta("Bien");
        pregunta2.guardarRespuesta("Sí");
        pregunta3.guardarRespuesta("Un poco de dolor en las rodillas");
        
        // Crear sugerencias
        NexusMayor_Sugerencia sugerencia1 = new NexusMayor_Sugerencia(
            "Realizar ejercicios de estiramiento para las articulaciones", adulto1
        );
        sugerencia1.agregarCuidadorAsignado(cuidador1);
        
        NexusMayor_Sugerencia sugerencia2 = new NexusMayor_Sugerencia(
            "Revisar medicación para la hipertensión", adulto2
        );
        sugerencia2.agregarCuidadorAsignado(cuidador1);
        
        // Agregar sugerencias a los adultos mayores
        adulto1.agregarSugerencia(sugerencia1);
        adulto2.agregarSugerencia(sugerencia2);
        
        // Crear notificaciones
        NexusMayor_Notificacion notif1 = new NexusMayor_Notificacion(
            "Es hora de tomar su medicamento",
            "pendiente",
            "alta",
            LocalDateTime.now().plusHours(1),
            adulto1.getId(),
            "sistema_medicamentos"
        );
        
        NexusMayor_Notificacion notif2 = new NexusMayor_Notificacion(
            "Recordatorio: Cita médica mañana a las 10:00 AM",
            "pendiente",
            "media",
            LocalDateTime.now().plusDays(1),
            adulto2.getId(),
            "sistema_citas"
        );
        
        // Crear cámaras de reconocimiento
        NexusMayor_CamaraReconocimiento camara1 = new NexusMayor_CamaraReconocimiento(
            "Habitación 101", true, 30, "CAM001"
        );
        
        NexusMayor_CamaraReconocimiento camara2 = new NexusMayor_CamaraReconocimiento(
            "Pasillo Principal", true, 15, "CAM002"
        );
        
        NexusMayor_CamaraReconocimiento camara3 = new NexusMayor_CamaraReconocimiento(
            "Sala de Estar", false, 45, "CAM003"
        );
        
        // Mostrar información del sistema
        System.out.println("==========================================");
        System.out.println("       SISTEMA NEXUSMAYOR - DEMO");
        System.out.println("==========================================\n");
        
        app.mostrarEstadisticas();
        System.out.println();
        
        app.mostrarUsuarios();
        System.out.println();
        
        // Mostrar información detallada de algunos usuarios
        System.out.println("==========================================");
        System.out.println("      INFORMACIÓN DETALLADA");
        System.out.println("==========================================\n");
        
        adulto1.mostrarInformacionCompleta();
        System.out.println();
        
        cuidador1.mostrarInformacionCompleta();
        System.out.println();
        
        // Mostrar encuesta
        encuestaBienestar.mostrarEncuesta();
        System.out.println();
        
        // Mostrar sugerencias
        sugerencia1.mostrarDetalles();
        System.out.println();
        
        // Enviar notificaciones
        System.out.println("==========================================");
        System.out.println("         NOTIFICACIONES");
        System.out.println("==========================================\n");
        
        notif1.enviarNotificacion();
        System.out.println();
        notif2.mostrarDetalles();
        System.out.println();
        
        // Simular detección de cámaras
        System.out.println("==========================================");
        System.out.println("      SISTEMA DE CÁMARAS");
        System.out.println("==========================================\n");
        
        camara1.mostrarInformacion();
        System.out.println();
        camara1.detectarPresenciaMovimiento();
        System.out.println();
        
        camara2.mostrarInformacion();
        System.out.println();
        camara2.detectarPresenciaMovimiento();
        System.out.println();
        
        camara3.mostrarInformacion();
        System.out.println();
        
        // Cerrar sesión
        app.cerrarSesion();
        
        System.out.println("\n==========================================");
        System.out.println("         DEMO COMPLETADA");
        System.out.println("==========================================");
    }
}
