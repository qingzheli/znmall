package com.znmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.znmall.common.utils.PageUtils;
import com.znmall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author qingzhe
 * @email liqingzhe86@gmail.com
 * @date 2020-07-30 19:08:38
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

