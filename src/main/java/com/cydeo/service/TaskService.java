package com.cydeo.service;


import com.cydeo.dto.TaskDTO;
import org.springframework.stereotype.Service;
import java.util.List;

//@Service
public interface TaskService {

    List<TaskDTO> listAllTasks();

    TaskDTO findById(Long id);
    void save(TaskDTO dto);
    void update(TaskDTO dto);
    void delete(Long id);
    int totalNonCompletedTasks(String projectCode);
    int totalCompletedTasks (String projectCode);
}
