package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="product_details")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class product {
    @Id
    @GeneratedValue
    @Column(name="p_id")
    private int product_id;

    @Column(name="p_name",nullable = false)
    private String product_name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int quantity;
}
