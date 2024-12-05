package com.codecool.hetes_backend.repository;

import com.codecool.hetes_backend.model.AboutUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutUsRepository extends JpaRepository<AboutUs, Long> {
}
