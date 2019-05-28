package util;

import entity.manyToMany.engineer;
import entity.manyToMany.projects;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class manyToManyDemo {
    public static void main(String[] args){
        Session session=null;
        Transaction transaction = null;
        try{
            session = hibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Set<engineer> engineers = new HashSet<>();

            engineer engineer = new engineer();
            engineer.setName("damitha");

            engineer engineer1 = new engineer();
            engineer1.setName("dayananda");

            engineers.add(engineer);
            engineers.add(engineer1);

            projects projects = new projects();
            projects.setProjectId(1);
            projects.setTitle("electrical");
            projects.setEngineers(engineers);

            session.save(projects);

            transaction.commit();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
