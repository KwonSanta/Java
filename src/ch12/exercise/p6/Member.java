package ch12.exercise.p6;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // code 작성

    @Override
    public String toString() {
        return STR."\{id}: \{name}";
    }
}
