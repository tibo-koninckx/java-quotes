package be.tibokoninckx.javaspringquotes.model;

public class Quote {
    private Integer id;
    private String QuoteText;
    private String description;

    public Quote(Integer id, String quoteText, String description) {
        this.id = id;
        QuoteText = quoteText;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuoteText() {
        return QuoteText;
    }

    public void setQuoteText(String quoteText) {
        QuoteText = quoteText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
