package com.springdemo.repository;

import com.springdemo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    //Display all regions in Canada
    List<Region> findByCountry(String country);

    //Display all regions in Canada, without dups
    List<Region> findDistinctByCountry(String country);

    //Display all regions with country name includes "united"
    List<Region> findByCountryContainingIgnoreCase(String keyword);

    //DIsplay all regions with country name includes "Asia" in order
    List<Region> findByCountryContainingOrderByCountry(String keyword);

    //Display top 2 regions in Canada
    List<Region> findTop2ByCountry(String country);


}
