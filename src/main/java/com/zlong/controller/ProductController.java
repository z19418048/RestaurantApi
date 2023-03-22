package com.zlong.controller;

import com.zlong.entity.dto.ProductDto;
import com.zlong.entity.vo.ResultVo;
import com.zlong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
* 产品控制器
* */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;
    /*
     * 根据条件获取产品详情
     * */
    @GetMapping("/getProductDetails")
    public ResultVo getProductDetails(ProductDto productDto){
        return productService.getProductDetails(productDto);
    }

}
