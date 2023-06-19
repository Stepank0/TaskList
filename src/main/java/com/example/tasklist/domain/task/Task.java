package com.example.tasklist.domain.task;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {

    @Id
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime expirationDate;

}
