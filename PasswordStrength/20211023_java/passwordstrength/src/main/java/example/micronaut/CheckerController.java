package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/check")
public class CheckerController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    String index(String password) {
        PasswordStrengthChecker checker = new PasswordStrengthChecker();
        return checker.check(password) ? "pass" : "fail";
    }
}
