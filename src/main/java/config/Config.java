package config;

import beans.Dog;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"beans"})
public class Config {

    @Bean("rex")
    @Primary
    public Dog rex() {
        return new Dog("Rex");
    }

    @Bean("jasper")
    @Qualifier("jasper")
    public Dog jasper() {
        return new Dog("Jasper");
    }

    @Bean("milo")
    public Dog milo() {
        return new Dog("Milo");
    }

}
