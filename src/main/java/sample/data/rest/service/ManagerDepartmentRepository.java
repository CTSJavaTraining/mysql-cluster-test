package sample.data.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sample.data.rest.domain.EmployeeDepartmentId;
import sample.data.rest.domain.ManagerDepartment;

@RepositoryRestResource(collectionResourceRel = "manager-departments", path = "manager-departments")
public interface ManagerDepartmentRepository extends PagingAndSortingRepository<ManagerDepartment, EmployeeDepartmentId> {
	
}
