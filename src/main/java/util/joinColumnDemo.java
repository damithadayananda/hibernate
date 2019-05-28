package util;

import entity.joinColumn.email;
import entity.joinColumn.student;
import entity.joinColumn.subject;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class joinColumnDemo {
    public static void main(String[] args){
        Session session =null;
        Transaction transaction =null;

        try{
           session=hibernateUtil.getSessionFactory().openSession();
           transaction = session.beginTransaction();

           subject subject1 = new subject();
           subject1.setId(1);
           subject1.setName("english");

           subject subject2 = new subject();
           subject2.setId(2);
           subject2.setName("sinhala");

           Set<subject> subjects = new HashSet<>();
           subjects.add(subject1);
           subjects.add(subject2);

           student student = new student();
           student.setName("damitha");

           student.setSubjects(subjects);

           email email = new email();
           email.setAddress("damithadayananda@gmail.com");
           email.setStudent(student);

           email email1 =new email();
           email1.setAddress("damitha@pickme.lk");
           email1.setStudent(student);

           session.save(student);
           session.save(email);
           session.save(email1);

           transaction.commit();

//           List<student> students = session.createQuery("from student",student.class).list();
//           System.out.println(student.getName());
//           System.out.println(students.get(0).getEmails().get(0).getAddress());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
