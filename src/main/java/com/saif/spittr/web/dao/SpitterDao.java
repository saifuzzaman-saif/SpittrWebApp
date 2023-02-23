package com.saif.spittr.web.dao;

import com.saif.spittr.web.model.Spitter;

public interface SpitterDao {

    void save(Spitter spitter);

    Spitter findByUsername(String username);
}
