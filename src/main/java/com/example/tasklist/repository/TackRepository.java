package com.example.tasklist.repository;

import com.example.tasklist.domain.tack.Tack;


import java.util.List;
import java.util.Optional;

public interface TackRepository {

    Optional<Tack> findById(Long id);

    List<Tack> findAllByUser (Long userId);

    void assignToUserById(Long tackId, Long userId);

    void update (Tack tack);
    void create (Tack tack);
    void delete (Long id);

}
