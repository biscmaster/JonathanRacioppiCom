package com.jonathanracioppi.jonathanracioppicom.service;

import com.jonathanracioppi.jonathanracioppicom.exception.ResourceNotFoundException;
import com.jonathanracioppi.jonathanracioppicom.model.Resume;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ResumeService {

    Resume getResumeByName(String name) throws ResourceNotFoundException;

    List<Resume> getAllResumes();

    void updateResume(Resume resume);
}
