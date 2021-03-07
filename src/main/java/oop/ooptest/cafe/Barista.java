package oop.ooptest.cafe;

public class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        System.out.println("바리스타가 " + coffee.getName() + "(을)를 만듭니다.");
        return coffee;
    }
}
