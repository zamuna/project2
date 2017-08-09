package ea.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import domain.car.NoSuchResourceException;
import ea.dao.IArtistDao;
import ea.domain.Artist;

@Controller
//@RequestMapping(value="/artists")
public class ArtistController {

    @Resource
    private IArtistDao artistDao;

    @RequestMapping("/")
    public String redirectRoot() {
        return "redirect:/artists";
    }

    @RequestMapping("/add")
    public  String add(){
        return "addCast";
    }
    @RequestMapping(value = "/artists", method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("artists", artistDao.getAll());
        return "artistList";
    }

    @RequestMapping(value = "/artists", method = RequestMethod.POST)
    public String add(Artist artist) {
        artistDao.add(artist);
        return "redirect:/artists";
    }

    @RequestMapping(value = "/artists/{id}", method = RequestMethod.GET)
    public String get(@PathVariable int id, Model model) {
        model.addAttribute("artist", artistDao.get(id));
        return "artistDetail";
    }

    @RequestMapping(value = "/artists/{id}", method = RequestMethod.POST)
    public String update(Artist artist, @PathVariable int id) {
    	
        artistDao.update(id, artist); // artist.id already set by binding
        return "redirect:/artists";
    }

    @RequestMapping(value = "/artists/delete", method = RequestMethod.POST)
    public String delete(Artist artist,int artistId) {
        System.out.println(artist);
        artistDao.delete(artist);
        return "redirect:/artists";
    }

    @ExceptionHandler(value = NoSuchResourceException.class)
    public ModelAndView handle(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.getModel().put("e", e);
        mv.setViewName("noSuchResource");
        return mv;
    }
}
