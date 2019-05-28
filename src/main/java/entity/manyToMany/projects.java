package entity.manyToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="projects")
public class projects {
    @Id
    @Column(name="project_id")
    @GeneratedValue
    private int projectId;

    @Column(name="title")
    private String title;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name="project_engineer",
            joinColumns = {@JoinColumn(name="project_id")},
            inverseJoinColumns = {@JoinColumn(name="engineer_id")}
    )
    Set<engineer> engineers = new HashSet<>();

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<engineer> getEngineers() {
        return engineers;
    }

    public void setEngineers(Set<engineer> engineers) {
        this.engineers = engineers;
    }

    @Override
    public String toString() {
        return "projects{" +
                "projectId=" + projectId +
                ", title='" + title + '\'' +
                ", engineers=" + engineers +
                '}';
    }
}
