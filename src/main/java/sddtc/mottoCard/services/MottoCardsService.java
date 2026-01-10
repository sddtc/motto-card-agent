package sddtc.mottoCard.services;

import org.springframework.stereotype.Service;
import sddtc.mottoCard.MottoCard;
import sddtc.mottoCard.MottoCardConfig;

import java.util.List;

@Service
public class MottoCardsService {

    private final MottoCardConfig config;

    public MottoCardsService(MottoCardConfig config) {
        this.config = config;
    }

    public List<MottoCard> get() {
        return config.getContent();
    }
}
