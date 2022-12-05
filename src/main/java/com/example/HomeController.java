package board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("classlist")
    public String classList(Model model){
        model.addAttribute("title", "2학년 2학기 교과목 리스트");

        List<String> list = new ArrayList<String>();
        list.add("실전프로젝트1");
        list.add("이산수학");
        list.add("자바프로그래밍");
        model.addAttribute("classList",list);

        return "list1";
    }
}
