package com.confiedy.app.repository;

import com.confiedy.app.entities.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UniversidadRepository extends JpaRepository<Universidad, Integer> {
}