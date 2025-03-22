package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeiguichufaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeiguichufaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeiguichufaView;


/**
 * 违规处罚
 *
 * @author 
 * @email 
 * @date 2021-01-21 11:34:51
 */
public interface WeiguichufaService extends IService<WeiguichufaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeiguichufaVO> selectListVO(Wrapper<WeiguichufaEntity> wrapper);
   	
   	WeiguichufaVO selectVO(@Param("ew") Wrapper<WeiguichufaEntity> wrapper);
   	
   	List<WeiguichufaView> selectListView(Wrapper<WeiguichufaEntity> wrapper);
   	
   	WeiguichufaView selectView(@Param("ew") Wrapper<WeiguichufaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeiguichufaEntity> wrapper);
   	
}

