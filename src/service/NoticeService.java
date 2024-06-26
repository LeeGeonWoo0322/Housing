package service;

import java.util.List;
import java.util.Map;

import dao.NoticeDao;

public class NoticeService {
	private static NoticeService instance;

	private NoticeService() {

	}

	public static NoticeService getInstance() {
		if (instance == null) {
			instance = new NoticeService();
		}
		return instance;
	}
	
	
	NoticeDao noticeDao = NoticeDao.getInstance();

	
	public List<Map<String, Object>> noticeList() {
		return noticeDao.noticeList();
	}
	
	
	
}
