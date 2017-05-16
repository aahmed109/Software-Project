package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ahmed on 15/05/2017 at 10:33 PM.
 */
@Controller
public class cseDept {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    //PeopleDAO peopleDAO = (PeopleDAO) applicationContext.getBean("peopleDAO");

    @RequestMapping(value = "/cse", method = RequestMethod.GET)
    public ModelAndView LoginLoad() {
        ModelAndView modelAndView = new ModelAndView("cseDept");
        modelAndView.addObject(
                "welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
        return modelAndView;
    }
}
