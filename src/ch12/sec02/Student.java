package ch12.sec02;

import java.util.Objects;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student target) {
            if (no == target.getNo() && name.equals(target.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }
}
