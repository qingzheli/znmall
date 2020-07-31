package com.znmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.znmall.product.entity.BrandEntity;
import com.znmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("Apple inc.");
//        brandEntity.setName("Apple");
//        brandService.save(brandEntity);
//        System.out.println("Successfully saved!");
//        brandService.updateById(brandEntity);
        List<BrandEntity> list  = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println("brand id is: "+item);
        });
    }

}
