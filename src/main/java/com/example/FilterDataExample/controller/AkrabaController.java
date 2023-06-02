package com.example.FilterDataExample.controller;


import com.example.FilterDataExample.dto.AkrabaDTO;
import com.example.FilterDataExample.service.AkrabaService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static com.example.FilterDataExample.model.Akraba.ZAMANPATTERIN;


@RestController
@RequiredArgsConstructor
@RequestMapping("/akraba")
@CrossOrigin("*")
public class AkrabaController {


    private final AkrabaService akrabaService;

    @GetMapping("/filter")
    public ResponseEntity<List<AkrabaDTO>> filterArabaMarkalari(
            @RequestParam(name = "dogumTarihi", required = false) @DateTimeFormat(pattern = ZAMANPATTERIN) LocalDateTime dogumTarihi,
            @RequestParam(name = "startdogumTarihi", required = false) @DateTimeFormat(pattern = ZAMANPATTERIN)LocalDateTime startDogumTarihi,
            @RequestParam(name = "enddogumTarihi", required = false) @DateTimeFormat(pattern = ZAMANPATTERIN)LocalDateTime endDogumTarihi,
            @RequestParam(name = "olumTarihi", required = false) @DateTimeFormat(pattern = ZAMANPATTERIN) LocalDateTime olumTarihi,
            @RequestParam(name = "startstartOlumTarihi", required = false) @DateTimeFormat(pattern = ZAMANPATTERIN)LocalDateTime startOlumTarihi,
            @RequestParam(name = "endendOlumTarihi", required = false) @DateTimeFormat(pattern = ZAMANPATTERIN)LocalDateTime endOlumTarihi,
            @RequestParam(name = "ulke", required = false) String ulke,
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "lastname", required = false) String lastname) {
        List<AkrabaDTO> akrabaDTOList = akrabaService.filterArabaMarkalar(dogumTarihi,startDogumTarihi
                ,endDogumTarihi,olumTarihi,startOlumTarihi,endOlumTarihi,ulke,name,lastname);
        return ResponseEntity.ok(akrabaDTOList);
    }


}
