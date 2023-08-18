package org.amorna.compteservice.service;

public interface CompteService {
    void virement(Long codeSource,Long codeDestinataire,double montant);
}
