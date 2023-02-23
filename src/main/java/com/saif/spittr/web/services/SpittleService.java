package com.saif.spittr.web.services;

import com.saif.spittr.web.dao.SpittleDao;
import com.saif.spittr.web.model.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SpittleService {

    @Autowired
    private SpittleDao spittleDao;

    public Spittle save(Spittle spittle) {
        spittle.setTime(new Date());
        return spittleDao.save(spittle);
    }
}
