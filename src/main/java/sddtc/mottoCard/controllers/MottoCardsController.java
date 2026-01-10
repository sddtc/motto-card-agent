package sddtc.mottoCard.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sddtc.mottoCard.MottoCard;
import sddtc.mottoCard.services.MottoCardsService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MottoCardsController {
    private final MottoCardsService mottoCardsService;

    public MottoCardsController(MottoCardsService mottoCardsService) {
        this.mottoCardsService = mottoCardsService;
    }

    @GetMapping("/motto-cards")
    public List<MottoCard> get() {
        return mottoCardsService.get();
    }
}
