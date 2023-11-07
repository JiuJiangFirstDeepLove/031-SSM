package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianzhibaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianzhibaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianzhibaomingView;


/**
 * 兼职报名
 *
 * @author 
 * @email 
 * @date 2030-05-06 11:23:28
 */
public interface JianzhibaomingService extends IService<JianzhibaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianzhibaomingVO> selectListVO(Wrapper<JianzhibaomingEntity> wrapper);
   	
   	JianzhibaomingVO selectVO(@Param("ew") Wrapper<JianzhibaomingEntity> wrapper);
   	
   	List<JianzhibaomingView> selectListView(Wrapper<JianzhibaomingEntity> wrapper);
   	
   	JianzhibaomingView selectView(@Param("ew") Wrapper<JianzhibaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianzhibaomingEntity> wrapper);
   	

}

