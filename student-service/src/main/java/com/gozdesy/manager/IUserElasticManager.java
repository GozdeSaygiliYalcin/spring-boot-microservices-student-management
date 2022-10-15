package com.gozdesy.manager;

import com.gozdesy.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "${studentapplication.url.user}v1/api/user",name = "xx?",decode404 = true)
public interface IUserElasticManager {
     @GetMapping("/findAllData")
     ResponseEntity<List<Student>>findAll();
}
