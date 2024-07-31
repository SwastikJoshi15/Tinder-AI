package com.swastik.tinderaibackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.swastik.tinderaibackend.profiles.Gender;
import com.swastik.tinderaibackend.profiles.Profile;
import com.swastik.tinderaibackend.profiles.ProfileRepository;

@SpringBootApplication
public class TinderAiBackendApplication implements CommandLineRunner {
    @Autowired
    private ProfileRepository profileRepository;

    public static void main(String[] args) {
        SpringApplication.run(TinderAiBackendApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Profile profile = new Profile("1", "Swastik", "Joshi", 22, "Indian", Gender.MALE, "Software Programmer", "foo.jpg", "INTP");
        profileRepository.save(profile);
        profileRepository.findAll().forEach(System.out::println);
    }
}
