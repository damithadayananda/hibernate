package entity.joinColumn;

import javax.persistence.*;

@Entity
@Table(name="email")
public class email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address")
    private String address;

    @JoinColumn(name = "employee_id",referencedColumnName = "student_id")
    @ManyToOne(optional = false)
    private student mystudent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public entity.joinColumn.student getStudent() {
        return mystudent;
    }

    public void setStudent(entity.joinColumn.student student) {
        this.mystudent = student;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "email{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", student=" + mystudent +
                '}';
    }
}
