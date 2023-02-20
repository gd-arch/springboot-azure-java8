package com.demo.azure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Data

public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String city;
    private String sal;

}
