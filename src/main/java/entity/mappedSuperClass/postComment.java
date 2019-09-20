package entity.mappedSuperClass;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post_comment")
public class postComment extends BaseEntity{
    private String review;
    @ManyToOne(fetch = FetchType.LAZY)
    private post post;
}
