/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

public class main {

    public static void main(String[] args) {
        
        Paciente paciente = new Paciente("Juan Perez", "OSDE");
        Profesional profesional = new Profesional("Dra. Ana Gomez", "Cardiologia");
        CitaMedica cita = new CitaMedica("19/05/2025", "10:30");
        
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        System.out.println(cita);
        System.out.println(profesional);
        System.out.println(paciente);
    }
    
}
