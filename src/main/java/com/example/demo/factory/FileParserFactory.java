package com.example.demo.factory;

import com.example.demo.parser.FileParser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class FileParserFactory {

    private final Map<String, FileParser> fileParsers;

    public FileParser get(String fileType) {
        FileParser fileParser = fileParsers.get(fileType);
        if (Objects.isNull(fileParser)) {
            throw new IllegalArgumentException("Unsupported file type");
        }
        return fileParser;
    }

}