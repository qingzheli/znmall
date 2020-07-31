package com.znmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.znmall.common.utils.PageUtils;
import com.znmall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author qingzhe
 * @email liqingzhe86@gmail.com
 * @date 2020-07-30 19:08:38
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

