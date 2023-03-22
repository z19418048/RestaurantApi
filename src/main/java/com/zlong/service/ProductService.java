package com.zlong.service;

import com.zlong.entity.dto.ProductDto;
import com.zlong.entity.vo.ResultVo;


/*
* 产品服务层接口
* */
public interface ProductService {
    /*
     * 根据条件获取产品详情
     * */
    ResultVo getProductDetails(ProductDto productDto);
}
