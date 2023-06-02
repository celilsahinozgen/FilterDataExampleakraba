package com.example.FilterDataExample.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AkrabaDTO {


    private LocalDateTime dogumTarihi;


    private LocalDateTime olumTarihi;


    private String  ulke;


    private String  name;


    private String  lastname;
}
