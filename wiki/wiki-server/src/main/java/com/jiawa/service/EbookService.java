package com.jiawa.service;

import com.jiawa.wiki.domain.Ebook;

import java.util.List;

/**
 * @author duoduo
 * @version 1.0
 * @date 2023/10/24 11:49
 */

public interface EbookService {
    Ebook selById(Long id);

    List<com.jiawa.wiki.domain.Ebook> selEbooks();
}
