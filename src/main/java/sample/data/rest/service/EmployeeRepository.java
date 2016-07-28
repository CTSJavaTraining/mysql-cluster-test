package sample.data.rest.service;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import sample.data.rest.domain.Employee;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@RestResource(path ="/first-name")
	Set<Employee> findByFirstNameLikeIgnoreCase(@Param("firstName") String firstName);
	@RestResource(path ="/last-name")
	Set<Employee> findByLastNameLikeIgnoreCase(@Param("lastName") String lastName);
}