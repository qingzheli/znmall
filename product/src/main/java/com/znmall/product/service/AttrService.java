package com.znmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.znmall.common.utils.PageUtils;
import com.znmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author qingzhe
 * @email liqingzhe86@gmail.com
 * @date 2020-07-30 19:08:38
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

