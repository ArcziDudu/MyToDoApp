package com.taskslist.todoapp.adapter;

import com.taskslist.todoapp.model.Task;
import com.taskslist.todoapp.model.TaskRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SqlTaskRepository extends TaskRepository, JpaRepository<Task, Integer> {
    @Override
    @Query(nativeQuery = true, value = "select count(*)>0 from tasks where id=:id")
    boolean existsById(@Param("id") Integer id);

    boolean existsByDoneIsFalseAndGroup_Id(Integer groupId);
}
