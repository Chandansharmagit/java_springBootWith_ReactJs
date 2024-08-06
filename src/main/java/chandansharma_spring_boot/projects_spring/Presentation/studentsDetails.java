package chandansharma_spring_boot.projects_spring.Presentation;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class studentsDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String parentname;
    private int parentcontact;
    private String address;
    private String previousschool;
    private float gpa;
    private String password;
    private String cpassword;


    public studentsDetails(){

    }

    public studentsDetails(int id, String firstname, String lastname, String email, String phone, String parentname, int parentcontact, String address, String previousschool, float gpa, String password, String cpassword) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.parentname = parentname;
        this.parentcontact = parentcontact;
        this.address = address;
        this.previousschool = previousschool;
        this.gpa = gpa;
        this.password = password;
        this.cpassword = cpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public int getParentcontact() {
        return parentcontact;
    }

    public void setParentcontact(int parentcontact) {
        this.parentcontact = parentcontact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPreviousschool() {
        return previousschool;
    }

    public void setPreviousschool(String previousschool) {
        this.previousschool = previousschool;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
}
