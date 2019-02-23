public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        Person p = new Person("Krzysiek");
        System.out.println("Witaj");
        try {
            showMeError();
            System.out.println("Access element is array");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Expection throw  :" + e);
        }

    }
    private static void showMeError() {
        int num[] = {0, 1, 2, 3};
        System.out.println(num[12]);
        try {
            showMeError();
            System.out.println("Access element is array");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Expection throw  :"+ e);
        }


    }
}


