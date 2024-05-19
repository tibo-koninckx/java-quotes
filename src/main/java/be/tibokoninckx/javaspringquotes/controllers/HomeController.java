package be.tibokoninckx.javaspringquotes.controllers;

import be.tibokoninckx.javaspringquotes.model.Quote;
import be.tibokoninckx.javaspringquotes.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Random;

@Controller
public class HomeController {
    private final QuoteService quoteService;

    public HomeController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }
    private Random random = new Random();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("quotes", quoteService.getQuotes());
        ArrayList<Quote> quotes = new ArrayList<>(quoteService.getQuotes());
        model.addAttribute("randomQuote", quotes.get(random.nextInt(quotes.size())));
        return "index";
    }
}
