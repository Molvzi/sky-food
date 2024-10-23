package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入动态数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}
