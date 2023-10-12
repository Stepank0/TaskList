package com.example.tasklist.repository;

import com.example.tasklist.domain.task.Task;


import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> findById(Long id);

    List<Task> findAllByUser (Long userId);

    void assignToUserById(Long tackId, Long userId);

    void update (Task tack);
    void create (Task tack);
    void delete (Long id);


}