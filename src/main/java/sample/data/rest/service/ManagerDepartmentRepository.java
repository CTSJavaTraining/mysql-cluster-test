package sample.data.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sample.data.rest.domain.EmployeeDepartmentId;
import sample.data.rest.domain.ManagerDepartment;

@RepositoryRestResource(collectionResourceRel = "manager-departments", path = "manager-departments")
public interface ManagerDepartmentRepository extends JpaRepository<ManagerDepartment, EmployeeDepartmentId> {
	
}
