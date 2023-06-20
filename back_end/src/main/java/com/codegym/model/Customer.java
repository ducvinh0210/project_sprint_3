package com.codegym.model;


import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCustomer;
    private String nameCustomer;
    private String dateOfBirth;
    private String idCard;
    private String phoneNumber;
    private String address;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "id")
    private CustomerType customerType;
}
