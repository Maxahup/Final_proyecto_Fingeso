package com.example.demo.repository;

import com.example.demo.model.Historial;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialRepository extends MongoRepository<Historial, String>{

}