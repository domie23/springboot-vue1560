package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuchangjiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuchangjiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuchangjiaofeiView;


/**
 * 出场缴费
 *
 * @author 
 * @email 
 * @date 2021-01-21 11:34:51
 */
public interface ChuchangjiaofeiService extends IService<ChuchangjiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuchangjiaofeiVO> selectListVO(Wrapper<ChuchangjiaofeiEntity> wrapper);
   	
   	ChuchangjiaofeiVO selectVO(@Param("ew") Wrapper<ChuchangjiaofeiEntity> wrapper);
   	
   	List<ChuchangjiaofeiView> selectListView(Wrapper<ChuchangjiaofeiEntity> wrapper);
   	
   	ChuchangjiaofeiView selectView(@Param("ew") Wrapper<ChuchangjiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuchangjiaofeiEntity> wrapper);
   	
}

