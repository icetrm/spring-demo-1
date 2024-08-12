package com.example.demo.service;

import com.example.demo.factory.FileParserFactory;
import com.example.demo.parser.FileParser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@RequiredArgsConstructor
public class FileParserService {

    private final FileParserFactory fileParserFactory;

    public void parse(File file, String fileType) {
        FileParser fileParser = fileParserFactory.get(fileType);
        fileParser.parse(file);
    }

}
