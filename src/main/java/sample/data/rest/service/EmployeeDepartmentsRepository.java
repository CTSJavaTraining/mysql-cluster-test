package sample.data.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sample.data.rest.domain.EmployeeDepartment;
import sample.data.rest.domain.EmployeeDepartmentId;

@RepositoryRestResource(collectionResourceRel = "employee-departments", path = "employee-departments")
public interface EmployeeDepartmentsRepository extends JpaRepository<EmployeeDepartment, EmployeeDepartmentId> {
	
}
