public class Main {
    public static void main(String[] args) {
        String [] commands = {"Сидеть" , "Лежать"};
        Shelter shelter = new Shelter("Romashka", "lenina 29");
        Dog dog = new Dog("Rex", "Mastiv",commands,shelter,color.BROWN );
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гув гув");
    }
}