package chandansharma_spring_boot.projects_spring.Service;

import chandansharma_spring_boot.projects_spring.Presentation.studentDetails;

import org.springframework.stereotype.Service;

@Service
public interface studentsData {
    public studentDetails save(studentDetails studentsDetails);
}
