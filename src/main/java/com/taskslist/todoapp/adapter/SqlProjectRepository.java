package com.taskslist.todoapp.adapter;

import com.taskslist.todoapp.model.Project;
import com.taskslist.todoapp.model.ProjectRepository;
import com.taskslist.todoapp.model.TaskGroup;
import com.taskslist.todoapp.model.TaskGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlProjectRepository extends ProjectRepository, JpaRepository<Project, Integer> {
    @Override
    @Query("select distinct p form Project p join fetch p.steps")
    List<Project> findAll();

}
