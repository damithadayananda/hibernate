package util;

import entity.manyToOne.Department;
import entity.manyToOne.employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class manyToOneDemo {
    public static void main(String[] args){
        Session session =null;
        Transaction transaction = null;
        try {
            session = hibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            transaction.begin();

            Department department = new Department();
            department.setName("IT Department");

            employee employee1 = new employee();
            employee1.setName("SCOTT");
            employee1.setDesignation("Developer");
            employee1.setDepartment(department);

            employee employee2 = new employee();
            employee2.setName("ADAMS");
            employee2.setDesignation("s.Developer");
            employee2.setDepartment(department);

            employee employee3 = new employee();
            employee3.setName("MILLER");
            employee3.setDesignation("Manager");
            employee3.setDepartment(department);

            session.save(department);
            session.save(employee1);
            session.save(employee2);
            session.save(employee3);

            transaction.commit();

        }catch (Exception ex){
            if(transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }finally {
            if(session != null){
                session.close();
            }
        }
    }
}
