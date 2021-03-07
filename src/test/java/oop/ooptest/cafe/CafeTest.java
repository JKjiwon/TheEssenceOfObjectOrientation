package oop.ooptest.cafe;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class CafeTest {

    @Test
    @DisplayName("커피 주문하기")
    public void order() {
        // given
        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("아메리카노", 4100));
        items.add(new MenuItem("카페라떼", 4600));
        items.add(new MenuItem("카페모카", 5100));
        items.add(new MenuItem("마끼아또", 5600));
        Menu menu = new Menu(items);
        Barista barista = new Barista();
        Customer customer = new Customer();

        // when
        Coffee coffee = customer.order("마끼아또", menu, barista);

        System.out.println("coffee.getName() = " + coffee.getName());

        // then
        Assertions.assertThat(coffee.getName()).isEqualTo("마끼아또");
    }

}