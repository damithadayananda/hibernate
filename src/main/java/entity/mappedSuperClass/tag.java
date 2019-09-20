package entity.mappedSuperClass;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tag")
public class tag extends BaseEntity{
    @NaturalId
    private String name;
}
