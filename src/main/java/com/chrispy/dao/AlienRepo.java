package com.chrispy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.chrispy.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
	
	@Autowired
	List<Alien> findByAname(String aname);
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("FROM Alien WHERE tech =?1 ORDER BY aname")
	List<Alien> findByTechSorted(String tech);

}
