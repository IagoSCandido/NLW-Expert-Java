package com.iagoscandido.certification_nlw.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifyIfStudentHasCertificationDTO {
    private String email;
    private String technology;
}
