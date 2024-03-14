package ch12.exercise.p5;

import java.util.Objects;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    // 코드 작성
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return studentNum != null ? studentNum.hashCode() : 0;
    }
}