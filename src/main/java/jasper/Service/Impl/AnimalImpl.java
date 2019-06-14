package jasper.Service.Impl;

import jasper.Service.Animal;
import jasper.Service.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalImpl implements Animal {
    @Autowired
    People people;

    @Override
    public int getSex(){
        return people.getSex();
       // return 2222;
    }
}
