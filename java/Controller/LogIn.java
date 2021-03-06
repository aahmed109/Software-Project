package Controller;

/**
 * Created by Ahmed on 1/05/2017 at 3:55 PM.
 */

import DataAccess.PeopleDAO;
import TableObjects.PeopleObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class LogIn {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    PeopleDAO peopleDAO = (PeopleDAO) applicationContext.getBean("peopleDAO");
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView LoginLoad() {
        ModelAndView modelAndView = new ModelAndView("mylogin");
        modelAndView.addObject(
                "welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
        return modelAndView;
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView LoginDone(@RequestParam Map<String,String> map2) {
        String user_name = map2.get("uname");
        String password = map2.get("pass");
        PeopleObject p = peopleDAO.LoginValidate(user_name,password);
        if(p==null){
            ModelAndView modelAndView = new ModelAndView("mylogin");
            modelAndView.addObject(
                    "welcomeMessage", "Hi " + user_name + " please enter info correctly");
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView("muddy");
            return modelAndView;
        }
    }
}

