package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuchangtingcheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuchangtingcheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuchangtingcheView;


/**
 * 入场停车
 *
 * @author 
 * @email 
 * @date 2021-01-21 11:34:51
 */
public interface RuchangtingcheService extends IService<RuchangtingcheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuchangtingcheVO> selectListVO(Wrapper<RuchangtingcheEntity> wrapper);
   	
   	RuchangtingcheVO selectVO(@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);
   	
   	List<RuchangtingcheView> selectListView(Wrapper<RuchangtingcheEntity> wrapper);
   	
   	RuchangtingcheView selectView(@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuchangtingcheEntity> wrapper);
   	
}

