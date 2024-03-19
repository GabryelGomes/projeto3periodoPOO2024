package com.example.projeto3periodoPOO2024.Service;

import com.example.projeto3periodoPOO2024.Entity.Estado;
import com.example.projeto3periodoPOO2024.Repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;
    public List<Estado>buscarTodos(){
        return estadoRepository.findAll();
    }
}

