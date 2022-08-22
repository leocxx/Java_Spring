import com.itchen.domain.User;
import com.itchen.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author KevinWilliams
 */

public class App {
    public static void main(String[] args) {

        ApplicationContext sc = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) sc.getBean("userService");

        List<User> users = userService.findAll();

        System.out.println(users);
    }
}
