package com.springboot.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
/**
 * The Employee class represents an employee entity in the database.
 */
public class Employee {
    // define fields

    /**
     * The ID of the employee.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    /**
     * The first name of the employee.
     */
    @Column(name="first_name")
    private String firstName;

    /**
     * The last name of the employee.
     */
    @Column(name="last_name")
    private String lastName;

    /**
     * The email of the employee.
     */
    @Column(name="email")
    private String email;

    /**
     * Constructs an empty Employee object.
     */
    public Employee(){}

    /**
     * Constructs an Employee object with the specified first name, last name, and email.
     *
     * @param firstName The first name of the employee.
     * @param lastName The last name of the employee.
     * @param email The email of the employee.
     */
    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // define getter/setter

    /**
     * Returns the ID of the employee.
     *
     * @return The ID of the employee.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the employee.
     *
     * @param id The ID of the employee.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the first name of the employee.
     *
     * @return The first name of the employee.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the employee.
     *
     * @param firstName The first name of the employee.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the employee.
     *
     * @return The last name of the employee.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the employee.
     *
     * @param lastName The last name of the employee.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the email of the employee.
     *
     * @return The email of the employee.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the employee.
     *
     * @param email The email of the employee.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    // define toString

    /**
     * Returns a string representation of the Employee object.
     *
     * @return A string representation of the Employee object.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
