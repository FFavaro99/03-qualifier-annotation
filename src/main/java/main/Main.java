package main;

import beans.Owner;
import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... strings) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Owner owner = context.getBean(Owner.class);
        System.out.println(owner);
    }
}
