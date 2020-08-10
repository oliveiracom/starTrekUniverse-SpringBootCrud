package com.oliveiracom.startrekuniverse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oliveiracom.startrekuniverse.model;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long>{

}
