package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String skillsTracker(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>TypeScript</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "</h2>" +
                "</html>";
    }

    @GetMapping("form")
    public String favoriteLanguageForm(){
        return "<html>" +
                "<body>" +
                "<form action = 'choices' method = 'post'>" +
                "<h2>"+
                "<label for = 'name'>Name: </label>"+
//                "<br>"+
                "</h2>"+
                "<input type = 'text' name = 'name'>" +
                "<br>"+
                "<h2>"+
                "<label for = 'language-select'>My favorite language: </label>" +
                "</h2>"+
                "<select name = 'language1' id = 'language-select'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'TypeScript'>TypeScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "</select>"+
                "<h2>" +
                "<label for = 'language-select'>My second favorite language: </label>" +
                "</h2>" +
                "<select name = 'language2' id = 'language-select'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'TypeScript'>TypeScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "</select>"+
                "<h2>"+
                "<label for = 'language-select'>My third favorite language: </label>" +
                "</h2>"+
                "<select name = 'language3' id = 'language-select'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'TypeScript'>TypeScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "</select>"+
                "<br>"+
                "<br>"+
                "<input type = 'submit' value = 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

@PostMapping("choices")
    public String chosenLanguages (@RequestParam String name,@RequestParam String language1,@RequestParam String language2,@RequestParam String language3){
        return "<h1 style = 'color:indigo'>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>"+
                "<li>" + language2 + "</li>"+
                "<li>" + language3 + "</li>"+
                "</ol>";
    }
}
