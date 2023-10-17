package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.person.Card;

/**
 * DisplayCard class to showcase the question and the answr
 */
public class DisplayCard extends UiPart<Region> {
    private static final String FXML = "DisplayListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Card card;

    @javafx.fxml.FXML
    private HBox cardPane;
    @FXML
    private Label id;

    @FXML
    private Label question;

    /**
     * Creates a {@code PersonCode} with the given {@code Person} and index to display.
     */

    public DisplayCard(Card card, int displayedIndex) {
        super(FXML);
        this.card = card;
        id.setText(displayedIndex + ". ");
        question.setText(card.getQuestion().question);

    }
}
