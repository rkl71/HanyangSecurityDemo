package com.hanyang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hanyang.domain.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}