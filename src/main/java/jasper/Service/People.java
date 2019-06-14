package jasper.Service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface People {
    @RequestMapping(value="people", method = RequestMethod.GET)
    public int getSex();
}
