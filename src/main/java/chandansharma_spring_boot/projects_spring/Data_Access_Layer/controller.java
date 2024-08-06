package chandansharma_spring_boot.projects_spring.Data_Access_Layer;


import chandansharma_spring_boot.projects_spring.Presentation.UserDetails;

import chandansharma_spring_boot.projects_spring.Presentation.chandansharma;
import chandansharma_spring_boot.projects_spring.Presentation.newEntry;
import chandansharma_spring_boot.projects_spring.Presentation.studentDetails;

import chandansharma_spring_boot.projects_spring.Repository.newentry;
import chandansharma_spring_boot.projects_spring.Service.UsersData;
import chandansharma_spring_boot.projects_spring.Service.chandanData;
import chandansharma_spring_boot.projects_spring.Service.newentrydata;

import java.util.List;

import chandansharma_spring_boot.projects_spring.Service.studentsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class controller {


    @Autowired

    UsersData usersData;

    @Autowired
    newentrydata newentrydata;

    @Autowired
    studentsData studentsData;





    @GetMapping("/sharma")
    public String chandan() {
        return "hey";
    }


    @GetMapping("/")
    public String hey() {
        return "wel come to spring boot";
    }

    @GetMapping("/hey'")
    public void deepika() {

    }


    @PostMapping("/add")
    public String add(@RequestBody UserDetails userDetails){
        usersData.saveDetails(userDetails);
        return "the data is saved sucessfull";
    }
    @Autowired
    private chandanData chandanData;

    @PostMapping("/adding")
    public String adding_chandan(@RequestBody chandansharma chandansharma){
        chandanData.savechandan(chandansharma);
        return "the data is saved sucessfull";
    }

    @PostMapping("/adds")
    public String adds(@RequestBody newEntry newEntry){
        newentrydata.savedetails(newEntry);
        return "data saved";
    }

    @GetMapping("/getall")
    public List<chandansharma> getall(){
        return chandanData.gettingdata();
    }

    @GetMapping("/new_repo_find")
    public List<newEntry> getting(){
        return newentrydata.getdata();
    }


    @GetMapping("/gettall/{id}")
    public ResponseEntity<newEntry> gettingbyid(@PathVariable int id){

        newEntry newEntry = newentrydata.getnewEntryByid(id);
        if(newEntry != null){
            return ResponseEntity.ok(newEntry);
        }else{
            return ResponseEntity.notFound().build();
        }


    }


    @PutMapping("/api/chandan/{id}")
    public ResponseEntity<newEntry> updatechandan(@PathVariable int id,@RequestBody newEntry updatedchandan){
        newEntry chandan = newentrydata.updatenewentry(id,updatedchandan);
        if(chandan != null){
            return ResponseEntity.ok(chandan);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/api/chandan/deleting/{id}")
    public ResponseEntity<Void> deletingChandan(@PathVariable int id){
        newentrydata.deleteChandan(id);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/adds")
    public String adding(@RequestBody studentDetails studentsDetails){
        studentsData.save(studentsDetails);
        return "the data is saved sucessfull";
    }


    




}
    



    
    

