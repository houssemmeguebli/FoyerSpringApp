package tn.esprit.houssemproject.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springdoc.core.models.GroupedOpenApi;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI().info(infoAPI());
    }

    public Info infoAPI() {
        return new Info()
                .title("SpringDoc-Demo")
                .description("TP étude de cas")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact()
                .name("Equipe ASI II")
                .email("houssem.meguebli@esprit.tn")
                .url("https://www.linkedin.com/in/houssem-meguebli-65a98b166/");
        return contact;
    }
    @Bean
    public GroupedOpenApi foyerPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only foyer Management API")
                .pathsToMatch("/foyer/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi chambrePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only chambre Management API")
                .pathsToMatch("/chambre/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi etudiantPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only etudiant Management API")
                .pathsToMatch("/etudiant/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi blocPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only bloc Management API")
                .pathsToMatch("/bloc/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi reservationPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only reservation Management API")
                .pathsToMatch("/reservation/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi universitePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only universite Management API")
                .pathsToMatch("/universite/**")
                .pathsToExclude("**")
                .build();
    }
}


