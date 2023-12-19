package com.fowobi.h2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "tbl_footwear")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Footwear {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;
    private int size;
    private String colour;
    private String texture;
    private String brand;
}
