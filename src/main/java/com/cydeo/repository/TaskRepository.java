package com.cydeo.repository;

import com.cydeo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository <Task,Long> {

    //JPQL query
    @Query("SELECT COUNT(t) FROM Task t WHERE t.project.projectCode = ?1 AND t.taskStatus<> 'Completed' ")
    int totalNonCompletedTasks(String projectCode);

    //native Query
    @Query(value = "SELECT COUNT (*)" +
            "FROM tasks t JOIN projects p on t.project_id = p.id " +
            "WHERE p.project_code = ?1 AND t.task_status = 'COMPLETE'",nativeQuery = true)
    int totalCompletedTasks(String projectCode);
}
