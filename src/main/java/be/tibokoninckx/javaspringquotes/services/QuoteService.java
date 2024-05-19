package be.tibokoninckx.javaspringquotes.services;

import be.tibokoninckx.javaspringquotes.model.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Service
public class QuoteService {
    public List<Quote> getQuotes() {
        try {
            InputStream quoteFile = new ClassPathResource("data.json").getInputStream();
            ObjectMapper objectMapper = new ObjectMapper();
            return Arrays.asList(objectMapper.readValue(quoteFile, Quote[].class));
        } catch (Exception e) {
            throw new RuntimeException("Failed to load quotes frol JSON file", e);
        }
    }
}
