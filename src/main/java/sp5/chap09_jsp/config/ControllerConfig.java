package sp5.chap09_jsp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import sp5.chap09_jsp.controller.RegisterController;
import sp5.chap09_jsp.spring.MemberRegisterService;
import sp5.chap09_jsp.survey.SurveyController;

@Configuration
public class ControllerConfig implements WebMvcConfigurer {

    @Autowired
    private MemberRegisterService memberRegSvc;

    @Bean
    public RegisterController registerController() {
        RegisterController controller = new RegisterController();
        controller.setMemberRegisterService(memberRegSvc);
        return controller;
    }

    @Bean
    public SurveyController surveyController() {
        return new SurveyController();
    }

    // ✅ JSP ViewResolver 설정 추가
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/", ".jsp");
    }
}
