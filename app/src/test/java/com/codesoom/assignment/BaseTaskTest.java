package com.codesoom.assignment;

import com.codesoom.assignment.models.Task;
import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.List;

public class BaseTaskTest {

    protected static final long TASK_ID_1 = 1L;
    protected static final long TASK_ID_2 = 2L;
    protected static final String TASK_TITLE_1 = "To complete CodeSoom assignment";
    protected static final String TASK_TITLE_2 = "To write test code";
    protected static final String ERROR_MSG_TASK_NOT_FOUND = "Task not found";
    protected static final String ERROR_MSG_TASK_FORMAT_BAD = "Task format is poor";

    protected List<Task> generateEmptyTaskList() {
        return new ArrayList<>();
    }

    protected List<Task> generateFilledTaskList() {
        return Lists.newArrayList(generateNewTask(TASK_ID_1, TASK_TITLE_1), generateNewTask(TASK_ID_2, TASK_TITLE_2));
    }

    protected Task generateNewTask(String taskTitle) {
        return this.generateNewTask(null, taskTitle);
    }

    protected Task generateNewTask(Long taskId, String taskTitle) {
        Task newTask = new Task();

        newTask.setId(taskId);
        newTask.setTitle(taskTitle);

        return newTask;
    }

    protected String getTaskJsonString(Long taskId, String taskTitle) {
        return String.format("\"id\":%d, \"title\":\"%s\"", taskId, taskId);
    }

}
