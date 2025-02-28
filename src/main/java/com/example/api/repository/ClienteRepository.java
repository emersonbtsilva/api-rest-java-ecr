package com.example.api.repository;

import com.example.api.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}