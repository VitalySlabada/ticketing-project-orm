package com.cydeo.service;


import com.cydeo.dto.TaskDTO;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    TaskDTO listAllTasks();
}
