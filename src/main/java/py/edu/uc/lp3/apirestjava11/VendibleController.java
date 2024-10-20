package py.edu.uc.lp3.apirestjava11;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1.SkinArmas;
import py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1.Subfusil;
import py.edu.uc.lp3.apirestjava11.TPtienda.Jerarquia1.Vendible;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VendibleController {

    @GetMapping("/vendibles")
    public ResponseEntity<List<Vendible>> mostrarVendibles() {
        List<Vendible> vendibles = new ArrayList<>();
        SkinArmas piel = new SkinArmas("Dorado");
        piel.setDescripcion("Nuevas cosas se vienen");
        piel.setRareza(10);
        Subfusil subfusil = new Subfusil(4303, 5, "Subfusil peculiar", "viva la vida"); // Assuming Subfusil class
                                                                                        // exists
        vendibles.add(subfusil);

        Subfusil subfusil2 = new Subfusil(2000, 1, "Subfusil yare", "MP7"); // Assuming Subfusil class exists
        subfusil2.setPrecio(200);
        vendibles.add(subfusil2);
        subfusil.setDescripcion("Es un arma fantastica");

        // Explicitly return 200 OK status code
        return new ResponseEntity<>(vendibles, HttpStatus.OK);
    }

}
