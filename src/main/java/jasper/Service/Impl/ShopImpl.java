package jasper.Service.Impl;

import jasper.Service.Product;
import jasper.Service.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopImpl implements Shop {
    @Qualifier("test22")
    @Autowired
    Product Product;

    @Override
    public String getProduct(){
        return Product.getName();
    }

}
