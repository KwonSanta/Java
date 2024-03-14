package ch12.exercise.p5;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        // Student를 저장하는 HashSet 생성
        HashSet<Student> hashSet = new HashSet<>();

        // Student 저장
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        // 저장된 Student 수 출력
        System.out.println("저장된 밀크티 안마신 사람의 수: " + hashSet.size());

    }
}
