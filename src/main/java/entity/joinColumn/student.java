package entity.joinColumn;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="student")
public class student {
    @Id
    @Column(name="student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "mystudent")
    private List<email> emails;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "student_subject",
            joinColumns = {@JoinColumn(name="student_id")},
            inverseJoinColumns = {@JoinColumn(name="id")}
    )
    private Set<subject> subjects = new HashSet<>();

    public Set<subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<subject> subjects) {
        this.subjects = subjects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<email> getEmails() {
        return emails;
    }

    public void setEmails(List<email> emails) {
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return  "student{"+
                "id=" + id +
                ", name="+name;
    }
}
