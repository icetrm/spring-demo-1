package com.example.demo.parser.impl;

import com.example.demo.constant.FileType;
import com.example.demo.parser.FileParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;

@Slf4j
@Service(FileType.XML)
public class XmlFileParser implements FileParser {

    @Override
    public void parse(File file) {
        log.info("Parsing XML file");
    }

}
