package entity.compositePrimaryKey;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "com_employee")
public class com_employee {
    @EmbeddedId
    private com_employee_id id;
    @Column(name="EMP_NAME")
    private String empName;

    public com_employee(){

    }

    public com_employee(com_employee_id id,String empName){
        this.id=id;
        this.empName=empName;
    }

    public com_employee_id getId() {
        return id;
    }

    public void setId(com_employee_id id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
