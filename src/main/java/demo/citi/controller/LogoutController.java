package demo.citi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    public static final String REDIRECT = "redirect:./";
    @RequestMapping("logout")
    public ModelAndView removeSession(HttpServletRequest httpRequest, HttpSession httpSession){
        String referer = httpRequest.getHeader("Referer");
        String[] split = referer.split("/");
        String target=split[split.length-1];
        httpSession.invalidate();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(REDIRECT+target);
        return modelAndView;
    }

}
