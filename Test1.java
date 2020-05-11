public class Test1 {
    static class Test {
        public static void main(String[] args) {
            Color paint = new Paint("粉色");
            Color photos = new Photos("全家福");
            Color rainbow = new Rainbow("彩虹");
        }
    }

    static class Color {
        protected String name;

        public Color(String name) {
            this.name = name;
        }
    }

    interface IPink {
        void pink();
    }

    interface IPurple {
        void purple();
    }

    interface IGreen {
        void green();
    }

    static class Paint extends Color implements IPink {
        public Paint(String name) {
            super(name);
        }

        @Override
        public void pink() {
            System.out.println("pink");
        }
    }

    static class Photos extends Color implements IPurple {
        public Photos(String name) {
            super(name);
        }

        @Override
        public void purple() {
            System.out.println("purple");
        }
    }

    static class Rainbow extends Color implements IGreen, IPurple {
        public Rainbow(String name) {
            super(name);
        }

        //ctrl + i 快速实现接口
        @Override
        public void purple() {
            System.out.println("purple");
        }

        @Override
        public void green() {
            System.out.println("green");
        }
    }
}
