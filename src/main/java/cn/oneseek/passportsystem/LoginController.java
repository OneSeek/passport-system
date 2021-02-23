package cn.oneseek.passportsystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class LoginController {

    @GetMapping(path = "/login")
    public String getProducts(Model model){
        model.addAttribute("name", "testuser");
        model.addAttribute("products", Arrays.asList("iPad","iPhone","iPod"));
        return "login";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}
