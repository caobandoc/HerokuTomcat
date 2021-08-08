package services;

import entities.Persona;

public class ServicioPersona {

    public static Persona upper(Persona persona){
        persona.setNombre(persona.getNombre().toUpperCase());
        persona.setApellido(persona.getApellido().toUpperCase());
        return persona;
    }

}