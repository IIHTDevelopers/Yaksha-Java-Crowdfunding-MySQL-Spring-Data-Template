package com.crowdfunding.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crowdfunding.entity.Investment;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {

	// Finds all investments associated with a specific project ID.

	// Finds all investments made by an investor with the specified name.

	// Custom query to fetch investments for a given project ID, demonstrating JPQL
	// usage.
}
