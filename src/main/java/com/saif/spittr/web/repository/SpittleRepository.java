package com.saif.spittr.web.repository;

import com.saif.spittr.web.exceptions.DuplicateSpittleException;
import com.saif.spittr.web.model.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpittleRepository {

    private static List<Spittle> spittleList = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            spittleList.add(new Spittle(Long.valueOf(i), "spiitle message " + i, new Date()));
        }
    }

    public static Spittle save(Spittle spittle) throws DuplicateSpittleException {
        for (Spittle existingSpittle : spittleList) {
            if (existingSpittle.getMessage().equals(spittle.getMessage())) {
                throw new DuplicateSpittleException();
            }
        }

        spittleList.add(spittle);
        spittle.setId((long) spittleList.size());

        return spittle;
    }

    public static List<Spittle> getRecentSpittles(int count) {
        List<Spittle> spittles = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            spittles.add(spittleList.get(i));
        }

        return spittles;
    }

    public static Spittle findById(Long id) {
        for (Spittle spittle : spittleList) {
            if (spittle.getId() == id) {
                return spittle;
            }
        }

        return null;
    }
}
