package com.springboot.crud.dao;

import com.springboot.crud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The EmployeeDAOJapImpl class is an implementation of the EmployeeDAO
 * interface that uses JPA and the EntityManager for database operations.
 */
@Repository
public class EmployeeDAOJapImpl implements EmployeeDAO {

    /**
     * The EntityManager used for performing database operations.
     */
    private EntityManager entityManager;

    /**
     * Constructs a new EmployeeDAOJapImpl with the specified EntityManager.
     *
     * @param theEntityManager The EntityManager to be used for database operations.
     */
    @Autowired
    public EmployeeDAOJapImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    /**
     * Retrieves all employees from the database.
     *
     * @return A list of all employees.
     */
    @Override
    public List<Employee> findAll() {
        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // return the results
        return employees;
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param theId The ID of the employee to retrieve.
     * @return The employee with the specified ID, or null if not found.
     */
    @Override
    public Employee findById(int theId) {
        // get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // return employee
        return theEmployee;
    }

    /**
     * Saves an employee in the database.
     *
     * @param theEmployee The employee to save.
     * @return The saved employee.
     */
    @Override
    public Employee save(Employee theEmployee) {
        // save employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        // return the dbEmployee
        return dbEmployee;
    }

    /**
     * Deletes an employee from the database by their ID.
     *
     * @param theId The ID of the employee to delete.
     */
    @Override
    public void deleteById(int theId) {
        // find employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // remove employee
        entityManager.remove(theEmployee);
    }
}
