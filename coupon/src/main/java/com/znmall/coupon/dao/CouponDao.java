package com.znmall.coupon.dao;

import com.znmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author qingzhe
 * @email liqingzhe86@gmail.com
 * @date 2020-08-08 08:44:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
