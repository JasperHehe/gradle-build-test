package jasper.Service.Impl;

import jasper.Service.People;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleImpl implements People {
    @Override
    public int getSex(){
        return 11111;
    }
}
