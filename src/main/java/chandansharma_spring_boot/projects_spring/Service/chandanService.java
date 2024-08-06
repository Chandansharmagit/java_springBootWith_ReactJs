package chandansharma_spring_boot.projects_spring.Service;

import chandansharma_spring_boot.projects_spring.Presentation.chandansharma;
import chandansharma_spring_boot.projects_spring.Presentation.newEntry;
import chandansharma_spring_boot.projects_spring.Repository.chandanRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class chandanService implements chandanData{


    @Autowired
    private chandanRepo chandanRepo;

    @Override
    public chandansharma savechandan(chandansharma savechandan) {
        return chandanRepo.save(savechandan);
    }

    @Override
    public List<chandansharma> gettingdata() {
        return chandanRepo.findAll();
       
    }






   
}
