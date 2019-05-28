package entity.compositePrimaryKey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class com_employee_id implements Serializable {
    @Column(name="EMP_ID")
    private int empId;
    @Column(name="DEPARTMENT")
    private String department;

    public com_employee_id(){
        super();
    }
    public com_employee_id(int empId,String department){
        super();
        this.empId = empId;
        this.department =department;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((department == null)?0:department.hashCode());
        result = prime * result+empId;
        return result;
    }
}
