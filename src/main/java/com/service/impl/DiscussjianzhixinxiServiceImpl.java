package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjianzhixinxiDao;
import com.entity.DiscussjianzhixinxiEntity;
import com.service.DiscussjianzhixinxiService;
import com.entity.vo.DiscussjianzhixinxiVO;
import com.entity.view.DiscussjianzhixinxiView;

@Service("discussjianzhixinxiService")
public class DiscussjianzhixinxiServiceImpl extends ServiceImpl<DiscussjianzhixinxiDao, DiscussjianzhixinxiEntity> implements DiscussjianzhixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianzhixinxiEntity> page = this.selectPage(
                new Query<DiscussjianzhixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjianzhixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianzhixinxiEntity> wrapper) {
		  Page<DiscussjianzhixinxiView> page =new Query<DiscussjianzhixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianzhixinxiVO> selectListVO(Wrapper<DiscussjianzhixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianzhixinxiVO selectVO(Wrapper<DiscussjianzhixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianzhixinxiView> selectListView(Wrapper<DiscussjianzhixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianzhixinxiView selectView(Wrapper<DiscussjianzhixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
