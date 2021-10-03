package mainn;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;

    @BeforeEach
    void setup() {
        this.order = new Order(14, "harmonica", 2000.0);
    }

    @Test
    void should_ReturnTrue_When_GotQuantity() {


        //when
        int quantity = order.getQuantity();

        //then
        assertEquals(14, quantity);

    }

    @Test
    void should_ReturnTrue_When_setQuantityWorks() {


        //when
        Order o = order.setQuantity(8);

        //then
        assertEquals(o, order);

    }

    @Test
    void should_ReturnTrue_When_GotItemName() {

        //when
        String item = order.getItemName();

        //then
        assertEquals("harmonica", item);

    }


    @Test
    void should_ReturnTrue_When_setItemNameWorks() {


        //when
        Order o = order.setItemName("boombox");

        //then
        assertEquals(o, order);

    }

    @Test
    void should_ReturnTrue_When_Price() {


        //when
        double price = order.getPrice();

        //then
        assertEquals(2000.0, price);

    }

    @Test
    void should_ReturnTrue_When_setPriceWorks() {


        //when
        Order o = order.setPrice(420.0);

        //then
        assertEquals(o, order);

    }


    @Test
    void should_ReturnTrue_When_setPriceWithTexWorks() {


        //when
        Order orderwTex = order.setPriceWithTex(99.9);

        //then
        assertEquals(orderwTex, order);

    }

    @Test
    void should_ReturnTrue_When_PriceWithTexMatchesWorks() {


        Order order1 = order.setPriceWithTex(420.0);
        //when
        double priceWithTex = order.getPriceWithTex();

        //then
        assertEquals(priceWithTex, 420.0);

    }
}