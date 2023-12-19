package com.fowobi.h2.repository;

import com.fowobi.h2.models.Footwear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootwearRepository extends JpaRepository<Footwear, Long> {
}
