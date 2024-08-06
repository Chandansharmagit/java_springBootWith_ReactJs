package chandansharma_spring_boot.projects_spring;


import chandansharma_spring_boot.projects_spring.Presentation.UserDetails;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;





@SpringBootApplication
@RestController 
public class ProjectsSpringApplication  {


	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(ProjectsSpringApplication.class, args);

	UserDetails hell = context.getBean(UserDetails.class);


	UserDetails man = context.getBean(UserDetails.class);


	

	
	}

}
