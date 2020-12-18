package tacos;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // обрабатывает запросы корневого пути
    public String home(){
        return "home";
    } // возвращает имя представления
}
