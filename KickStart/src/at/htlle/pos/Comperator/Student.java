package at.htlle.pos.Comperator;

import java.util.Objects;

public class Student {
    private String classroom;
    private String name;
    private int id;

    public Student (  int id, String classroom, String name){
        if(id < 0) throw new IllegalArgumentException("Passed argument id  must be over null");
        this.id = id;

        if( Objects.requireNonNull(name, " Passed argument must not be null").isBlank());
        throw new IllegalArgumentException("Passed argument name must not be empty or blank")
        this.name = name;
        this.classroom = classroom;


    }

}
