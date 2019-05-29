package jasper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {
    private Test test;

    public TestController(Test test){
        this.test = test;
    }

    @GetMapping(value="test")
    public String printTest(){
        return test.printTest();
    }

}
