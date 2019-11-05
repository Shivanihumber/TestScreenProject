import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        EmployeeManager manager = ctx.getBean(EmployeeManager.class);
        manager.showEmployeeInfo();

    }
}