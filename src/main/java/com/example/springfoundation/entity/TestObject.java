package com.example.springfoundation.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "test_table")
@Data
public class TestObject {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "test_value")
    private String testValue;
}
