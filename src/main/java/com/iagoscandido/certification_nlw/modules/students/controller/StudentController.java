package com.iagoscandido.certification_nlw.modules.students.controller;

import com.iagoscandido.certification_nlw.modules.students.dto.VerifyIfStudentHasCertificationDTO;
import com.iagoscandido.certification_nlw.modules.students.useCases.VerifyIfStudentHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private VerifyIfStudentHasCertificationUseCase verifyIfStudentHasCertificationUseCase;

   @PostMapping("/hasCertification")
    public String hasCertification(@RequestBody VerifyIfStudentHasCertificationDTO verifyIfStudentHasCertificationDTO) {
       // Email
       // Technology
       var result = this.verifyIfStudentHasCertificationUseCase.execute(verifyIfStudentHasCertificationDTO);
       if(result) {
           return "User já fez a prova";
       }
       return "Usuário pode fazer a prova.";

   }

}
