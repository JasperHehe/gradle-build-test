package jasper.Service.Impl;

import jasper.Service.People;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

// 对于同一个接口有多个实现类定义别名，只能用service注解定义名字
//@RestController( "people2Impl")
@Service(value = "people2Impl1")
public class People2Impl implements People{
    @Override
    public int getSex(){
        return 22222;
    }
}
