package hello.service;

import hello.model.Backpack;
import hello.model.Classroom;
import hello.model.Students;
import hello.model.Table;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    public Classroom buildroom(int numStudents, int numTable) {
        Classroom c = new Classroom();
        Students[] students = new Students[numStudents];
        Table[] table = new Table[numTable];


        for (int i = 0; i < numStudents; i++) {
            Students s = new Students();
            s.setName("Sally");
            s.setAge(30);
            s.setBackpack(new Backpack("blue"));
            students[i] = s;

        }

        for (int i = 0; i < numTable; i++) {
            Table t = new Table();
            t.setMaterial("wood");
            t.setSeats(3);
            table[i] = t;

        }

        c.setName("Computer Science Hall");
        c.setRoomNumber(1);
        c.setStudents(students);
        c.setTables(table);

        return c;
    }
}


