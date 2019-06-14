package jasper.Service.Impl;

import jasper.Service.People;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

// 对于同一个接口有多个实现类定义别名，只能用service注解定义名字
//@RestController("peopleImpl")
@Service(value = "peopleImpl1")
public class PeopleImpl implements People {
    @Override
    public int getSex(){
        return 11111;
    }
}
