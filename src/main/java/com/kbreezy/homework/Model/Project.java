package com.kbreezy.homework.Model;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long projectId;
	
	@Column(name = "project_name")
	private String projectName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "difficulty")
	private String difficulty;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "priority")
	private String priority;
	
	@Column(name = "cost")
	private double cost;
	
	@Column(name = "completed")
	private boolean completed;
	
	public Project() {}
	
	public Project(String projectName, String description, String difficulty, String category, String priority, double cost, boolean completed) {
		this.projectName = projectName;
		this.description = description;
		this.difficulty = difficulty;
		this.category = category;
		this.priority = priority;
		this.cost = cost;
		this.completed = completed;
	}
	
	// getters and setters
	//	projectId
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	
	// projectName
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	// description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//	difficulty
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	//	category
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	//	priority
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	//	cost
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//	completed
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}
