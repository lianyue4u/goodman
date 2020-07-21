package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sound.midi.Soundbank;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {
        short i = 1;
        int a = 200;
        int b = 200;
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(i);
        System.out.println(a == b);
    }

    public void sayGoodBye() {
        System.out.println("GoodBye");
    }

    public void hahhah() {
        new Thread().start();
    }


}
