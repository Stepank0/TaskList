package com.example.tasklist.repository.impl;

import com.example.tasklist.domain.tack.Tack;
import com.example.tasklist.repository.TackRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TackRepositoryImpl implements TackRepository {

    @Override
    public Optional<Tack> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Tack> findAllByUser(Long userId) {
        return null;
    }

    @Override
    public void assignToUserById(Long tackId, Long userId) {

    }

    @Override
    public void update(Tack tack) {

    }

    @Override
    public void create(Tack tack) {

    }

    @Override
    public void delete(Long id) {

    }

}
