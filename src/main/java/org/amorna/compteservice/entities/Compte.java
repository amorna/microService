package org.amorna.compteservice.entities;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.amorna.compteservice.enums.TypeCompte;


import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
}
