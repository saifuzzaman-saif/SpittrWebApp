package com.saif.spittr.web.dao;

import com.saif.spittr.web.model.Spitter;
import com.saif.spittr.web.repository.SpitterRepository;
import org.springframework.stereotype.Component;

@Component
public class SpitterDaoImpl implements SpitterDao{

    public void save(Spitter spitter) {
        SpitterRepository.saveSpitter(spitter);
    }

    public Spitter findByUsername(String username) {
        return SpitterRepository.findByUsername(username);
    }
}
