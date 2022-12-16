package com.homework.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// 2022.12.16(금) 22h50 프로젝트 생성

/**
 * ‘To-do Application !’라는 문자열을 출력할 수 있는 간단한 API
 */
@RestController
public class ToDoController {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}
