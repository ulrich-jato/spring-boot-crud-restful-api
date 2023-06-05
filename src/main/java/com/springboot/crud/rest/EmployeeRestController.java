package com.springboot.crud.rest;

import com.springboot.crud.entity.Employee;
import com.springboot.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
/**
 * The EmployeeRestController class handles REST API requests for managing employees.
 */
public class EmployeeRestController {
    private EmployeeService employeeService;

    /**
     * Constructs a new EmployeeRestController with the specified EmployeeService.
     *
     * @param theEmployeeService The EmployeeService to be used for managing employees.
     */
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        this.employeeService = theEmployeeService;
    }

    /**
     * Retrieves all employees.
     *
     * @return A list of all employees.
     */
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param employeeId The ID of the employee to retrieve.
     * @return The employee with the specified ID.
     * @throws RuntimeException if the employee is not found.
     */
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);

        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        return theEmployee;
    }

    /**
     * Adds a new employee.
     *
     * @param theEmployee The employee to add.
     * @return The added employee.
     */
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        theEmployee.setId(0); // Set the ID to 0 to force saving as a new item

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    /**
     * Updates an existing employee.
     *
     * @param theEmployee The employee to update.
     * @return The updated employee.
     */
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    /**
     * Deletes an employee by their ID.
     *
     * @param employeeId The ID of the employee to delete.
     * @return A message indicating the deletion.
     * @throws RuntimeException if the employee is not found.
     */
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee tempEmployee = employeeService.findById(employeeId);

        if (tempEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        employeeService.deleteById(employeeId);

        return "Deleted employee id - " + employeeId;
    }
}
