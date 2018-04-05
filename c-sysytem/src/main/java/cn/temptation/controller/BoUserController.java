package cn.temptation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.temptation.entity.BoUser;
import cn.temptation.service.BoUserService;

@Controller
@RequestMapping(value = "/bouser")
public class BoUserController {
	@Autowired
    private BoUserService boUserService;
	
	@RequestMapping("/view")
    public String view() {
		System.out.println("asdasd");
        return "login";
    }
	
	@RequestMapping("/indexview")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public ModelAndView login(BoUser model) {
    	BoUser user = boUserService.findByUsername(model.getUserAccount());
        if (user == null || !user.getUserPwd().equals(model.getUserPwd())) {
            return new ModelAndView("redirect:/login.jsp");
        } else {
            ModelAndView mav = new ModelAndView();
            mav.addObject("user", user);
            mav.setViewName("login");
            return mav;
        }
    }
}
