package com.nqt.cs1.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "informations")
public class Infomation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //    @OneToMany(mappedBy = "information")
//    private List<Employee> employees;
    private int type;
    private String reason;
    private LocalDate date;
}
