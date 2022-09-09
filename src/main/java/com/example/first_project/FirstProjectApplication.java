package com.example.first_project;

import com.example.first_project.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(FirstProjectApplication.class);

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private OwnerRepository ownerRepository;


    @Autowired
    private UserRepository userRepository;


    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner("John","Johnson");
        Owner owner2 = new Owner("Mary","Robinson");
        ownerRepository.saveAll(Arrays.asList(owner1,owner2));

//
//        carRepository.save(new Car("Ford","Mustang","blue","AA-2154",2019,29000,owner2));
//        carRepository.save(new Car("Ford","Mustang","blue","AA-2154",2020,39000,owner2));

        Car car1 = new Car("Ford","Mustang","blue","AA-2154",2021,59000,owner1);
        Car car2 = new Car("Nissan","Leaf","red","SSJ-3002",2019,29000,owner2);
        Car car3 = new Car("Toyota","Prius","silver","KKO-0212",2020,39000,owner2);

        carRepository.saveAll(Arrays.asList(car1,car2,car3));


        userRepository.save(new Users("user1","222","USER"));
        userRepository.save(new Users("admin","333","ADMIN"));


    }
}
