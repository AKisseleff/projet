package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.STB;
import service.StbService;

@RestController
public class StbController{

	@Autowired
	private StbService stbService;
	
	@RequestMapping(value = "/Accueil", method = RequestMethod.GET)
	public ModelAndView accueil(){
		ModelAndView model = new ModelAndView("Accueil");
		model.addObject("nbrStb", stbService.getNbrSTB());
		return model;
	}

	@RequestMapping(value = "resume/{id}", method = RequestMethod.GET)
	public ModelAndView getStb(@PathVariable("id") int id){
		STB stb = stbService.getSTBbyId(id);
		if(stb != null){
			ModelAndView model = new ModelAndView("STB");
			model.addObject("stb", stb);
			return model;
		}
		//message d'erreur
		return null;
	}
	@RequestMapping(value = "/resume", method = RequestMethod.GET)
	public ModelAndView getResume(){
		List<STB> stbs = stbService.getListStb().getSTB();
		ModelAndView model = new ModelAndView("resume");
		model.addObject("stbs", stbs);
		return model;
	}
	/*
	@RequestMapping(value="/depot", method=RequestMethod.POST)
	public String addStb(@ModelAttribute STB stb, Model model){
		return "";
	}

	@RequestMapping(value="/depot", method=RequestMethod.GET)
    public ModelAndView StbForm() {
		 return new ModelAndView("depot", "command", new STB());
    }
	*/
	
}
