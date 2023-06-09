package com.dlozano.daikichipathvariables.daikichipathvariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichipathvariablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaikichipathvariablesApplication.class, args);
    }
    @RequestMapping("/daikichi")
    public String welcome(){
        return "Welcome!";
    }
    @RequestMapping("/daikichi/today")
    public String today(){
        return "Today you will find luck in all your endeavors";
    }
    @RequestMapping("/daikichi/tomorrow")
    public String tomorrow(){
        return "Tomorrow an opportunity will arise, so be sure to be open to new ideas!";
    }
    @RequestMapping("/daikichi/travel/{location}")
    public String travel(@PathVariable("location") String location){
        return "Congratulations! You will soon travel to  " + location;
    }
    @RequestMapping("/daikichi/lotto/{number}")
    public String lotto(@PathVariable("number") String number){
//        return number;
        int intNumber = Integer.parseInt(number);
        if (intNumber %2 == 0){
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        }
        return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    }
}
