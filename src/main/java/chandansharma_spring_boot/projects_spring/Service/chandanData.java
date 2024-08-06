package chandansharma_spring_boot.projects_spring.Service;

import chandansharma_spring_boot.projects_spring.Presentation.chandansharma;
import chandansharma_spring_boot.projects_spring.Presentation.newEntry;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface chandanData {
    public chandansharma savechandan(chandansharma savechandan);

    public List<chandansharma> gettingdata();


}