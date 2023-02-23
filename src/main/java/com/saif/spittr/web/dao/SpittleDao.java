package com.saif.spittr.web.dao;

import com.saif.spittr.web.exceptions.DuplicateSpittleException;
import com.saif.spittr.web.model.Spittle;

import java.util.List;

public interface SpittleDao {

    Spittle save(Spittle spittle) throws DuplicateSpittleException;

    List<Spittle> findRecentSpittles(int count);

    Spittle findById(Long id);
}
