package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.repositories.UserRepository;

@Controller
@SpringBootApplication
public class ShowPersonController {
	@Autowired
	private UserRepository userRepository; 
	
    @RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("aa", 11);

        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("xx", 11);
        Person p2 = new Person("yy", 22);
        Person p3 = new Person("zz", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        
        User user = userRepository.findUserById(1);
	
        
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        model.addAttribute("user",user);
        
        return "index";

    }
}
