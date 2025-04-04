package sp5.chap09_jsp.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/main")
    public String main() {
        return "main"; // /WEB-INF/views/main.jsp 로 이동
    }

    @RequestMapping("/")
    public String root() {
        return "main"; // 루트 접근도 main.jsp 로 이동
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
