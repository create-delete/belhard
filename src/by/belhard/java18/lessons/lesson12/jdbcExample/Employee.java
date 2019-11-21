package by.belhard.java18.lessons.lesson12.jdbcExample;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Date dateOfEmployment;
    private Speciality speciality;
    private int salary;

    public Employee(int id, String name, Date dateOfEmployment, Speciality speciality, int salary) {
        this.id = id;
        this.name = name;
        this.dateOfEmployment = dateOfEmployment;
        this.speciality = speciality;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfEmployment=" + dateOfEmployment +
                ", speciality=" + speciality +
                ", salary=" + salary +
                '}';
    }
}
