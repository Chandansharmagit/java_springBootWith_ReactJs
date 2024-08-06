package chandansharma_spring_boot.projects_spring.Repository;

import chandansharma_spring_boot.projects_spring.Presentation.chandansharma;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;
import org.springframework.stereotype.Repository;


@Repository
public interface chandanRepo extends JpaRepository<chandansharma,Integer> {
    
}
