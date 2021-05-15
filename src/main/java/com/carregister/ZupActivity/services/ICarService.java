package com.carregister.ZupActivity.services;

import com.carregister.ZupActivity.models.Car;
import com.carregister.ZupActivity.models.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICarService {
    List<Car> FindAll();
    Car FindById(Long id);
    Car Save(Car car);
}
