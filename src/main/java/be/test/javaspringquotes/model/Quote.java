package be.test.javaspringquotes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {
    @JsonProperty("ID")
    private Integer id;
    private String quoteText;
    private String description;

    public Quote(Integer id, String quoteText, String description) {
        this.id = id;
        this.quoteText = quoteText;
        this.description = description;
    }
    public Quote() {
    }

    public String getQuoteText() {
        return quoteText;
    }


    public String getDescription() {
        return description;
    }
}
