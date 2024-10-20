package py.edu.uc.lp3.apirestjava11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private static final Logger logger = LoggerFactory.getLogger(PersonaController.class);

    private List<Persona> personas = new ArrayList<>();

    public PersonaController() {
        // Agregar dos personas predeterminadas
        personas.add(new Persona(1, "Juan Perez", 30, "Calle Falsa 123", "123456789", "juan.perez@example.com"));
        personas.add(
                new Persona(2, "Maria Gomez", 25, "Avenida Siempre Viva 456", "987654321", "maria.gomez@example.com"));
    }

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona) {
        logger.info("Creando nueva persona: {}", persona);
        personas.add(persona);
        return persona;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable int id) {
        logger.info("Obteniendo persona con ID: {}", id);
        Optional<Persona> persona = personas.stream().filter(p -> p.getId() == id).findFirst();
        if (persona.isPresent()) {
            logger.info("Persona encontrada: {}", persona.get());
            return ResponseEntity.ok(persona.get());
        } else {
            logger.warn("Persona con ID {} no encontrada", id);
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Persona> actualizarPersona(@PathVariable int id, @RequestBody Persona personaDetalles) {
        logger.info("Actualizando persona con ID: {}", id);
        Optional<Persona> personaOptional = personas.stream().filter(p -> p.getId() == id).findFirst();
        if (personaOptional.isPresent()) {
            Persona persona = personaOptional.get();
            persona.setNombre(personaDetalles.getNombre());
            persona.setEdad(personaDetalles.getEdad());
            persona.setDireccion(personaDetalles.getDireccion());
            persona.setTelefono(personaDetalles.getTelefono());
            persona.setEmail(personaDetalles.getEmail());
            logger.info("Persona actualizada: {}", persona);
            return ResponseEntity.ok(persona);
        } else {
            logger.warn("Persona con ID {} no encontrada para actualizar", id);
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPersona(@PathVariable int id) {
        logger.info("Eliminando persona con ID: {}", id);
        boolean eliminado = personas.removeIf(p -> p.getId() == id);
        if (eliminado) {
            logger.info("Persona con ID {} eliminada", id);
            return ResponseEntity.noContent().build();
        } else {
            logger.warn("Persona con ID {} no encontrada para eliminar", id);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Persona> listarPersonas() {
        logger.info("Listando todas las personas");
        return personas;
    }
}