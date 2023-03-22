package com.zlong.dao;

import com.zlong.entity.dto.ProductDto;


import java.util.List;

/*
*
* 产品Mapper
* */
public interface ProductMapper{
    /*
     * 根据条件获取产品详情
     * */
    List getProductDetails(ProductDto productDto);
}
