package com.dao;

import com.entity.JianzhibaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianzhibaomingVO;
import com.entity.view.JianzhibaomingView;


/**
 * 兼职报名
 * 
 * @author 
 * @email 
 * @date 2030-05-06 11:23:28
 */
public interface JianzhibaomingDao extends BaseMapper<JianzhibaomingEntity> {
	
	List<JianzhibaomingVO> selectListVO(@Param("ew") Wrapper<JianzhibaomingEntity> wrapper);
	
	JianzhibaomingVO selectVO(@Param("ew") Wrapper<JianzhibaomingEntity> wrapper);
	
	List<JianzhibaomingView> selectListView(@Param("ew") Wrapper<JianzhibaomingEntity> wrapper);

	List<JianzhibaomingView> selectListView(Pagination page,@Param("ew") Wrapper<JianzhibaomingEntity> wrapper);
	
	JianzhibaomingView selectView(@Param("ew") Wrapper<JianzhibaomingEntity> wrapper);
	

}
