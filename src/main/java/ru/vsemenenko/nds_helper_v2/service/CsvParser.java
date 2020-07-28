package ru.vsemenenko.nds_helper_v2.service;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.vsemenenko.nds_helper_v2.entity.DealInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvParser {

    public List<DealInfo> parseCsvAsMultipartFile(MultipartFile file) throws Exception {
        List<DealInfo> dealInfos = new ArrayList<>();
//        Files.lines(file.get, StandardCharsets.UTF_8);
        try (Reader br = new InputStreamReader(file.getInputStream())) {
            HeaderColumnNameMappingStrategy<DealInfo> strategy
                    = new HeaderColumnNameMappingStrategy<>();
            strategy.setType(DealInfo.class);

            CsvToBean<DealInfo> csvToBean = new CsvToBeanBuilder<DealInfo>(br)
                    .withMappingStrategy(strategy)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withSeparator(';')
                    .build();

            dealInfos = csvToBean.parse();
        }
        return dealInfos;
    }
}
