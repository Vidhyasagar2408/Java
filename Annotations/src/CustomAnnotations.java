public class CustomAnnotations {

    @MinAge(age = 18)
    void display(int age) {
        System.out.println(age);
    }

    @MaxAge(age = 60)
    void display2(int age) {
        System.out.println(age);
    }
}
