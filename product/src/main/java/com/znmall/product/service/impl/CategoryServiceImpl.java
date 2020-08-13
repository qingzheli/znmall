package com.znmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.znmall.common.utils.PageUtils;
import com.znmall.common.utils.Query;

import com.znmall.product.dao.CategoryDao;
import com.znmall.product.entity.CategoryEntity;
import com.znmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
//        1. query all categories
        List<CategoryEntity> entities  = baseMapper.selectList(null);

//        2. build tree structure for categories
//        2.1. find all level-1 category
        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity -> categoryEntity.getParentCid() == 0))
                .map(category->{
                    category.setChildren(getChildren(category,entities));
                    return category;
                })
                .sorted((category1, category2)->(category1.getSort()==null?0:category1.getSort())-(category2.getSort()==null?0:category2.getSort()))
                .collect(Collectors.toList());


        return level1Menus;
    }

    private List<CategoryEntity> getChildren(CategoryEntity parentCategory, List<CategoryEntity> entities) {
        return entities.stream().filter((categoryEntity -> categoryEntity.getParentCid()==parentCategory.getCatId()))
                .map(childCategory->{
                    childCategory.setChildren(getChildren(childCategory, entities));
                    return childCategory;
                })
                .sorted((category1, category2)->(category1.getSort()==null?0:category1.getSort())-(category2.getSort()==null?0:category2.getSort()))
                .collect(Collectors.toList());
    }

}