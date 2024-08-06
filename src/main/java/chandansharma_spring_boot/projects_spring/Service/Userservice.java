package chandansharma_spring_boot.projects_spring.Service;

import chandansharma_spring_boot.projects_spring.Presentation.UserDetails;
import chandansharma_spring_boot.projects_spring.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice implements UsersData{

    @Autowired
    private userRepo userRepo;

    @Override
    public UserDetails saveDetails(UserDetails saveDetails) {
       return userRepo.save(saveDetails);


    }
}
