package com.springboot.crud.dao;

import com.springboot.crud.entity.Employee;

import java.util.List;

/**
 * The EmployeeDAO interface provides methods to perform CRUD operations on Employee entities.
 */
public interface EmployeeDAO {

    /**
     * Retrieves all employees from the database.
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
     * Saves an employee in the database.
     *
     * @param theEmployee The employee to save.
     * @return The saved employee.
     */
    Employee save(Employee theEmployee);

    /**
     * Deletes an employee from the database by their ID.
     *
     * @param theId The ID of the employee to delete.
     */
    void deleteById(int theId);
}