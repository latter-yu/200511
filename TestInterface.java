public class TestInterface {
    interface IPhoto {
        void photos();
        //接口中只能包含抽象方法.
        //对于字段来说, 接口中只能包含静态常量(默认)
        int num = 10;
        //public static final int num = 10;
    }

    static class View1 implements IPhoto {
        @Override
        public void photos() {
            System.out.println("view");
        }
    }
    static class Person1 implements IPhoto {
        @Override
        public void photos() {
            System.out.println("person");
        }
    }

    static class Test1 {
        public static void main(String[] args) {
            IPhoto photo1 = new View1();
            IPhoto photo2 = new Person1();
            photoIntroduction(photo1);
            photoIntroduction(photo2);
        }
        public static void photoIntroduction(IPhoto photo) {
            photo.photos();
        }
    }
}
