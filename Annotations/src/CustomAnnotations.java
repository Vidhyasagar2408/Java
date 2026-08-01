public class CustomAnnotations {

    @MaxAge(age = 60)
    @MinAge(age = 18)
    void display(@OneParameter(par = 1) int age) {
        System.out.println(age);
    }
}
