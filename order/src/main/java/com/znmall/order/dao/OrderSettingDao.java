package com.znmall.order.dao;

import com.znmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author qingzhe
 * @email liqingzhe86@gmail.com
 * @date 2020-08-08 09:32:58
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
