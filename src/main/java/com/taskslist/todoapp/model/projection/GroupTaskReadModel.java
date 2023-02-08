package com.taskslist.todoapp.model.projection;

import com.taskslist.todoapp.model.Task;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupTaskReadModel {
    private String description;
    private boolean done;
    public GroupTaskReadModel(Task source){
        description = source.getDescription();
        done = source.isDone();
    }
}
