package org.amorna.compteservice.repositories;

import org.amorna.compteservice.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}
