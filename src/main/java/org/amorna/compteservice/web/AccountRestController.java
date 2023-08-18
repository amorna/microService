package org.amorna.compteservice.web;

import org.amorna.compteservice.dtos.VirementRequestDTO;
import org.amorna.compteservice.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    @Autowired
    private CompteService compteService;
    @PostMapping(path="comptes/virement")
    public void virement(@RequestBody VirementRequestDTO request){
        compteService.virement(request.getCodeSource(),request.getCodeDestination(),request.getMontant());

    }
}
