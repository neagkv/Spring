package hello.model;

public class Classroom {
    String name;
    int roomNumber;
    Students[] students;
    Table[] tables;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public Table[] getTables() {
        return tables;
    }

    public void setTables(Table[] tables) {
        this.tables = tables;
    }
}
