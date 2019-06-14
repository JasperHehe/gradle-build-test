package jasper.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface Animal {
    @RequestMapping(value="animal", method = RequestMethod.GET)
    public int getSex();
}
