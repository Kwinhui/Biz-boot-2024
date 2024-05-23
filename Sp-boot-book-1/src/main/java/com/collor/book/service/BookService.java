package com.collor.book.service;

import com.collor.book.dao.BookDao;
import com.collor.book.models.BookVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<BookVO> selectAll() {

        return bookDao.findAll();
    }

    public BookVO createBooks(BookVO bookVO) {

        return bookDao.save(bookVO);

    }
}
