package com.accp.domain;

import java.util.List;

/**
 * ��ҳ��
 * 
 * @author admin
 *
 */
public class PageBean<E> {
	private int currentPage = 1;// ��ǰҳ��
	private int pageSize = 10;// ÿҳ����
	private int totalSize;// ��������
	private List<E> list;// ��ҳ����

	private int nextPage;// ��һҳ
	private int prevPage;// ��һҳ
	private int totalPage;// ��ҳ��


	public PageBean(int currentPage, int pageSize, int totalSize, List<E> list) {

		this.totalSize = totalSize;
		this.list = list;

		if (totalSize % pageSize == 0) {
			totalPage = totalSize / pageSize;
		} else {
			totalPage = totalSize / pageSize + 1;
		}
		if (currentPage >= totalPage) {
			nextPage = totalPage;

		} else {
			nextPage = currentPage + 1;
		}
		if (currentPage <= 1) {
			prevPage = 1;
		} else {
			prevPage = currentPage - 1;
		}

		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

}
