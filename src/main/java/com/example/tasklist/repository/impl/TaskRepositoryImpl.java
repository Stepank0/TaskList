package com.example.tasklist.repository.impl;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUser(Long userId) {
        return null;
    }

    @Override
    public void assignToUserById(Long tackId, Long userId) {

    }

    @Override
    public void update(Task tack) {

    }

    @Override
    public void create(Task tack) {

    }

    @Override
    public void delete(Long id) {

    }

}
