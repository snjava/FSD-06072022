package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.institute.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "Update Employee set city= :ct where id= :id")
	public void updateEmpCityHql(@Param("ct") String city, @Param("id") int id);
	
	
	@Transactional
	@Modifying
	@Query(value = "Update empinfo set city= :ct where empid= :id", nativeQuery = true)
	public void updateEmpCitySql(@Param("ct") String city, @Param("id") int id);
}
