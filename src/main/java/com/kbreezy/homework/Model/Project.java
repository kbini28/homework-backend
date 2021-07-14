package com.kbreezy.homework.Model;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projectId;
	
	@Column(name = "project_name")
	private String projectName;
	
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
	
	public Project(String projectName, String difficulty, String category, String priority, double cost, boolean completed) {
		this.projectName = projectName;
		this.difficulty = difficulty;
		this.category = category;
		this.priority = priority;
		this.cost = cost;
		this.completed = completed;
	}
	
	// getters and setters
	//	projectName
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
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
