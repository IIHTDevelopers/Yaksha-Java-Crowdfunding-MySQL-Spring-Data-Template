package com.crowdfunding.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class Project {
	private Long id;

	private String name;

	private String description;

	private Double goalAmount;

	private Double amountRaised = 0.0; // Initialize with 0.0

	private List<Investment> investments = new ArrayList<>();

	public Project() {
		super();
	}

	public Project(Long id, @NotBlank(message = "Project name is required") String name, String description,
			Double goalAmount, Double amountRaised, List<Investment> investments) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.goalAmount = goalAmount;
		this.amountRaised = amountRaised;
		this.investments = investments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getGoalAmount() {
		return goalAmount;
	}

	public void setGoalAmount(Double goalAmount) {
		this.goalAmount = goalAmount;
	}

	public Double getAmountRaised() {
		return amountRaised;
	}

	public void setAmountRaised(Double amountRaised) {
		this.amountRaised = amountRaised;
	}

	public List<Investment> getInvestments() {
		return investments;
	}

	public void setInvestments(List<Investment> investments) {
		this.investments = investments;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + ", goalAmount=" + goalAmount
				+ ", amountRaised=" + amountRaised + ", investments=" + investments + "]";
	}
}
