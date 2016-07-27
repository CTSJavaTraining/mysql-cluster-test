package sample.data.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sample.data.rest.domain.Departments;

@RepositoryRestResource(collectionResourceRel = "department", path = "department")
public interface DepartmentsRepository extends PagingAndSortingRepository<Departments, String> {
	
}
