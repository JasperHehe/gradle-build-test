package jasper;

import org.springframework.web.bind.annotation.*;

@RestController()
public class TestController {
    private Test test;

    public TestController(Test test){
        this.test = test;
    }

    @RequestMapping(value="test", method= RequestMethod.GET)
    public String printTest(){
        return test.printTest();
    }

    @RequestMapping(value="printbody", method= RequestMethod.POST)
    public String printBody(@RequestBody User user){
        return user.userName;
    }


}
