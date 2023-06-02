package com.example.FilterDataExample.service;



import com.example.FilterDataExample.config.AkrabaSpecification;
import com.example.FilterDataExample.dto.AkrabaDTO;
import com.example.FilterDataExample.model.Akraba;
import com.example.FilterDataExample.repository.AkrabaRepository;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AkrabaService {


    private final ModelMapper modelMapper;
    private final AkrabaRepository akrabaRepository;


    public List<AkrabaDTO> filterArabaMarkalar(LocalDateTime dogumTarihi, LocalDateTime startDogumTarihi, LocalDateTime endDogumTarihi,
                                               LocalDateTime olumTarihi, LocalDateTime startOlumTarihi, LocalDateTime endOlumTarihi,
                                               String ulke, String name, String lastname) {

        try {
            Specification<Akraba> akrabaSpecification = Specification.where(null);
                if (dogumTarihi != null || startDogumTarihi != null || endDogumTarihi != null){
                    akrabaSpecification = akrabaSpecification.and(AkrabaSpecification.dogumTarihiBetween(dogumTarihi,startDogumTarihi,endDogumTarihi));
                }

            if (olumTarihi != null || startOlumTarihi != null || endOlumTarihi != null){
                akrabaSpecification = akrabaSpecification.and(AkrabaSpecification.olumTarihiBetween(olumTarihi,startOlumTarihi,endOlumTarihi));
            }
                if (ulke != null){
                    akrabaSpecification = akrabaSpecification.and(AkrabaSpecification.ulkeEquals(ulke));
                }
            if (name != null){
                akrabaSpecification = akrabaSpecification.and(AkrabaSpecification.nameEquals(name));
            }
            if (lastname != null){
                akrabaSpecification = akrabaSpecification.and(AkrabaSpecification.nameEquals(lastname));
            }

            List<Akraba> AkrabaList = akrabaRepository.findAll(akrabaSpecification);

            List<AkrabaDTO> akrabaDTOList = AkrabaList.stream().map(akraba ->
                    modelMapper.map(akraba, AkrabaDTO.class)).collect(Collectors.toList());
            return akrabaDTOList;
        }
        catch (Exception e) {
            throw  new RuntimeException("AkrabaService de bir hata oluştu  : " + e.getMessage(), e);
        }

    }
}
//Deprecated
//@PatchMapping
