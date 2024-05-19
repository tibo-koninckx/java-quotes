package be.tibokoninckx.javaspringquotes.controllers;

import be.tibokoninckx.javaspringquotes.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final QuoteService quoteService;

    public HomeController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("quotes", quoteService.getQuotes());
        return "index";
    }
}
