package io.mk.pos.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "CUSTOMER")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private String customerId;
    private String name;
    private String phone;
}
