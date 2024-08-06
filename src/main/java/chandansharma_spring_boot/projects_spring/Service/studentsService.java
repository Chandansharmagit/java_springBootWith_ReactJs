package chandansharma_spring_boot.projects_spring.Service;

import chandansharma_spring_boot.projects_spring.Presentation.studentDetails;

import chandansharma_spring_boot.projects_spring.Repository.studentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentsService implements studentsData{
    @Autowired
    studentsRepo studentsRepo;


    @Override
    public studentDetails save(studentDetails studentsDetails) {
        return studentsRepo.save(studentsDetails);
    }
}
