package be.tibokoninckx.javaspringquotes.model;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
