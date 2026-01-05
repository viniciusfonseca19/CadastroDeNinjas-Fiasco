package team.horizon.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NinjaContoller {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

}
