package test;
import org.junit.Assert;
import org.junit.Test;

import spyda.Animal;
import spyda.Cat;

public  class AnimalObjectTest {

    @Test
    public void CreateAnimalAndReturnName() {
        String name = "Kitty";
        Animal animal = new Cat(name);
        Assert.assertTrue(animal.getName().equals(name));
    }

    @Test
    public void CreateAnimalanandReturnName() {
        String name = "Kitty";
        Animal animal = new Cat(name);
        Assert.assertTrue(animal.getName().equals(name));
    }

    @Test
    public void CreateAnimalanandaReturnName() {
        String name = "Kitty";
        Animal animal = new Cat(name);
        Assert.assertTrue(animal.getName().equals(name));
    }

}