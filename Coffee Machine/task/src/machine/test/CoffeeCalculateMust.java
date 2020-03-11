package machine.test;
import machine.CoffeeMachine;
import org.junit.Assert;
import org.junit.Test;

public class CoffeeCalculateMust {
    @Test
    public void returnCoffeeForOne(){
    // Arrange - we need coffee Calculator of the elements
        CoffeeMachine coffeeMachine = new CoffeeMachine();

    // Act - should test one line
        int result = coffeeMachine.calculate(1);
        //Assert - check the result of the test
        Assert.assertArrayEquals("1", result);

    }

}



