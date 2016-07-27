package sample.data.rest.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity (name = "ManagerDepartment")
@Table(name ="dept_manager")
public class ManagerDepartment extends EmployeeDepartment {
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "DepartmentManager [getEmpNo()=" + getEmpNo() + ", getDeptNo()=" + getDeptNo() + "]";
	}
	
}

