package jasper.Service;

import jasper.Service.Impl.BookImpl;
import jasper.Service.Impl.PenImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    /**
     * 使用了别名绑定bean，调用类的时候必须@Qualifier指定别名
     * 没有使用别名，直接绑定bean，类名后面的参数名要相同
     */
    @Bean(name = "test11")
    public Product test1(){
        return new BookImpl();
    }

    @Bean(name = "test22")
    public Product test2(){
        return new PenImpl();
    }

}
