package ea.controller;

import domain.car.NoSuchResourceException;
import ea.dao.IDirectorDao;
import ea.domain.Director;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by Zamuna on 8/8/2017.
 */
@Controller
public class DirectorController {
    @Resource
    private IDirectorDao directorDao;



    @RequestMapping("/addDirector")
    public  String add(){
        return "addDirector";
    }
    @RequestMapping(value = "/directors", method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("directors", directorDao.getAll());
        return "directorList";
    }

    @RequestMapping(value = "/directors", method = RequestMethod.POST)
    public String add(Director director) {
        directorDao.add(director);
        return "redirect:/directors";
    }

    @RequestMapping(value = "/directors/{id}", method = RequestMethod.GET)
    public String get(@PathVariable int id, Model model) {
        model.addAttribute("director", directorDao.get(id));
        return "directorDetail";
    }

    @RequestMapping(value = "/directors/{id}", method = RequestMethod.POST)
    public String update(Director director, @PathVariable int id) {

        directorDao.update(id, director); // director.id already set by binding
        return "redirect:/directors";
    }

    @RequestMapping(value = "/directors/delete", method = RequestMethod.POST)
    public String delete(Director director,int directorId) {
        System.out.println(director);
        directorDao.delete(director);
        return "redirect:/directors";
    }

    @ExceptionHandler(value = NoSuchResourceException.class)
    public ModelAndView handle(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.getModel().put("e", e);
        mv.setViewName("noSuchResource");
        return mv;
    }
}

