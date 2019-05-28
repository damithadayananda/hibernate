package entity.manyToOne;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE_TWO")
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
    private long id;
    @Column(name="NAME",nullable = false)
    private String name;
    @Column(name="DESIGNATION")
    private String designation;
    @ManyToOne
    @JoinColumn(name = "DPT_ID",referencedColumnName = "DPT_ID")
    private Department department;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    @Override
    public String toString(){
        return "{id:"+id+",name:"+name+",designation:"+designation+"department:"+department+"}";
    }
}
