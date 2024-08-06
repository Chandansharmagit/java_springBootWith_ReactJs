package chandansharma_spring_boot.projects_spring.Service;

import org.springframework.stereotype.Service;

import chandansharma_spring_boot.projects_spring.Presentation.newEntry;

import java.util.List;

@Service
public interface newentrydata   {
    public newEntry savedetails(newEntry savedetails);
    public List<newEntry> getdata();

    newEntry getnewEntryByid(int id);

    newEntry updatenewentry(int id , newEntry updatenewentry);

    void deleteChandan(int id);

}
