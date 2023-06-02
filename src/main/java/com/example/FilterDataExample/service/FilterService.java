package com.example.FilterDataExample.service;//package com.example.filteringData.service;
//
//
//
//import com.example.filteringData.dto.FilterRequestDTO;
//import com.example.filteringData.model.Filter;
//import com.example.filteringData.repository.FilterRepository;
//import lombok.RequiredArgsConstructor;
//import org.modelmapper.ModelMapper;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.domain.Specification;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class FilterService  {
//
//        private final ModelMapper modelMapper;
//        private final FilterRepository filterRepository;
//
//
//    public List<FilterRequestDTO> filterData(LocalDateTime createDate, LocalDateTime startcreateDate, LocalDateTime endcreateDate, String name, Integer age, int page, int size) {
//
//        try {
//
//            Specification<Filter> filterSpecification = Specification.where(null);
//
//            if (createDate != null || startcreateDate != null || endcreateDate != null){
//                filterSpecification = filterSpecification.and(FilterSpecification.createDateBetween(createDate,startcreateDate,endcreateDate));
//            }
//
//            if (name != null){
//                filterSpecification = filterSpecification.and(FilterSpecification.nameEquals(name));
//            }
//
//
//
//            Pageable pageable = PageRequest.of(page,size);
//            Page<Filter> filterPage = filterRepository.findAll( filterSpecification, pageable);
//
//            List<FilterRequestDTO> filterRequestDTOS  = filterPage.stream().map(filter -> modelMapper.map(filter, FilterRequestDTO.class)).collect(Collectors.toList());
//            return filterRequestDTOS;
//
//        }catch (Exception e) {
//            throw  new RuntimeException("Serviste bir hata oluştu  : " + e.getMessage(), e);
//        }
//
//
//
//    }
//}
