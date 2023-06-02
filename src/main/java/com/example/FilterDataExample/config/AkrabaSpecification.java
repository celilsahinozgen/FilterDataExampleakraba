package com.example.FilterDataExample.config;



import com.example.FilterDataExample.model.Akraba;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;


public class AkrabaSpecification {


    public static Specification<Akraba> dogumTarihiBetween(LocalDateTime dogumTarihi, LocalDateTime
            startDogumTarihi, LocalDateTime endDogumTarihi){
        return (root, query, builder) -> {
            Predicate predicate = builder.equal(root.get("dogumTarihi"), dogumTarihi);
            if (startDogumTarihi != null && endDogumTarihi != null) {
                predicate = builder.between(root.get("dogumTarihi"), startDogumTarihi, endDogumTarihi);
            } else if (startDogumTarihi != null) {
                predicate = builder.greaterThanOrEqualTo(root.get("dogumTarihi"), startDogumTarihi);
            } else if (endDogumTarihi != null) {
                predicate = builder.lessThanOrEqualTo(root.get("dogumTarihi"), endDogumTarihi);

            }
            return predicate;
        }  ;
    }

    public static Specification<Akraba> olumTarihiBetween(LocalDateTime olumTarihi, LocalDateTime
            startOlumTarihi, LocalDateTime endOlumTarihi){
        return (root, query, builder) -> {
            Predicate predicate = builder.equal(root.get("olumTarihi"), olumTarihi);
            if (startOlumTarihi != null && endOlumTarihi != null) {
                predicate = builder.between(root.get("olumTarihi"), startOlumTarihi, endOlumTarihi);
            } else if (startOlumTarihi != null) {
                predicate = builder.greaterThanOrEqualTo(root.get("olumTarihi"), startOlumTarihi);
            } else if (endOlumTarihi != null) {
                predicate = builder.lessThanOrEqualTo(root.get("olumTarihi"), endOlumTarihi);

            }
            return predicate;
        }  ;
    }

    public static Specification<Akraba>  ulkeEquals(String ulke){
        return (root, query, builder) -> {
            return builder.equal(root.get("ulke"), ulke);
        };
    }
    public static Specification<Akraba>  nameEquals(String name){
        return (root, query, builder) -> {
            return builder.equal(root.get("name"), name);
        };
    }
    public static Specification<Akraba>  lastnameEquals(String lastname){
        return (root, query, builder) -> {
            return builder.equal(root.get("lastname"), lastname);
        };
    }
}
