public class Main {

    public static void main(String[] args){
        Person batool = new Person();
        Person mahmoud = new Person();

        System.out.println(batool.getFullName());
        System.out.println(batool.getHeightInFeet());
        System.out.println(batool.getAge());
        System.out.println("I’m eating!" +batool.eating());
        System.out.println(batool.getInfo());
        System.out.println(batool.counter);
    }
}
