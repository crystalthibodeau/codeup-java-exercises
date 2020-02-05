public class car implements vehicle {
    public void go(double miles){
        System.out.printf("Go, VROOOM for %.0f miles", miles);
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2(int num) {

    }

    @Override
    public void method3(String message) {

    }

}
//implements an interface instead of extending an abstract class