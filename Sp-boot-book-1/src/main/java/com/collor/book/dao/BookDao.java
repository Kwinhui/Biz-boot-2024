package com.collor.book.dao;

import com.collor.book.models.BookVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<BookVO, String> {

}
