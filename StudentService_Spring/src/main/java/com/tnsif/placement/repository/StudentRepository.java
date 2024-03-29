package com.tnsif.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placement.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{

}
