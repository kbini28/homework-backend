package com.kbreezy.homework.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbreezy.homework.Model.Project;
import com.kbreezy.homework.Repository.ProjectRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/hw")
public class ProjectController {

	@Autowired
	ProjectRepository projectRepo;
	
	// get all projects
	@GetMapping("/projects")
	public ResponseEntity<List<Project>> getAllProjects() {
		try {
			List<Project> projects = new ArrayList<Project>();
			projectRepo.findAll().forEach(projects::add);
			if (projects.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(projects, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} // end getAllProjects()
	
	// get project by id
	@GetMapping("/projects/{id}")
	public ResponseEntity<Project> getProjectById(@PathVariable("id") long projectId) {
		Optional<Project> projectData = projectRepo.findById(projectId);
		
		if (projectData.isPresent()) {
			return new ResponseEntity<>(projectData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	} // end getProjectById()
	
	// create a new project
	@PostMapping("/projects")
	public ResponseEntity<Project> createProject(@RequestBody Project project) {
		try {
			Project _project = projectRepo
					.save(new Project(project.getProjectName(), project.getDifficulty(), project.getCategory(), project.getPriority(), project.getCost(), project.isCompleted()));
			return new ResponseEntity<>(_project, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} // end createProject()
	
	// update a project
	@PutMapping("projects/{id}")
	public ResponseEntity<Project> updateProject(@PathVariable("id") long projectId, @RequestBody Project project) {
		Optional<Project> projectData = projectRepo.findById(projectId); // goal says 'long id'
		
		if (projectData.isPresent()) {
			Project _project = projectData.get();
			_project.setProjectName(project.getProjectName());
			_project.setDifficulty(project.getDifficulty());
			_project.setCategory(project.getCategory());
			_project.setPriority(project.getPriority());
			_project.setCost(project.getCost());
			_project.setCompleted(project.isCompleted());
			
			return new ResponseEntity<>(projectRepo.save(_project), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	} // end updateProject()
	
	// delete a goal
	// also choosing not to have a "delete all" button
	@DeleteMapping("projects/{id}")
	public ResponseEntity<HttpStatus> deleteProject(@PathVariable("id") long projectId) {
		try {
			projectRepo.deleteById(projectId);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	} // end deleteProject()
	
	
	// mapping for findByCompleted() - for future features
//	  @GetMapping("/goals/active")
//	  public ResponseEntity<List<Goal>> findByActive() {
//	    try {
//	      List<Goal> goals = goalRepository.findByActive(true);
//
//	      if (goals.isEmpty()) {
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	      }
//	      return new ResponseEntity<>(goals, HttpStatus.OK);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
} // end class ProjectController
