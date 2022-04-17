package com.jonathanracioppi.jonathanracioppicom.repository;

import com.jonathanracioppi.jonathanracioppicom.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ResumeRepo extends JpaRepository<Resume, Long> {

    @Query("SELECT r FROM RESUMES r where r.namePerson = :namePerson AND r.display = true")
    Optional<Resume> findResumeByNamePerson(String namePerson);

    @Query("select r from RESUMES r where upper(r.namePerson) = upper(?1)")
    Optional<Resume> findByNamePersonEqualsIgnoreCase(String namePerson);
}
