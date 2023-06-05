package com.springboot.crud.service;

import com.springboot.crud.entity.Employee;

import java.util.List;

/**
 * The EmployeeService interface defines the contract for the service
 * layer operations on Employee entities.
 */
public interface EmployeeService {

    /**
     * Retrieves all employees.
     *
     * @return A list of all employees.
     */
    List<Employee> findAll();

    /**
     * Retrieves an employee by their ID.
     *
     * @param theId The ID of the employee to retrieve.
     * @return The employee with the specified ID, or null if not found.
     */
    Employee findById(int theId);

    /**
     * Saves an employee.
     *
     * @param theEmployee The employee to save.
     * @return The saved employee.
     */
    Employee save(Employee theEmployee);

    /**
     * Deletes an employee by their ID.
     *
     * @param theId The ID of the employee to delete.
     */
    void deleteById(int theId);
}
