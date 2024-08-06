package chandansharma_spring_boot.projects_spring.Presentation;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;


@Component//this will create the objects in the ioc container
@Entity

public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    private float salary;


    public UserDetails(){

    }

    public UserDetails(int id ,String firstname, String lastname, int age, float salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;

    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public int getAge(){
        return  age;
    }

    public void setAge(int age){
        this.age =age;
    }

    public float getSalary(){
        return salary;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }


}


