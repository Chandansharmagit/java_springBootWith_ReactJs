package chandansharma_spring_boot.projects_spring.Service;

import chandansharma_spring_boot.projects_spring.Presentation.UserDetails;
import org.springframework.stereotype.Service;


@Service
public interface UsersData {
    public UserDetails saveDetails(UserDetails saveDetails);
}
