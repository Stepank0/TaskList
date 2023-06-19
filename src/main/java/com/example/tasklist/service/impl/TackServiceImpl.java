package com.example.tasklist.service.impl;

import com.example.tasklist.domain.tack.Tack;
import com.example.tasklist.service.TackService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TackServiceImpl implements TackService {

    @Override
    public Tack getById(Long id) {
        return null;
    }

    @Override
    public List<Tack> getAllByUser(Long id) {
        return null;
    }

    @Override
    public Tack update(Tack tack) {
        return null;
    }

    @Override
    public Tack create(Tack tack) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
