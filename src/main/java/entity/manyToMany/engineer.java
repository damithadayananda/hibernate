package entity.manyToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="engineer")
public class engineer {
    @Id
    @Column(name="engineer_id")
    @GeneratedValue
    private int engineerId;

    @Column(name="name")
    private String name;

    @ManyToMany(mappedBy = "engineers")
    private Set<projects> projects = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<entity.manyToMany.projects> getProjects() {
        return projects;
    }

    public void setProjects(Set<entity.manyToMany.projects> projects) {
        this.projects = projects;
    }

    public int getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(int engineerId) {
        this.engineerId = engineerId;
    }

    @Override
    public String toString() {
        return "engineer{" +
                "engineerId=" + engineerId +
                ", name='" + name + '\'' +
                ", projects=" + projects +
                '}';
    }
}
