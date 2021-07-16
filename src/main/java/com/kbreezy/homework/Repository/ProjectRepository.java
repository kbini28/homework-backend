package com.kbreezy.homework.Repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kbreezy.homework.Model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
//	List<Project> findByCompleted(boolean completed);
}
