package chandansharma_spring_boot.projects_spring.Repository;

import chandansharma_spring_boot.projects_spring.Presentation.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository

public interface userRepo extends JpaRepository<UserDetails, Integer> {
}
