package com.codesoom.assignment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TaskNotFoundExceptionTest {

    private static final long id = 1L;

    @Test
    @DisplayName("예외 메시지 테스트")
    void test_exception_message() {
        assertThat(new TaskNotFoundException(id))
            .hasMessage("Task not found: " + id);
    }
}