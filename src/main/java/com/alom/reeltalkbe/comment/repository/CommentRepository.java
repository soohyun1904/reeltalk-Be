package com.alom.reeltalkbe.comment.repository;

import com.alom.reeltalkbe.comment.domain.Comment;
import com.alom.reeltalkbe.review.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByReview(Review review);

}
