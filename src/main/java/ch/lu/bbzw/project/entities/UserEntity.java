package ch.lu.bbzw.project.entities;

import javax.persistence.*;

@Entity
@Table(name = "dbo.User")
public class UserEntity {
    @Id
    private long id;
    @Column
    private String password;
    @JoinColumn(name = "fk_employee")
    @ManyToOne
    private EmployeeEntity employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }
}
