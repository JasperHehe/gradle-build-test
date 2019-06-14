package jasper.Service.Impl;

import jasper.Service.Animal;
import jasper.Service.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AnimalImpl implements Animal {
//  指定要实现的具体类的别名，单独用Resource注解或者Qualifier和Autowired同时使用
//  @Resource(name="people2Impl")
    @Qualifier("people2Impl1")
    @Autowired
    People people;

    @Override
    public int getSex(){
        return people.getSex();
       // return 2222;
    }
}
