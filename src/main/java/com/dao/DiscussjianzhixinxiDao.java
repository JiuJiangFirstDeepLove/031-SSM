package com.dao;

import com.entity.DiscussjianzhixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianzhixinxiVO;
import com.entity.view.DiscussjianzhixinxiView;


/**
 * 兼职信息评论表
 * 
 * @author 
 * @email 
 * @date 2030-05-06 11:23:28
 */
public interface DiscussjianzhixinxiDao extends BaseMapper<DiscussjianzhixinxiEntity> {
	
	List<DiscussjianzhixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjianzhixinxiEntity> wrapper);
	
	DiscussjianzhixinxiVO selectVO(@Param("ew") Wrapper<DiscussjianzhixinxiEntity> wrapper);
	
	List<DiscussjianzhixinxiView> selectListView(@Param("ew") Wrapper<DiscussjianzhixinxiEntity> wrapper);

	List<DiscussjianzhixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianzhixinxiEntity> wrapper);
	
	DiscussjianzhixinxiView selectView(@Param("ew") Wrapper<DiscussjianzhixinxiEntity> wrapper);
	

}
