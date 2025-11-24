package Lesson6.service.impl;

import Lesson6.model.Animal;
import Lesson6.service.IAnimalService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IAnimalServiceImpl implements IAnimalService {

    @Override
    public List<Animal> animalsSwimmable(List<Animal> animals) {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.swim()) {
                result.add(animal);
            }
        }
        return result;
    }

    @Override
    public List<Animal> animalsFlyable(List<Animal> animals) {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.fly()) {
                result.add(animal);
            }
        }
        return result;
    }

    @Override
    public boolean deleteAnimalSwimmable(List<Animal> animals) {
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().swim()) {
                iterator.remove();
            }
        }

        for (int i = animals.size()-1;i>=0;i++) {
            if (animals.get(i).swim()) {
                animals.remove(i);
            }
        }
        return true;
    }

    @Override
    public boolean deleteAnimalSwimmableAndFlyable(List<Animal> animals) {
        return false;
    }

}
