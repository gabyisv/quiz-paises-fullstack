package quiz_paises_api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@RestController
@CrossOrigin(origins = "*")
public class PaisController {
    @GetMapping("/api/paises")
    public List<Paises> paises() {
        return lista;
    }

    List<Paises> lista = Arrays.asList(
            // América do Sul
            new Paises("Brasil", "América do Sul", "Brasília", "br"),
            new Paises("Argentina", "América do Sul", "Buenos Aires", "ar"),
            new Paises("Chile", "América do Sul", "Santiago", "cl"),
            new Paises("Colômbia", "América do Sul", "Bogotá", "co"),
            new Paises("Peru", "América do Sul", "Lima", "pe"),
            new Paises("Uruguai", "América do Sul", "Montevidéu", "uy"),
            new Paises("Paraguai", "América do Sul", "Assunção", "py"),
            new Paises("Bolívia", "América do Sul", "Sucre", "bo"),
            new Paises("Equador", "América do Sul", "Quito", "ec"),
            new Paises("Venezuela", "América do Sul", "Caracas", "ve"),

            // América do Norte e Central
            new Paises("Estados Unidos", "América do Norte", "Washington", "us"),
            new Paises("Canadá", "América do Norte", "Ottawa", "ca"),
            new Paises("México", "América do Norte", "Cidade do México", "mx"),
            new Paises("Cuba", "América Central", "Havana", "cu"),
            new Paises("Costa Rica", "América Central", "San José", "cr"),
            new Paises("Panamá", "América Central", "Cidade do Panamá", "pa"),

            // Europa
            new Paises("França", "Europa", "Paris", "fr"),
            new Paises("Alemanha", "Europa", "Berlim", "de"),
            new Paises("Itália", "Europa", "Roma", "it"),
            new Paises("Espanha", "Europa", "Madrid", "es"),
            new Paises("Portugal", "Europa", "Lisboa", "pt"),
            new Paises("Reino Unido", "Europa", "Londres", "gb"),
            new Paises("Holanda", "Europa", "Amsterdã", "nl"),
            new Paises("Bélgica", "Europa", "Bruxelas", "be"),
            new Paises("Suíça", "Europa", "Berna", "ch"),
            new Paises("Suécia", "Europa", "Estocolmo", "se"),
            new Paises("Noruega", "Europa", "Oslo", "no"),
            new Paises("Polônia", "Europa", "Varsóvia", "pl"),
            new Paises("Grécia", "Europa", "Atenas", "gr"),
            new Paises("Rússia", "Europa", "Moscou", "ru"),

            // Ásia
            new Paises("Japão", "Ásia", "Tóquio", "jp"),
            new Paises("China", "Ásia", "Pequim", "cn"),
            new Paises("Coreia do Sul", "Ásia", "Seul", "kr"),
            new Paises("Índia", "Ásia", "Nova Delhi", "in"),
            new Paises("Tailândia", "Ásia", "Bangcoc", "th"),
            new Paises("Indonésia", "Ásia", "Jacarta", "id"),
            new Paises("Vietnã", "Ásia", "Hanói", "vn"),
            new Paises("Turquia", "Ásia", "Ancara", "tr"),
            new Paises("Arábia Saudita", "Ásia", "Riade", "sa"),
            new Paises("Israel", "Ásia", "Jerusalém", "il"),

            // África
            new Paises("Egito", "África", "Cairo", "eg"),
            new Paises("África do Sul", "África", "Pretória", "za"),
            new Paises("Nigéria", "África", "Abuja", "ng"),
            new Paises("Quênia", "África", "Nairóbi", "ke"),
            new Paises("Marrocos", "África", "Rabat", "ma"),
            new Paises("Gana", "África", "Acra", "gh"),
            new Paises("Etiópia", "África", "Adis Abeba", "et"),

            // Oceania
            new Paises("Austrália", "Oceania", "Camberra", "au"),
            new Paises("Nova Zelândia", "Oceania", "Wellington", "nz"),
            new Paises("Fiji", "Oceania", "Suva", "fj")
    );

    @GetMapping("/api/paises/aleatorio")
    public Paises paisesAleatorios() {
        Random random = new Random();
        int indice = random.nextInt(lista.size());

        return lista.get(indice);
    }




}
