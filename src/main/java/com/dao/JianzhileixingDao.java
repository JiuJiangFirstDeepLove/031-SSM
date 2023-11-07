package com.dao;

import com.entity.JianzhileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianzhileixingVO;
import com.entity.view.JianzhileixingView;


/**
 * 兼职类型
 * 
 * @author 
 * @email 
 * @date 2030-05-06 11:23:28
 */
public interface JianzhileixingDao extends BaseMapper<JianzhileixingEntity> {
	
	List<JianzhileixingVO> selectListVO(@Param("ew") Wrapper<JianzhileixingEntity> wrapper);
	
	JianzhileixingVO selectVO(@Param("ew") Wrapper<JianzhileixingEntity> wrapper);
	
	List<JianzhileixingView> selectListView(@Param("ew") Wrapper<JianzhileixingEntity> wrapper);

	List<JianzhileixingView> selectListView(Pagination page,@Param("ew") Wrapper<JianzhileixingEntity> wrapper);
	
	JianzhileixingView selectView(@Param("ew") Wrapper<JianzhileixingEntity> wrapper);
	

}
