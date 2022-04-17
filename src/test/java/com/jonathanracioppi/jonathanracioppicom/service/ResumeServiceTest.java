package com.jonathanracioppi.jonathanracioppicom.service;

import com.jonathanracioppi.jonathanracioppicom.exception.ResourceNotFoundException;
import com.jonathanracioppi.jonathanracioppicom.model.Resume;
import com.jonathanracioppi.jonathanracioppicom.repository.ResumeRepo;
import com.jonathanracioppi.jonathanracioppicom.service.impl.ResumeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {ResumeServiceImpl.class})
public class ResumeServiceTest {

    @Autowired
    ResumeService resumeService;

    @MockBean
    ResumeRepo resumeRepo;

    @Test
    public void testContextLoads(){
        assertNotNull(resumeService);
    }

    @Test
    public void testResumeServiceReturnsResumeWithDisplayTrue() throws ResourceNotFoundException {
        Optional<Resume> repoRet = Optional.of(Resume.builder().display(true).build());
        when(resumeRepo.findResumeByNamePerson(any())).thenReturn(repoRet);

        Resume res  = resumeService.getResumeByName("Test");

        assertEquals(repoRet.get(), res);


    }

    @Test
    public void testResumeServiceThrowsException() {
        Optional<Resume> repoRet = Optional.of(Resume.builder().display(false).build());
        when(resumeRepo.findResumeByNamePerson(any())).thenReturn(repoRet);

        try{
            Resume res  = resumeService.getResumeByName("Test");
            fail("Expected ResourceNotFoundException");

        }catch(ResourceNotFoundException rnfe){
            assertEquals( "Resource is either marked not to display or is not present",rnfe.getMessage());
        }




    }

}
