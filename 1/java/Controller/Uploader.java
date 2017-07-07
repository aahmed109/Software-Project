package Controller;

import DataAccess.SlideDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.*;


/**
 * Created by graphics on 5/15/2017.
 */
@Controller
public class Uploader {
    //String paths = "G:/Study Materials/CSE 3-2/Software Lab/Uploads";
    String paths = "G:\\Akib Ahmed\\Pdf\\3-2\\(CSE 324) Software Development\\BuetOpenCourseware(adminver2)\\Uploads";
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    SlideDAO slideDAO = (SlideDAO) applicationContext.getBean("slideDAO");
    @RequestMapping(value = "/savefile",method = RequestMethod.GET)
    public ModelAndView Up(){
        return new ModelAndView("/upload");
    }
    @RequestMapping(value="/savefile",method= RequestMethod.POST)
    public ModelAndView Upload(@RequestParam CommonsMultipartFile file, HttpSession session){
        ServletContext context = session.getServletContext();
        String path = paths;
        String filename = file.getOriginalFilename();

        System.out.println(path+" "+filename);
        try {
            System.out.println(path+ "/"+filename);
            byte[] bytes = file.getBytes();
            String ultpath = path+ "/"+filename;
            File upfile = new File(ultpath);
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(upfile)));
            dos.write(bytes);
            dos.flush();
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ModelAndView("/muddy");
    }
}
