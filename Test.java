public class Test {

    public static void main1(String[] args) {
        Photo photo1 = new View();
        Photo photo2 = new Person();
        photoIntroduction(photo1);
        photoIntroduction(photo2);
    }
    public static void photoIntroduction(Photo photo) {
        photo.photo();
    }
}

abstract class Photo {
    abstract public void photo();
}

class View extends Photo {
    @Override
    public void photo() {
        System.out.println("view");
    }
}
class Person extends Photo {
    @Override
    public void photo() {
        System.out.println("person");
    }
}