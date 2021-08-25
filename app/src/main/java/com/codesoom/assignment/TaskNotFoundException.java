package com.codesoom.assignment;

/**
 * 할 일을 찾을 수 없는 경우에 던지는 예외입니다.
 */
public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long id) {
        super("Task not found: " + id);
    }
}
