package com.znmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.znmall.common.utils.PageUtils;
import com.znmall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author qingzhe
 * @email liqingzhe86@gmail.com
 * @date 2020-08-08 08:44:50
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

