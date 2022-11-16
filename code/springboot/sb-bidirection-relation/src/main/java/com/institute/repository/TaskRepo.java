package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {

}
