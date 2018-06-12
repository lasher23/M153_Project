package ch.lu.bbzw.project.controllers;

import ch.lu.bbzw.project.entities.EmployeeEntity;
import ch.lu.bbzw.project.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.invoke.empty.Empty;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<EmployeeEntity> getAll() {
        return employeeRepository.findAll();
    }
}
