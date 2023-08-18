package org.amorna.compteservice;

import org.amorna.compteservice.entities.Compte;
import org.amorna.compteservice.enums.TypeCompte;
import org.amorna.compteservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CompteServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(CompteServiceApplication.class, args);
    }
    @Bean
CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            compteRepository.save(new Compte(null,4580,new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null,8754,new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null,6547,new Date(), TypeCompte.COURANT));
            compteRepository.findAll().forEach(cp ->{
                System.out.println(cp.getType());
                System.out.println(cp.getSolde());
                    }

            );
        };
}
}
