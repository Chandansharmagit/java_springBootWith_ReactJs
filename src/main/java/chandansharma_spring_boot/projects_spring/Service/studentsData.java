package chandansharma_spring_boot.projects_spring.Service;

import chandansharma_spring_boot.projects_spring.Presentation.studentsDetails;
import org.springframework.stereotype.Service;

@Service
public interface studentsData {
    public studentsDetails save(studentsDetails studentsDetails);
}
