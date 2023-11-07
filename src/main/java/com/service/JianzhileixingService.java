package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianzhileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianzhileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianzhileixingView;


/**
 * 兼职类型
 *
 * @author 
 * @email 
 * @date 2030-05-06 11:23:28
 */
public interface JianzhileixingService extends IService<JianzhileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianzhileixingVO> selectListVO(Wrapper<JianzhileixingEntity> wrapper);
   	
   	JianzhileixingVO selectVO(@Param("ew") Wrapper<JianzhileixingEntity> wrapper);
   	
   	List<JianzhileixingView> selectListView(Wrapper<JianzhileixingEntity> wrapper);
   	
   	JianzhileixingView selectView(@Param("ew") Wrapper<JianzhileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianzhileixingEntity> wrapper);
   	

}

