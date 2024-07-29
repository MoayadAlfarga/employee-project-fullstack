package com.EmployeeSystem.EmployeeSystem.Entity;

import jakarta.persistence.*;


@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String educationalSpecialization;
    @Column
    private String HigherEducation;
    @Column
    private String homeAddress;
    @Column
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String nationalNumber;
    @Column
    private String dateOfBirth;
    @Column
    private String dateOfEmployment;
    @Column
    private String jopTitle;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEducationalSpecialization() {
        return educationalSpecialization;
    }

    public void setEducationalSpecialization(String educationalSpecialization) {
        this.educationalSpecialization = educationalSpecialization;
    }

    public String getHigherEducation() {
        return HigherEducation;
    }

    public void setHigherEducation(String higherEducation) {
        HigherEducation = higherEducation;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getJopTitle() {
        return jopTitle;
    }

    public void setJopTitle(String jopTitle) {
        this.jopTitle = jopTitle;
    }


    @Override
    public String toString() {
        return "Employee{" +
                  "id=" + id +
                  ", firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", educationalSpecialization='" + educationalSpecialization + '\'' +
                  ", HigherEducation='" + HigherEducation + '\'' +
                  ", homeAddress='" + homeAddress + '\'' +
                  ", email='" + email + '\'' +
                  ", phoneNumber='" + phoneNumber + '\'' +
                  ", nationalNumber='" + nationalNumber + '\'' +
                  ", dateOfBirth='" + dateOfBirth + '\'' +
                  ", dateOfEmployment='" + dateOfEmployment + '\'' +
                  ", jopTitle='" + jopTitle + '\'' +
                  '}';
    }
}
