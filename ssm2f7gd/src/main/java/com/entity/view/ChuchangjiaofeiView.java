package com.entity.view;

import com.entity.ChuchangjiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出场缴费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-21 11:34:51
 */
@TableName("chuchangjiaofei")
public class ChuchangjiaofeiView  extends ChuchangjiaofeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuchangjiaofeiView(){
	}
 
 	public ChuchangjiaofeiView(ChuchangjiaofeiEntity chuchangjiaofeiEntity){
 	try {
			BeanUtils.copyProperties(this, chuchangjiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
