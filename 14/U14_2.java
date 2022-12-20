public class U14_2 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Tiger", 200);
        Animal animal2 = new Animal("Elephant", 4000);
        AnimalList animalList = new AnimalList();
        animalList.add(animal1);
        animalList.add(animal2);

        print (animalList);
    }

    public static void print (AnimalList animalList) {
        int size = animalList.size();
        for (int i = 0; i < size; i++) {
            Animal animal = animalList.get(i);
            System.out.print (animal.getName() + " ");
            System.out.println (animal.getWeight());
        }
    }
}
