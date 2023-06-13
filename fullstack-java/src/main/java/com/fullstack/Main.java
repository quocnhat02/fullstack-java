package com.fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse greet() {
        GreetResponse response = new GreetResponse(
                "Hello",
                List.of("Java", "Golang", "Javascript"),
                new Person("Nhat", 21, 30000));
        return response;
    }

    record Person(String name, int age, double savings) {}

    record GreetResponse(String greet, List<String> favProgrammingLanguages, Person person) {}

//    class GreetResponse {
//        private final String greet;
//
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greet='" + greet + "\'" +
//                    "}";
//        }
//
//        @Override
//        public int hashCode() {
//            return super.hashCode();
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            return super.equals(obj);
//        }
//    }
}
