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


import com.dao.JianzhileixingDao;
import com.entity.JianzhileixingEntity;
import com.service.JianzhileixingService;
import com.entity.vo.JianzhileixingVO;
import com.entity.view.JianzhileixingView;

@Service("jianzhileixingService")
public class JianzhileixingServiceImpl extends ServiceImpl<JianzhileixingDao, JianzhileixingEntity> implements JianzhileixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianzhileixingEntity> page = this.selectPage(
                new Query<JianzhileixingEntity>(params).getPage(),
                new EntityWrapper<JianzhileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianzhileixingEntity> wrapper) {
		  Page<JianzhileixingView> page =new Query<JianzhileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianzhileixingVO> selectListVO(Wrapper<JianzhileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianzhileixingVO selectVO(Wrapper<JianzhileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianzhileixingView> selectListView(Wrapper<JianzhileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianzhileixingView selectView(Wrapper<JianzhileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
