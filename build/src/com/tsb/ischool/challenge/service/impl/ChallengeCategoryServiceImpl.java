/**
 * 版权所有：版权所有(C) 2016，学酷网络 
 * 文件名称: ChallengeCategoryServiceImpl.java 
 * 设计作者: 
 * 完成日期: 
 * 内容摘要:
 *
 * 修改记录: 
 * 修改日期:
 * 修 改 人:
 * 修改内容:
 */
package com.tsb.ischool.challenge.service.impl;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import com.tsb.ischool.challenge.dao.IChallengeCategoryDao;
import com.tsb.ischool.challenge.model.ChallengeCategory;
import com.tsb.ischool.challenge.service.IChallengeCategoryService;
import com.tsb.ischool.challenge.webservice.c2sbean.C2SChallengeCategory;
import com.tsb.ischool.framework.bean.comm.PageBean;
import com.tsb.ischool.framework.common.ISchoolConstants;

/**
 * 类 编 号： 
 * 类 名 称：ChallengeCategoryServiceImpl
 * 内容摘要：
 * 完成日期：
 * 编码作者：
 */
@Service("challengeCategoryService")
public class ChallengeCategoryServiceImpl implements IChallengeCategoryService
{
   private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Resource
	private IChallengeCategoryDao challengeCategoryDao;
	
	
	@Override
	public int insert(ChallengeCategory bean) {
		String operation = ISchoolConstants.LOGGER_PREFIX_DEBUG + "THREADID = "
				+ Thread.currentThread().getId() + ".|新增 爱挑战ChallengeCategory.|bean="
				+ bean.toString() + ".|";
		logger.debug(operation + "开始.|");
		int result =challengeCategoryDao.insert(bean);
		logger.debug(operation + "结束.|");
		return result;
	}
	
	@Override
	public int update(ChallengeCategory bean) {
		String operation = ISchoolConstants.LOGGER_PREFIX_DEBUG + "THREADID = "
				+ Thread.currentThread().getId() + ".|修改爱挑战ChallengeCategory.|bean="
				+ bean.toString() + ".|";
		logger.debug(operation + "开始.|");
		int result = challengeCategoryDao.update(bean);
		logger.debug(operation + "结束.|");
		return result;
	}
	@Override
	public ChallengeCategory queryById(String pkid) {
		String operation = ISchoolConstants.LOGGER_PREFIX_DEBUG + "THREADID = "
				+ Thread.currentThread().getId() + ".|按id查询爱挑战ChallengeCategory.|bean="
				+ pkid + ".|";
		logger.debug(operation + "开始.|");
		ChallengeCategory challengeCategory = challengeCategoryDao.queryById(pkid);
		logger.debug(operation + "结束.|");
		return challengeCategory;
	}
	
	@Override
	public int deleteById(String pkid) {
		String operation = ISchoolConstants.LOGGER_PREFIX_DEBUG + "THREADID = "
				+ Thread.currentThread().getId() + ".|删除爱挑战ChallengeCategory.|bean="
				+ pkid + ".|";
		logger.debug(operation + "开始.|");
		int result = challengeCategoryDao.deleteById(pkid);
		logger.debug(operation + "结束.|");
		return result;
	}
	
	@Override
	public int deletelogicById(String pkid) {
		String operation = ISchoolConstants.LOGGER_PREFIX_DEBUG + "THREADID = "
				+ Thread.currentThread().getId() + ".|逻辑删除爱挑战ChallengeCategory.|bean="
				+ pkid + ".|";
		logger.debug(operation + "开始.|");
		int result = challengeCategoryDao.deletelogicById(pkid);
		logger.debug(operation + "结束.|");
		return result;
	}
	
	@Override
	public PageBean<ChallengeCategory> query(C2SChallengeCategory bean) {
		String operation = ISchoolConstants.LOGGER_PREFIX_DEBUG + "THREADID = "
				+ Thread.currentThread().getId() + ".|查询爱挑战ChallengeCategory.|bean="
				+ bean.toString() + ".|";
		logger.debug(operation + "开始.|");
		PageBean<ChallengeCategory> pageBean = challengeCategoryDao.query(bean);
		logger.debug(operation + "结束.|");
		return pageBean;
	}
	
}
