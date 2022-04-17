package com.jonathanracioppi.jonathanracioppicom.service.impl;

import com.jonathanracioppi.jonathanracioppicom.exception.ResourceNotFoundException;
import com.jonathanracioppi.jonathanracioppicom.model.Resume;
import com.jonathanracioppi.jonathanracioppicom.repository.ResumeRepo;
import com.jonathanracioppi.jonathanracioppicom.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    ResumeRepo resumeRepo;

    @Override
    public Resume getResumeByName(String name) throws ResourceNotFoundException {

        Optional<Resume> resume = resumeRepo.findResumeByNamePerson(name);

        if(resume.isPresent()){
            return resume.get();
        }else{
            throw new ResourceNotFoundException("Resource is either marked not to display or is not present");
        }

    }

    @Override
    public List<Resume> getAllResumes() {
        return resumeRepo.findAll().stream().filter(x -> x.isDisplay()).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public void updateResume(Resume resume) {
        Resume res = resumeRepo.getById(resume.getResumeId());

        if(res != null){
            res.setDisplay(resume.isDisplay());
            res.setResumeSection(resume.getResumeSection());
            res.setAboutPerson(resume.getAboutPerson());
            res.setEmailPerson(resume.getEmailPerson());
            res.setNamePerson(resume.getNamePerson());
            res.setPhoneNumber(resume.getPhoneNumber());
            resumeRepo.save(res);
        }else{
            resumeRepo.save(resume);
        }
        resumeRepo.flush();

    }
}
