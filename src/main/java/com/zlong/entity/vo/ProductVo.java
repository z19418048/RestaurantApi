package com.zlong.entity.vo;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
/*
* 产品Vo
* */
@Data
public class ProductVo {
    //产品ID
    private Integer id;
    //产品名称
    private String name;
    //产品描述
    private String description;
    //产品照片地址
    private String photo;
    //产品价格
    private Integer price;
    //产品库存
    private Integer stock;
    //产品类别id
    private Integer categoryid;
}
