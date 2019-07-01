package jasper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

    @Autowired
    HelloWorld helloWorld;

//    public HelloController(HelloWorld helloWorld) {
//        this.helloWorld = helloWorld;
//    }

    // hello
    @GetMapping(value="hello")
    public String hello() {
        return helloWorld.hello();
    }
}