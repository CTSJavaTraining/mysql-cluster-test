package sample.data.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sample.data.rest.domain.EmployeeSalaries;
import sample.data.rest.domain.EmployeeSalariesId;

@RepositoryRestResource(collectionResourceRel = "employee-salaries", path = "employee-salaries")
public interface EmployeeSalariesRepository extends PagingAndSortingRepository<EmployeeSalaries, EmployeeSalariesId> {
	
}
