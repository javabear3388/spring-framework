package com.springdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carts")
@Data
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "car_item_rel", // Rename the ManyToMany join table
            joinColumns = @JoinColumn(name="c_id"), //Rename the column names
            inverseJoinColumns = @JoinColumn(name = "i_id"))
    private List<Item> itemList; //or user Set, could be an advantage


}

