package util;

import entity.manyToOne.Department;
import entity.manyToOne.employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class oneToManyDemo {
    public static void main(String[] args){
        Session session = null;
        Transaction transaction=null;
        System.out.println("hibernate!");
        try{
            session = hibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

//            Department department = new Department();
//            department.setName("IT");
//            department.setId(1);
//            session.save(department);
//
//            employee employee = new employee();
//            employee.setName("damitha");
//            employee.setDepartment(department);
//            employee.setDesignation("se");
//            session.save(employee);
//
//            employee employee1 = new employee();
//            employee1.setName("daya");
//            employee1.setDesignation("sse");
//            employee1.setDepartment(department);
//            session.save(employee1);
//
//            transaction.commit();

            List<Department> departments = session.createQuery("from Department",Department.class).list();
            Iterator<Department> itr =departments.iterator();

            while (itr.hasNext()){
                System.out.println(itr.next().getEmployees());
            }
        }catch (Exception e){

        }
    }
}
