package util;

import entity.compositePrimaryKey.com_employee;
import entity.compositePrimaryKey.com_employee_id;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

public class compositePrimaryKeyDemo {
    public static void main(String[] args){
        Session session =null;
        Transaction transaction =null;
        try {
            session=hibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            com_employee com_employee = new com_employee();
            com_employee_id com_employee_id = new com_employee_id(1, "IT");
            com_employee.setEmpName("damitha");
            com_employee.setId(com_employee_id);

            session.save(com_employee);
            transaction.commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
