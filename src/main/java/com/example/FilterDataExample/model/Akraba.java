package com.example.FilterDataExample.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDateTime;

@Entity
@Table(name = "akraba")
@Data
public class Akraba {

    public static final String ZAMANPATTERIN = "yyyy-MM-dd HH:mm:ss";
    public static final String YILPATTERIN = "yyyy-MM-dd";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


    @Column(name = "dogumtarihi")
    @DateTimeFormat(pattern = ZAMANPATTERIN)
    private LocalDateTime dogumTarihi;

    @Column(name = "olumtarihi")
    @DateTimeFormat(pattern = ZAMANPATTERIN)
    private LocalDateTime olumTarihi;

    @Column(name = "ulke")
    private String  ulke;

    @Column(name = "name")
    private String  name;

    @Column(name = "lastname")
    private String  lastname;


}
