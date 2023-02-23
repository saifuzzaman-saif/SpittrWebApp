package com.saif.spittr.web.controller;

import com.saif.spittr.web.dao.SpitterDao;
import com.saif.spittr.web.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private static final String VIEW = "registrationForm";

    @Autowired
    private SpitterDao spitterDao;

    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("spitter", new Spitter());

        return VIEW;
    }

    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(@RequestPart("profilePicture") MultipartFile profilePicture,
                                      @Valid Spitter spitter,
                                      Errors errors) throws IOException {
        if (errors.hasErrors()) {
            return VIEW;
        }

        spitterDao.save(spitter);
        profilePicture.transferTo(new File("H:/10.5/Spring/spittr/src/main/resources/uploads/" + profilePicture.getOriginalFilename()));

        return "redirect:/spitter/" + spitter.getUserName();
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showProfile(@PathVariable String username, Model model) {
        Spitter spitter = spitterDao.findByUsername(username);
        model.addAttribute("spitter", spitter);

        return "profile";
    }
}
