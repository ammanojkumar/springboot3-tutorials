package io.mk.pos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "PROUDCT")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private String productd;
    private String name;
    private BigDecimal price;
}
