package com.etnetera.hr.controller;

import com.etnetera.hr.data.JavaScriptFramework;
import com.etnetera.hr.data.JavaScriptFrameworkDto;
import com.etnetera.hr.repository.JavaScriptFrameworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Simple REST controller for accessing application logic.
 *
 * @author Etnetera
 */
@RestController
public class JavaScriptFrameworkController extends EtnRestController {

    private final JavaScriptFrameworkRepository repository;

    @Autowired
    public JavaScriptFrameworkController(JavaScriptFrameworkRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/frameworks")
    public Iterable<JavaScriptFramework> frameworks() {
        return repository.findAll();
    }

    @GetMapping("/frameworks/{id}")
    public Optional<JavaScriptFramework> frameworkById(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteFramework(@PathVariable("id") Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Deleted successfully!";
        } else {
            return "Element was not found!";
        }
    }

    @PostMapping("/save")
    public String saveFramework(@RequestBody JavaScriptFramework javaScriptFramework) {
        JavaScriptFrameworkDto javaScriptFrameworkDto = new JavaScriptFrameworkDto();
        javaScriptFrameworkDto.setId(javaScriptFramework.getId());
        javaScriptFrameworkDto.setName(javaScriptFramework.getName());
        javaScriptFrameworkDto.setVersion(javaScriptFramework.getVersion());
        javaScriptFrameworkDto.setHypeLevel(javaScriptFramework.getHypeLevel());
        javaScriptFrameworkDto.setDeprecationDate(javaScriptFramework.getDeprecationDate());
        repository.save(javaScriptFramework);
        return "Saved successfully!";
    }
}
