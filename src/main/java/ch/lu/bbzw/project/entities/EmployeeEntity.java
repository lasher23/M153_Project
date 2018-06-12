package ch.lu.bbzw.project.entities;

import javax.persistence.*;

@Table(name = "employee", schema = "dbo")
@Entity
public class EmployeeEntity {
    @Id
    private long id;
    @Column
    private String prename;
    @Column
    private String lastname;
    @Column(unique = true)
    private String email;
    @ManyToOne
    @JoinColumn(name = "fk_boss")
    private EmployeeEntity boss;

    public long getId() {
        return id;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
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

    public EmployeeEntity getBoss() {
        return boss;
    }

    public void setBoss(EmployeeEntity boss) {
        this.boss = boss;
    }
}
