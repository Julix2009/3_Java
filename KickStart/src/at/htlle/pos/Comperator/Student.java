package at.htlle.pos.Comperator;

import java.util.Objects;

public class Student {
    private String classroom;
    private String name;
    private int id;

    public Student (  int id, String classroom, String name){
        if(id < 0) throw new IllegalArgumentException("Passed argument id  must be negative");
        this.id = id;

        if( Objects.requireNonNull(name, " Passed argument must not be null").isBlank()) {
            throw new IllegalArgumentException("Passed argument name must not be empty or blank");
        }
        this.name = name;

        // null, empty, only white space

        if( Objects.requireNonNull(classroom, " Passed argument must not be null").isBlank()) {
            throw new IllegalArgumentException("Passed argument name must not be empty or blank");
        }
        this.classroom = classroom;



    }

    @Override
    public String toString(){
        return String.format("Student"+ " Name "+ name+" id "+ id + " Classroom "+classroom);
    }

    public String getName() {
        return name;
    }

    public String getClassroom() {
        return classroom;
    }

    public int getId() {
        return id;
    }
}
