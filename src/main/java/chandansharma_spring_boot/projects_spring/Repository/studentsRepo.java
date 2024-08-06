package chandansharma_spring_boot.projects_spring.Repository;


import chandansharma_spring_boot.projects_spring.Presentation.studentsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface studentsRepo extends JpaRepository<studentsDetails,Integer>{


}
