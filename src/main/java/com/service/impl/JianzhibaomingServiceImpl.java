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


import com.dao.JianzhibaomingDao;
import com.entity.JianzhibaomingEntity;
import com.service.JianzhibaomingService;
import com.entity.vo.JianzhibaomingVO;
import com.entity.view.JianzhibaomingView;

@Service("jianzhibaomingService")
public class JianzhibaomingServiceImpl extends ServiceImpl<JianzhibaomingDao, JianzhibaomingEntity> implements JianzhibaomingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianzhibaomingEntity> page = this.selectPage(
                new Query<JianzhibaomingEntity>(params).getPage(),
                new EntityWrapper<JianzhibaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianzhibaomingEntity> wrapper) {
		  Page<JianzhibaomingView> page =new Query<JianzhibaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianzhibaomingVO> selectListVO(Wrapper<JianzhibaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianzhibaomingVO selectVO(Wrapper<JianzhibaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianzhibaomingView> selectListView(Wrapper<JianzhibaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianzhibaomingView selectView(Wrapper<JianzhibaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
