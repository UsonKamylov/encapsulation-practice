public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Meder");
        person.setLastName("Tynychbekov");

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(2);
        cat.setWeight(1.5);
        cat.setOwner("Meder");
        cat.setPerson(person);

        cat.hasOwner();


    }
}