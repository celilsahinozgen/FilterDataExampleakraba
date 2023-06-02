package com.example.FilterDataExample.repository;



import com.example.FilterDataExample.model.Akraba;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AkrabaRepository extends JpaRepository<Akraba, String >, JpaSpecificationExecutor<Akraba> {


    List<Akraba> findAll(Specification<Akraba> arabaMarkalariSpecification);
}
