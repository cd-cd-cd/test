package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;

public interface DishService extends IService<Dish> {
    public DishDto getByIdWithFlavor(Long id);

    void saveWithFlavor(DishDto dishDto);

    void updateWithFlavor(DishDto dishDto);
}
