package cjf.com.community1.controller;

import cjf.com.community1.dto.QuestionDTO;
import cjf.com.community1.mapper.QuestionMapper;
import cjf.com.community1.mapper.UserMapper;
import cjf.com.community1.model.Question;
import cjf.com.community1.model.User;
import cjf.com.community1.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author xiaochen
 * @data 2020/11/16 10:36
 */
@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    public QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model){
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length!=0)
            for (Cookie cookie : cookies) {
                if(cookie.getName().equals("token")){
                    String token = cookie.getValue();
                    User user=userMapper.findByToken(token);
                    if(user !=null){
                        request.getSession().setAttribute("user",user);

                    }
                    break;
                }
        }

        List<QuestionDTO> questionList=questionService.list();
        model.addAttribute("questions",questionList);
        return "index";
    }
}
