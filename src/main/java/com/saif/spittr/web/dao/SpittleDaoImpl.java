package com.saif.spittr.web.dao;

import com.saif.spittr.web.exceptions.DuplicateSpittleException;
import com.saif.spittr.web.model.Spittle;
import com.saif.spittr.web.repository.SpittleRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpittleDaoImpl implements SpittleDao {

    @Override
    public List<Spittle> findRecentSpittles(int count) {
        return SpittleRepository.getRecentSpittles(count);
    }

    @Override
    public Spittle findById(Long id) {
        return SpittleRepository.findById(id);
    }

    @Override
    public Spittle save(Spittle spittle) throws DuplicateSpittleException {
        return SpittleRepository.save(spittle);
    }
}
