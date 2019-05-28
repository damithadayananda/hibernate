package entity.otherAnnotation;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book")
public class book {
    @Id
    // @Basic(optional=false)//indicate that value of this field can't be null
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bookID")
    private Integer BookID;

    @Column(name="Name")
    private String name;
    @Column(name = "Author")
    private String author;
    @Column(name="price")
    private double price;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="First_Release_Date")
    private java.util.Date firstReleaseDate;
    @Transient //use to denote this field is not for persist
    private boolean isAvailable;

    public Integer getBookId() {
        return BookID;
    }

    public void setBookId(String bookId) {
        this.BookID = BookID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(Date firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString(){
        return "Book{"+"Book_Id:"+BookID+",Name:"+name+",Author:"+author+"price:"+price+"first_Release_Date"+"}";
    }
}
