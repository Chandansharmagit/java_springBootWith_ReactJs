package chandansharma_spring_boot.projects_spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chandansharma_spring_boot.projects_spring.Presentation.newEntry;
@Repository
public interface newentry extends JpaRepository<newEntry,Integer> {
    
}
