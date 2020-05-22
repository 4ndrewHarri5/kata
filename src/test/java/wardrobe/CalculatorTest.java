package wardrobe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CalculatorTest {
    /*
    * Configure your own Wardrobe
    * Build your own wardrobe from customized components.
    * The wardrobe elements are available in the following sizes: 50cm, 75cm, 100cm, and 120cm.
    * The wall on which the wardrobe elements are placed has a total length of 250cm.
    * With which combinations of wardrobe elements can you make the most of the space?
    *
    * Write a function that returns all combinations of wardrobe elements that exactly fill the wall.
    *
    * Additional Task
    * Here is the price list for the available wardrobe elements:
    * 50cm => 59 USD
    * 75cm => 62 USD
    * 100cm => 90 USD
    * 120cm => 111 USD
    * Write a second function that checks which of the resulting combinations is the cheapest one.
    * */

    @Test
    void get_biggest_block_that_fits_in_size_50() throws NoComponentException {
        Calculator calculator = new Calculator();

        int remainingHeight = 50;

        Component component = calculator.getNextBlock(remainingHeight);

        Assertions.assertNotNull(component);
        Assertions.assertEquals(Integer.valueOf(50), component.getLength());
    }

    @Test
    void given_remaining_height_80_return_component_75() throws NoComponentException {
        Calculator calculator = new Calculator();

        int remainingHeight = 80;

        Component component = calculator.getNextBlock(remainingHeight);

        Assertions.assertNotNull(component);
        Assertions.assertEquals(Integer.valueOf(75), component.getLength());
    }


    @Test
    void given_remaining_height_110_return_component_100() throws NoComponentException {
        Calculator calculator = new Calculator();

        int remainingHeight = 110;

        Component component = calculator.getNextBlock(remainingHeight);

        Assertions.assertNotNull(component);
        Assertions.assertEquals(Integer.valueOf(100), component.getLength());
    }

    @Test
    void given_remaining_height_200_return_component_120() throws NoComponentException {
        Calculator calculator = new Calculator();

        int remainingHeight = 200;

        Component component = calculator.getNextBlock(remainingHeight);

        Assertions.assertNotNull(component);
        Assertions.assertEquals(Integer.valueOf(120), component.getLength());
    }

    @Test
    void given_remaining_height_40_throw_no_component_exception() {
        Calculator calculator = new Calculator();

        int remainingHeight = 40;

        Assertions.assertThrows(NoComponentException.class, () -> calculator.getNextBlock(remainingHeight));
    }

}