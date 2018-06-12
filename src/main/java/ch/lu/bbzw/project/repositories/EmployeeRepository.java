package ch.lu.bbzw.project.repositories;

import ch.lu.bbzw.project.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<EmployeeEntity, Long>{

}
