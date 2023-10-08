package EmployeeDetailsProject.EmployeeDetails.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productTypeId;
    private String productTypeName;
    private String productTypeNameBn;
    private String sequenceNumber;

    @Enumerated(EnumType.STRING)
    private StatusCheck status;


//    @PrePersist
//    public void prePersist() {
//        this.active = true;
//    }
}
