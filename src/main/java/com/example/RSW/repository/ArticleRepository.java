package com.example.RSW.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.RSW.vo.Article;

@Mapper
public interface ArticleRepository {

	public int writeArticle(int memberId, String title, String body, String boardId);

	public void deleteArticle(int id);

	public void modifyArticle(int id, String title, String body);

	public int getLastInsertId();

	public Article getArticleById(int id);

	public List<Article> getArticles();

	public Article getForPrintArticle(int loginedMemberId);

	public List<Article> getForPrintArticles(int boardId, int limitFrom, int limitTake, String searchKeywordTypeCode,
			String searchKeyword);

	public int getArticleCount(int boardId, String searchKeywordTypeCode, String searchKeyword);

	public int increaseHitCount(int id);

	public int getArticleHitCount(int id);

	public int increaseGoodReactionPoint(int relId);

	public int decreaseGoodReactionPoint(int relId);

	public int increaseBadReactionPoint(int relId);

	public int decreaseBadReactionPoint(int relId);

	public int getGoodRP(int relId);

	public int getBadRP(int relId);

	List<Article> findAll();

	public List<Article> findByCrewId(int crewId);

	void insertCrewArticle(@Param("crewId") int crewId, @Param("memberId") int memberId, @Param("title") String title,
			@Param("body") String body);

}