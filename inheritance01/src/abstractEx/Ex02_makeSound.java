package abstractEx;

abstract class Animal {
    abstract void makeSound(); // 추상 메서드
}

class Dog extends Animal {
    // 추상 메서드 구현
    void makeSound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    // 추상 메서드 구현
    void makeSound() {
        System.out.println("야옹!");
    }
}

public class Ex02_makeSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound(); // "멍멍!" 출력
        cat.makeSound(); // "야옹!" 출력
    }
}

