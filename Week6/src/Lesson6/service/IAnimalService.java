package Lesson6.service;

import Lesson6.model.Animal;

import java.util.List;

public interface IAnimalService {
    public List<Animal> animalsSwimmable (List<Animal> animals);
    public List<Animal> animalsFlyable (List<Animal> animals);
    public boolean deleteAnimalSwimmable (List<Animal> animals);
    public boolean deleteAnimalSwimmableAndFlyable (List<Animal> animals);
}
