package dev.llf;

import dev.llf.client.service.ClientService;
import dev.llf.service.locator.ServiceLocator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

        // retrieve configured instance
        ClientService client = context.getBean("clientService", ClientService.class);

        System.out.println(client.getYears());
        System.out.println(client.getUltimateAnswer());
    }
}
