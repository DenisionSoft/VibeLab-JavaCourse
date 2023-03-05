package com.example.javacorespring.repo;

import com.example.javacorespring.domain.Fine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FineRepo extends JpaRepository<Fine, Long> {
}
