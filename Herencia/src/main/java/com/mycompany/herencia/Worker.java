
package com.mycompany.herencia;

public class Worker extends Person{
    
    int num;
    String job;
    double Salary;

    public Worker(int num, String job, double Salary, String name, String lastName, String id, String direction, String phoneNumber) {
        super(name, lastName, id, direction, phoneNumber);
        this.num = num;
        this.job = job;
        this.Salary = Salary;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    
}
