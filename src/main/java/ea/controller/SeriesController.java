package ea.controller;

import domain.car.NoSuchResourceException;
import ea.dao.IArtistDao;
import ea.dao.IDirectorDao;
import ea.dao.ISeriesDao;
import ea.domain.Director;
import ea.domain.Series;
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
public class SeriesController {
    @Resource
    private ISeriesDao seriesDao;
    @Resource
    private IDirectorDao directorDao;
    @Resource
    IArtistDao artistDao;

    @RequestMapping("/addSeries")
    public  String add(Model model){
        model.addAttribute("directors",directorDao.getAll());
        model.addAttribute("artists",artistDao.getAll());
//        System.out.println("====="+model);
        return "addSeries";
    }
    @RequestMapping(value = "/series", method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("series", seriesDao.getAll());
        return "seriesList";
    }

    @RequestMapping(value = "/series", method = RequestMethod.POST)
    public String add(Series series, Director director) {
        System.out.println(director.toString());
        System.out.println(series.toString());
        seriesDao.add(series);
        return "redirect:/series";
    }

    @RequestMapping(value = "/series/{id}", method = RequestMethod.GET)
    public String get(@PathVariable int id, Model model) {
        model.addAttribute("series", seriesDao.get(id));
        return "seriesDetail";
    }

    @RequestMapping(value = "/series/{id}", method = RequestMethod.POST)
    public String update(Series series, @PathVariable int id) {

        seriesDao.update(id, series); // series.id already set by binding
        return "redirect:/series";
    }

    @RequestMapping(value = "/series/delete", method = RequestMethod.POST)
    public String delete(Series series,int seriesId) {
        System.out.println(series);
        seriesDao.delete(series);
        return "redirect:/series";
    }

    @ExceptionHandler(value = NoSuchResourceException.class)
    public ModelAndView handle(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.getModel().put("e", e);
        mv.setViewName("noSuchResource");
        return mv;
    }
}


