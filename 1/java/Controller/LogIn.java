package Controller;

/**
 * Created by Ahmed on 1/05/2017 at 3:55 PM.
 */

import DataAccess.AdminPanelDAO;
import DataAccess.PeopleDAO;
import TableObjects.AdminPanelObject;
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
    AdminPanelDAO adminPanelDAO = (AdminPanelDAO) applicationContext.getBean("adminpanelDAO");
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView LoginLoad() {
        ModelAndView modelAndView = new ModelAndView("mylogin");
        modelAndView.addObject(
                "welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
        return modelAndView;
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView LoginDone(@RequestParam Map<String,String> map2) {
        String userid = map2.get("uid");
        int user_id = Integer.parseInt(userid);
        String password = map2.get("pass");

        AdminPanelObject adminPanelObject = adminPanelDAO.LoginValidate(user_id,password);
        if(adminPanelObject==null){
            ModelAndView modelAndView = new ModelAndView("mylogin");
            modelAndView.addObject(
                    "welcomeMessage", "Hi " + user_id + " please enter info correctly");
            return modelAndView;
        }
        else {
            if(adminPanelObject.getStatus().equals("Content")) {
                return new ModelAndView("/contentAdminHome");
            }
            else return new ModelAndView("/mylogin");
        }
    }
}

