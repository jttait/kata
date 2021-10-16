package pokerhands.solution;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller("/score")
public class ScoreController {
    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String index(@Body String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<CardBody> cardBodies;
        try {
            cardBodies = objectMapper.readValue(json, new TypeReference<List<CardBody>>() {});
        }
        catch (Exception e) {
            return "Error: Unable to parse request.";
        }
        Hand hand = new Hand();
        List<Card> cards = cardBodies.stream()
                .map(cardBody -> { return new Card(cardBody.getRank(), cardBody.getSuit()); })
                .collect(Collectors.toList());
        for (Card card : cards) {
            hand.addCard(card);
        }
        HandScorer handScorer = new HandScorer();
        Score score = handScorer.score(hand);
        return score.toString();
    }
}

class CardBody {
    private String rank;
    private String suit;

    String getRank() {
        return this.rank;
    }

    void setRank(String rank) {
        this.rank = rank;
    }

    String getSuit() {
        return this.suit;
    }

    void setSuit(String suit) {
        this.suit = suit;
    }
}
