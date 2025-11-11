package cl.salmontt.servicio;

import cl.salmontt.model.Persona;
import cl.salmontt.repositorio.PersonaRepositorio;

public class PersonaServicio {
    private final PersonaRepositorio repositorioPersonas;

    public PersonaServicio(PersonaRepositorio repositorioPersonas) {
        this.repositorioPersonas = repositorioPersonas;
    }

    public void registrarPersona(Persona persona) {
        repositorioPersonas.agregar(persona);
    }

    public void listarPersonas() {
        System.out.println("Personas registradas:");
        for (Persona p : repositorioPersonas.obtenerTodas()) {
            System.out.println("- " + p + "\n");
        }
    }
}
