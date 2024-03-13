package ch16.exercise.p8;

public class Student {
    // 필드
    private String name;
    private int englishScore;
    private int mathScore;

    // 생성자
    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    // getter 메소드
    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}
