package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/list")
    public String listStudent(ModelMap modelMap){
        modelMap.addAttribute("ten","Vũ Đan Linh");
        return "list";
    }
    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("ten","Vũ Văn Mừng");
        return modelAndView;
    }
    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("name", "Vũ Linh Đan");
        modelAndView.addObject("age", "21");
        modelAndView.addObject("id", id);
        return modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView modelAndView(@RequestParam String name, String a){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("search", name);
        modelAndView.addObject("a", a);
        return modelAndView;
    }
}
