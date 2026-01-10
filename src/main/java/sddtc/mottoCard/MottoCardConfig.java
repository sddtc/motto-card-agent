package sddtc.mottoCard;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "motto.cards")
@Data
public class MottoCardConfig {
    private List<MottoCard> content;
}
