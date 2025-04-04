package sp5.chap09_jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    // 기존: /main 요청 → main.jsp
    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/")
    public String home() {
        return "main";  // /WEB-INF/views/main.jsp 로 연결됨
    }

    // 추가: / 요청 → main.jsp
    @RequestMapping("/")
    public String root() {
        return "main";
    }

    // 추가: /hello 요청 → hello.jsp
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
