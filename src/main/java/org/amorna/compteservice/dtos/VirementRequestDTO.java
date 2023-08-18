package org.amorna.compteservice.dtos;

import lombok.Data;

@Data
public class VirementRequestDTO {
    private  Long codeSource;
    private  Long codeDestination;
    private  double montant;
}
