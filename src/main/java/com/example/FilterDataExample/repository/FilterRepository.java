//package com.example.FilterDataExample.repository;
//
//import com.example.filteringData.model.Filter;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.domain.Specification;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface FilterRepository extends JpaRepository<Filter, String>, JpaSpecificationExecutor<Filter> {
//
//    Page<Filter> findAll(Specification<Filter> filterSpecification, Pageable pageable);
//
//}
//
