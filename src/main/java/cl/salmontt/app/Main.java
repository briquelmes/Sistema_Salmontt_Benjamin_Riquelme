package cl.salmontt.app;

import cl.salmontt.model.Direccion;
import cl.salmontt.model.Empleado;
import cl.salmontt.model.Empresa;
import cl.salmontt.model.Jefe;
import cl.salmontt.model.*;
import cl.salmontt.repositorio.PersonaRepositorio;
import cl.salmontt.servicio.PersonaServicio;

public class Main {
    public static void main(String[] args) {

        // Crear direcciones
        Direccion dir1 = new Direccion("Av. Los Salmones 501", "Puerto Montt", "Los Lagos");
        Direccion dir2 = new Direccion("Calle Mar Azul 103","Puerto Varas", "Los Lagos");
        Direccion dir3 = new Direccion("Pasaje Río Claro 51","Castro", "Chiloé");
        Direccion dir4 = new Direccion("Av. Pedro Aguirre Cerda 21","Puerto Montt", "Los Lagos");

        //Crear empresa
        Empresa salmontt = new Empresa("Salmontt", dir4);

        // Crear el repositorio y el servicio
        PersonaRepositorio personaRepositorio = new PersonaRepositorio();
        PersonaServicio personaServicio = new PersonaServicio(personaRepositorio);

        // Crear empleados
        Empleado emp1 = new Empleado("Carlos", "22.333.444-5", 32, "Pérez", "Rojas",
                "987654321", "carlos@salmontt.cl", dir1, 1200000, "Operador", "Producción");

        Empleado emp2 = new Empleado("Lucía", "15.222.111-0", 29, "Fernández", "Díaz",
                "912345678", "lucia@salmontt.cl", dir2, 1150000, "Analista", "Calidad");

        // Crear jefe
        Jefe jefe = new Jefe("María", "12.345.678-9", 45, "Gómez", "López",
                "987654321", "maria@salmontt.cl", dir3, 2500000, "Producción");

        // Asignar subordinados al jefe
        jefe.agregarSubordinado(emp1);
        jefe.agregarSubordinado(emp2);

        // Registrar personas en el servicio
        personaServicio.registrarPersona(emp1);
        personaServicio.registrarPersona(emp2);
        personaServicio.registrarPersona(jefe);

        // Listar todas las personas registradas
        personaServicio.listarPersonas();

    }
}