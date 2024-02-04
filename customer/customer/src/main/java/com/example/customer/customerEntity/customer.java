package com.example.customer.customerEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String FirstName;
    private String LastName;
    private String Street;
    private String Address;
    private String City;
    private String State;
    private String email;
    private String phone;


}
