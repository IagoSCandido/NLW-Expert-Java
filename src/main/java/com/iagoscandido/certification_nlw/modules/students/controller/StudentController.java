package com.iagoscandido.certification_nlw.modules.students.controller;

import com.iagoscandido.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.iagoscandido.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/hasCertification")
    public String hasCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertificationDTO) {
        var result = verifyIfHasCertificationUseCase.execute(verifyIfHasCertificationDTO);

        if (result) {
            return "User já fez a prova";
        }
        return "Usuário pode fazer a prova.";
    }

}
