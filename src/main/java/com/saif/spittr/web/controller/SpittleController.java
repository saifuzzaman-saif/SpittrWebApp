package com.saif.spittr.web.controller;

import com.saif.spittr.web.dao.SpittleDao;
import com.saif.spittr.web.exceptions.SpittleNotFoundException;
import com.saif.spittr.web.model.Spittle;
import com.saif.spittr.web.services.SpittleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

import static java.util.Objects.isNull;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private static final String VIEW = "spittles";
    private static final String SPITTLE_FORM_VIEW = "spittleForm";
    private static final String INT_MAX_AS_STRING = "5";

    @Autowired
    private SpittleDao spittleDao;

    @Autowired
    private SpittleService spittleService;

    @RequestMapping(method = GET, value = "/new")
    public String show(Model model) {
        model.addAttribute("spittle", new Spittle());

        return SPITTLE_FORM_VIEW;
    }

    @RequestMapping(method = POST)
    public String save(@Valid Spittle spittle, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return SPITTLE_FORM_VIEW;
        }

        spittle = spittleService.save(spittle);

        return "redirect:/spittles/find?id=" + spittle.getId();
    }

    @RequestMapping(method = GET)
    public String spittles(@RequestParam(value = "count", defaultValue = INT_MAX_AS_STRING) int count, Model model) {
        model.addAttribute(spittleDao.findRecentSpittles(count));

        return VIEW;
    }

    @RequestMapping(value = "/find", method = GET)
    public String findById(@RequestParam(value = "id") Long id, Model model) {
        Spittle spittle = spittleDao.findById(id);
        if (isNull(spittle)) {
            throw new SpittleNotFoundException();
        }

        model.addAttribute("spittle", spittleDao.findById(id));

        return "spittle";
    }
}
