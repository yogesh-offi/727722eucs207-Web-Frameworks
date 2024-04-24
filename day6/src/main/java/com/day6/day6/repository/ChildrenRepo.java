package com.day6.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day6.day6.model.Children;

@Repository
public interface ChildrenRepo extends JpaRepository<Children,Integer>{

}
