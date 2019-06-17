package jasper.Service.Impl;

import jasper.Service.Product;

public class BookImpl implements Product {
    @Override
    public String getName(){
        return "book";
    }
}
