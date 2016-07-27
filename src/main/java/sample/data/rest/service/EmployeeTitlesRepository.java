package sample.data.rest.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sample.data.rest.domain.EmployeeTitles;
import sample.data.rest.domain.EmployeeTitlesId;

@RepositoryRestResource(collectionResourceRel = "employee-titles", path = "employee-titles")
public interface EmployeeTitlesRepository extends PagingAndSortingRepository<EmployeeTitles, EmployeeTitlesId> {
	
}
