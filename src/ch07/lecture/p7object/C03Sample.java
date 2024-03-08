package ch07.lecture.p7object;

public class C03Sample {
    public static void main(String[] args) {
        Shape shape1 = new Round(3); // 반지름 : 3
        Shape shape2 = new Rectangle(5, 7); // 가로 5, 세로 7
        shape1.printArea(); // 원 면적 출력
        shape2.printArea(); // 사각형 면적 출력

        printDescription(shape1); // "반지름이 3인 원의 면적은 PI*r*r 입니다."
        printDescription(shape2); // "가로 5, 세로 7인 사각형의 면적은 35입니다."
    }

    public static void printDescription(Object o) {
        if (o instanceof Round round) {
            System.out.println(STR."반지름이 \{round.r}인 원의 면적은 \{round.area}");
        } else if (o instanceof Rectangle rectangle) {
            System.out.println(STR."가로 \{rectangle.width}, 세로 \{rectangle.height}인 사각형의 면적은 \{rectangle.area}");
        }
    }
}

abstract class Shape {
    public abstract void printArea();
}

class Round extends Shape {
    // field
    int r;
    double area;

    // constructor
    public Round(int r) {
        this.r = r;
    }

    // method
    @Override
    public void printArea() {
        this.area = Math.PI * r * r;
        System.out.println(area);
    }
}

class Rectangle extends Shape {
    // field
    int width;
    int height;
    double area;

    // constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // method
    @Override
    public void printArea() {
        this.area = width * height;
        System.out.println(area);
    }
}
