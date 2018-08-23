package test;
import org.junit.Assert;
import org.junit.Test;
import spyda.Animal;
import spyda.Cat;

public  class AppTest {

    @Test
    public void CreateAnimalAndReturnName() {
        String name = "Kitty";
        Animal animal = new Cat(name);
        Assert.assertTrue(animal.getName().equals(name));
    }

    @Test
    public void CreateAnimalorReturnName() {
        String name = "Kutty";
        Animal animal = new Cat(name);
        Assert.assertTrue(animal.getName().equals(name));
    }

    @Test
    public void CreateAnimalaorReturnName() {
        String name = "Chetty";
        Animal animal = new Cat(name);
        Assert.assertTrue(animal.getName().equals(name));
    }
}