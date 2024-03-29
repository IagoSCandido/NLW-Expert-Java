package com.iagoscandido.certification_nlw.modules.students.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iagoscandido.certification_nlw.modules.students.entity.CertificationStudentEntity;

@Repository
public interface ICertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {

    @Query(nativeQuery = true, value = "SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationStudentEntity> findByStudentEmailAndTechnology(String email, String technology);
}