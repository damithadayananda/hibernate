package entity.oneToMany;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNT")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer accountId;

    @Column(name="acc_number")
    private String accountNumber;

    @ManyToOne
    private EmployeeEntity employee;
}
