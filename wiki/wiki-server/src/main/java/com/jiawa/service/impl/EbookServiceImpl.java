package com.jiawa.service.impl;

import com.jiawa.mapper.EbookMapper;
import com.jiawa.wiki.domain.Ebook;
import com.jiawa.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author duoduo
 * @version 1.0
 * @date 2023/10/24 14:03
 */
@Service
public class EbookServiceImpl implements EbookService {
    @Autowired
    private EbookMapper ebookMapper;
    @Override
    public Ebook selById(Long id) {
        Ebook ebook = ebookMapper.selectByPrimaryKey(id);
        return ebook;
    }

    @Override
    public List<Ebook> selEbooks() {
        List<Ebook> ebooks = ebookMapper.selectByExample(null);
        return ebooks;
    }
}
