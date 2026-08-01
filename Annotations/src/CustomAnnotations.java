public class CustomAnnotations {
    @MinAge(age = 18)
    void display(int age) {
        System.out.println(age);
    }
}
