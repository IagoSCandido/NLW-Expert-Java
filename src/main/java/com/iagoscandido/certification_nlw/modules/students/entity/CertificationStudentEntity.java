package com.iagoscandido.certification_nlw.modules.students.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {
    private UUID id;
    private UUID studentID;
    private String Technology;
    private Double grate;
    private List<AnwsersCertificationEntity> anwsersCertificationEntity;



}
