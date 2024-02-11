package com.iagoscandido.certification_nlw.modules.students.useCases;

import com.iagoscandido.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.iagoscandido.certification_nlw.modules.students.repositories.ICertificationStudentRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VerifyIfHasCertificationUseCase {
    private final ICertificationStudentRepository repository;

    public boolean execute(VerifyIfHasCertificationDTO dto) {
        var result = repository.findByStudentEmailAndTechnology(dto.getEmail(),
                dto.getTechnology());

        if (!result.isEmpty()) {
            return true;
        }
        return false;
    }
}
