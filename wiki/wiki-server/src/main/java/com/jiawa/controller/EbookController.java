package com.jiawa.controller;

import com.jiawa.result.Result;
import com.jiawa.service.EbookService;
import com.jiawa.wiki.domain.Ebook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author duoduo
 * @version 1.0
 * @date 2023/10/24 11:46
 */
@RestController
@RequestMapping("/ebook")
@Slf4j
public class EbookController {
    @Autowired
    private EbookService ebookService;
    @GetMapping("/list")
    public Result<List<Ebook>> getEbook(){

        List<Ebook> ebooks = ebookService.selEbooks();
        return Result.ok(ebooks);
    }

}
