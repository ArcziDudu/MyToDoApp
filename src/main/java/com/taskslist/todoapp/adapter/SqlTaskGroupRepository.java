package com.taskslist.todoapp.adapter;

import com.taskslist.todoapp.model.Task;
import com.taskslist.todoapp.model.TaskGroup;
import com.taskslist.todoapp.model.TaskGroupRepository;
import com.taskslist.todoapp.model.TaskRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlTaskGroupRepository extends TaskGroupRepository, JpaRepository<TaskGroup, Integer> {
    @Override
    @Query("from TaskGroup g join fetch g.tasks")
    List<TaskGroup> findAll();

    @Override
    boolean existsByDoneIsFalseAndProject_Id(Integer projectId);
}
