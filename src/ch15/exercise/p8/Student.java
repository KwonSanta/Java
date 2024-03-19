package ch15.exercise.p8;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Student student = (Student) o;

        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }
}
