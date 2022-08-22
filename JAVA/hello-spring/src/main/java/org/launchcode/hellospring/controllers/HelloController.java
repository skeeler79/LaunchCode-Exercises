package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //create handler that handles request of the form /hello?name=LaunchCode

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String languages) {
        String properGreeting = HelloController.createMessage(name, languages);
        return "<h3 style = 'color:purple;'>" + properGreeting + "</h3>";
    }


    //handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello" + name + "!";
    }

    @GetMapping("form")
//    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello' method = 'post'>" +
                "<input type = 'text' name = 'name'>" +
                "<label for = 'language-select'>Select a language:</label>" +
                "<select name = 'languages' id = 'language-select'>" +
                "<option value = 'English'>English</option>" +
                "<option value = 'French'>French</option>" +
                "<option value = 'Spanish'>Spanish</option>" +
                "<option value = 'Italian'>Italian</option>" +
                "<option value = 'Chinese'>Chinese</option>" +
                "<option value = 'German'>German</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    public static String createMessage(String name, String languages) {
        if (languages.equals("English")) {
            return "Hello, " + name;
        } else if (languages.equals("French")) {
            return "Bonjour, " + name;
        } else if (languages.equals("Spanish")) {
            return "Hola, " + name;
        } else if (languages.equals("Italian")) {
            return "Ciao, " + name;
        } else if (languages.equals("Chinese")) {
            return "Ni hao, " + name;
        } else if (languages.equals("German")) {
            return "Hallo, " + name;
        }
        return "Hello, " + name;
    }
}






