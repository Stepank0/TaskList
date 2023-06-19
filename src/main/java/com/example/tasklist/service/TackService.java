package com.example.tasklist.service;

import com.example.tasklist.domain.tack.Tack;

import java.util.List;

public interface TackService {

    Tack getById(Long id);

    List<Tack> getAllByUser(Long id);

    Tack update(Tack tack);

    Tack create(Tack tack);

    void delete(Long id);

}
