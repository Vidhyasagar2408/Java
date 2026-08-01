public class CustomAnnotations {

    @MaxAge(age = 60)
    @MinAge(age = 18)
    void display(int age) {
        System.out.println(age);
    }
}
