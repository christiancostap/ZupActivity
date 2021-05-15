package com.carregister.ZupActivity.repositories;

import com.carregister.ZupActivity.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRepository extends JpaRepository<Car, Long> {}
