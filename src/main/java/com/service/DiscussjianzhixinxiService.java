package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianzhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianzhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianzhixinxiView;


/**
 * 兼职信息评论表
 *
 * @author 
 * @email 
 * @date 2030-05-06 11:23:28
 */
public interface DiscussjianzhixinxiService extends IService<DiscussjianzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianzhixinxiVO> selectListVO(Wrapper<DiscussjianzhixinxiEntity> wrapper);
   	
   	DiscussjianzhixinxiVO selectVO(@Param("ew") Wrapper<DiscussjianzhixinxiEntity> wrapper);
   	
   	List<DiscussjianzhixinxiView> selectListView(Wrapper<DiscussjianzhixinxiEntity> wrapper);
   	
   	DiscussjianzhixinxiView selectView(@Param("ew") Wrapper<DiscussjianzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianzhixinxiEntity> wrapper);
   	

}

