package jasper.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface Shop {
    @RequestMapping(value="product", method = RequestMethod.GET)

    public String getProduct();
}