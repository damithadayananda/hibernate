package util;

import entity.otherAnnotation.book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.text.SimpleDateFormat;
import java.util.Date;

public class otherAnnotationDemo {
   public static void main(String[] args){
       Session session = null;
       Transaction transaction = null;
       try {
           session = hibernateUtil.getSessionFactory().openSession();
           transaction = session.beginTransaction();
           book book = new book();
           book.setName("Madol Duwa");
           book.setAuthor("Martin Wickramasinghe");
           book.setPrice(250);
           Date date = new java.sql.Date(new java.util.Date().getTime());
           book.setFirstReleaseDate(date);
           session.save(book);

           transaction.commit();
       }catch (Exception ex){
           ex.printStackTrace();
       }
   }
}
