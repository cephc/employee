package emp;

import java.util.Scanner;

public class Employee {
//instance variables
    private String name;
    private double salary;
    private String nickName;
//constructors
    public Employee(){
    }
    public Employee(String name, double salary, String nickName){
        this.name = name;
        this.salary = salary;
        this.nickName = nickName;
    }
//setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setNickName(String nickName){
        this.nickName = nickName;
    }
//getters
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    //method
    Scanner scan = new Scanner(System.in);
    int raise = scan.nextInt();
    public double raiseSalary() {
        return salary * raise;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
    public String namePrint() {
        return "The employee's name is " + name;
    }
    public String both(String name, String nickName){
        return "The employee's name is" + name + " and the employee's nickname is " + nickName + ".";
    }
}
