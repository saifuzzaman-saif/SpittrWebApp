package com.saif.spittr.web.repository;

import com.saif.spittr.web.model.Spitter;

import java.util.ArrayList;
import java.util.List;

public class SpitterRepository {

    private SpitterRepository(){}

    public static List<Spitter> spitterList = new ArrayList<>();

    public static void saveSpitter(Spitter spitter) {
        spitterList.add(spitter);
    }

    public static Spitter findByUsername(String username) {
        for (Spitter spitter : spitterList) {
            if (spitter.getUserName().equals(username)) {
                return spitter;
            }
        }

        return null;
    }
}
