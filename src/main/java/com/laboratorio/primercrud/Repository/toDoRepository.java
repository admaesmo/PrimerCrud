package com.laboratorio.primercrud.Repository;

import com.laboratorio.primercrud.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface toDoRepository extends JpaRepository<Task, Long> {
}
