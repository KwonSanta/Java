package Practice;

import ch16.exercise.p6.Function;

public class exercise {
    public static void main(String[] args) {

    }

    abstract class Shape {
        public abstract int getArea();
    }

    class Rectangle extends Shape {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int getArea() {
            return width * height;
        }
    }

    class Square extends Rectangle {
        public Square(int size) {
            super(size, size);
        }

        @Override
        public void setWidth(int width) {
            super.setWidth(width);
            super.setHeight(width);
        }

        @Override
        public void setHeight(int height) {
            super.setWidth(height);
            super.setHeight(height);
        }
    }
}
