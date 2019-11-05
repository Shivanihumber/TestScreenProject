import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public EmployeeManager employeeManager(){
        return  new EmployeeManager();
    }


}
