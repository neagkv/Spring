package hello.controllers;


import hello.model.Classroom;
import hello.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {


    @Autowired
    SchoolService service;


    @RequestMapping("/build/room")
    public Classroom buildRoom(@RequestParam("students")int students,
                               @RequestParam("table") int table) {
        return service.buildroom(students, table);
    }


}
