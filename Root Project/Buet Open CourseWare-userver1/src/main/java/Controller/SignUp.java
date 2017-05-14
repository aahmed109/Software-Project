package Controller;
import DataAccess.PeopleDAO;
import TableObjects.*;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by Anisha on 4/22/2017.
 */


@Controller
public class SignUp {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    PeopleDAO peopleDAO = (PeopleDAO) applicationContext.getBean("peopleDAO");
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView SignUpLoad(){
        ModelAndView modelAndView = new ModelAndView("mysignup");
        return modelAndView;
    }
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ModelAndView Home(@RequestParam Map<String,String>map1) {
        PeopleObject peopleObject = new PeopleObject();
        String user = map1.get("fname") + ' ' + map1.get("lname");
        peopleObject.setUser_name(user);
        peopleObject.setEmail(map1.get("mail"));
        peopleObject.setPassword(map1.get("pass"));
        peopleObject.setProfession(map1.get("profession"));
        peopleObject.setInstitution(map1.get("institute"));
        peopleObject.setContact_no(map1.get("contact"));
        peopleObject.setCountry(map1.get("country"));
        peopleObject.setDivision(map1.get("division"));
        peopleObject.setDistrict(map1.get("dist"));
        peopleObject.setRoad_no(map1.get("road"));
        peopleObject.setHouse_no(map1.get("house"));
        peopleObject.setDob(map1.get("dob"));
        peopleObject.setGender(map1.get("gender"));
        String date = new SimpleDateFormat("mm-dd-yyyy").format(new Date());
        peopleObject.setRegDate(date);
        peopleDAO.Insert(peopleObject);
        ModelAndView modelAndView = new ModelAndView("mylogin");
        modelAndView.addObject("welcomeMessage", "Hi, " + user + " welcome to the first Spring MVC Application");
        return modelAndView;
    }
}

