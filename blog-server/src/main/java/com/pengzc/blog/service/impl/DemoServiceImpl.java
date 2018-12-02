package com.pengzc.blog.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.pengzc.blog.entity.DemoEntity;
import com.pengzc.blog.mapper.DemoMapper;
import com.pengzc.blog.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DemoServiceImpl
 * @Description
 * @Auth pengzc
 * @Date 2018/12/2
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;



    @Override
    public List<DemoEntity> getAll() {
        return demoMapper.selectList(new EntityWrapper<DemoEntity>());
    }
}
