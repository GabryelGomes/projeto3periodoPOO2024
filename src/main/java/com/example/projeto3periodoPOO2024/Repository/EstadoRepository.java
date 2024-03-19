package com.example.projeto3periodoPOO2024.Repository;

import com.example.projeto3periodoPOO2024.Entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Long> {
}
