package com.iagoscandido.certification_nlw.modules.students.useCases;

import com.iagoscandido.certification_nlw.modules.students.dto.VerifyIfStudentHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfStudentHasCertificationUseCase     {

    public boolean execute (VerifyIfStudentHasCertificationDTO dto) {
        if (dto.getEmail().equals("email") && dto.getTechnology().equals("technology")) {
            return true;
        }
        return false;
    }
}
