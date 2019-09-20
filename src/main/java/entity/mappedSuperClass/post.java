package entity.mappedSuperClass;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class post extends BaseEntity {
    private String title;
    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<postComment> comments = new ArrayList();
    @ManyToOne
    @JoinTable(name = "tag",joinColumns = @JoinColumn(name="post_id"),inverseJoinColumns = @JoinColumn(name="tag_id"))
    private Set tags = new HashSet();
}
