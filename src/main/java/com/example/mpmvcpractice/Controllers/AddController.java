package com.example.mpmvcpractice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.mpmvcpractice.Pojo.Numbers;
import java.util.List;
import java.util.Map;

@Controller
public class AddController {

    @RequestMapping("/")
    public String home() {
        return "Input";
    }


    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("numbers") Numbers numbers) {

        int numberA = Integer.parseInt(numbers.getNumA());
        int numberB = Integer.parseInt(numbers.getNumB());
        int numberC = Integer.parseInt(numbers.getNumC());
        int numberD = Integer.parseInt(numbers.getNumD());
        int sum = numberA+numberB+numberC+numberD;
        model.addAttribute("sum", sum);
        return "Output";

    }
}
