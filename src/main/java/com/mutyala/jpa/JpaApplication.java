package com.mutyala.jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mutyala.jpa.book.CategoryService;

@RequiredArgsConstructor
@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
    private final CategoryService categoryService;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) {
        categoryService.createCategory();
        categoryService.testSortingAssociatedCollectionWithOrderBy();
    }
}
