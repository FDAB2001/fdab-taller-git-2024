package py.edu.uc.lp3.apirestjava11;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hola")
    public String sayHello() {
        return "Que locura";
    }
}

