package com.springboot.crud.service;

import com.springboot.crud.dao.EmployeeDAO;
import com.springboot.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The EmployeeServiceImpl class is an implementation of the EmployeeService
 * interface that provides operations for managing employees.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    /**
     * The EmployeeDAO used for accessing the database.
     */
    private EmployeeDAO employeeDAO;

    /**
     * Constructs a new EmployeeServiceImpl with the specified EmployeeDAO.
     *
     * @param theEmployeeDAO The EmployeeDAO to be used for accessing the database.
     */
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        this.employeeDAO = theEmployeeDAO;
    }

    /**
     * Retrieves all employees.
     *
     * @return A list of all employees.
     */
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param theId The ID of the employee to retrieve.
     * @return The employee with the specified ID, or null if not found.
     */
    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    /**
     * Saves an employee.
     *
     * @param theEmployee The employee to save.
     * @return The saved employee.
     */
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    /**
     * Deletes an employee by their ID.
     *
     * @param theId The ID of the employee to delete.
     */
    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }
}
