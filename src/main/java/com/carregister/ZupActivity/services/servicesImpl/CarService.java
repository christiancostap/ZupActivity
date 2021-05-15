package com.carregister.ZupActivity.services.servicesImpl;

import com.carregister.ZupActivity.models.Car;
import com.carregister.ZupActivity.repositories.ICarRepository;
import com.carregister.ZupActivity.services.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {
    @Autowired
    ICarRepository carRepository;

    @Override
    public List<Car> FindAll() {
        return null;
    }

    @Override
    public Car FindById(Long id) {
        return null;
    }

    @Override
    public Car Save(Car car) {
        return null;
    }
}