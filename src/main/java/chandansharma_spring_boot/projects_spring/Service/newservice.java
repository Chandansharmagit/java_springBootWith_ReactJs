package chandansharma_spring_boot.projects_spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chandansharma_spring_boot.projects_spring.Presentation.newEntry;
import chandansharma_spring_boot.projects_spring.Repository.newentry;

import java.util.List;
import java.util.Optional;

@Service
public class newservice implements newentrydata{

    @Autowired
    private newentry newentry;

    @Override
    public newEntry savedetails(newEntry savedetails) {
       return newentry.save(savedetails);
    }

    @Override
    public List<newEntry> getdata() {
        return newentry.findAll();
    }

    @Override
    public newEntry getnewEntryByid(int id) {
        return null;
    }

    //getting by id

    public newEntry getnewentrybyid(int id){
        Optional<newEntry> optionalNewEntry = newentry.findById(id);
        return optionalNewEntry.orElse(null);
    }

    public newEntry updatenewentry(int id, newEntry updatenewentry){
        Optional<newEntry> optionalNewEntry = newentry.findById(id);
        if(optionalNewEntry.isPresent()){
            newEntry existingnewentry = optionalNewEntry.get();
            existingnewentry.setFirstname(updatenewentry.getFirstname());
            existingnewentry.setLastname(updatenewentry.getLastname());
            existingnewentry.setEmail(updatenewentry.getEmail());
            existingnewentry.setPassword(updatenewentry.getPassword());
            existingnewentry.setCpassword(updatenewentry.getCpassword());

            return newentry.save(existingnewentry);
        }else{
            return null;
        }
    }


    public void deleteChandan(int id){
        newentry.deleteById(id);
    }



}