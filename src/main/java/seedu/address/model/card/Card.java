package seedu.address.model.card;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

import seedu.address.commons.util.ToStringBuilder;

/**
 * Represents a Card in lesSON.
 * Guarantees: details are present and not null, field values are validated,
 * immutable.
 */
public class Card implements Comparable<Card> {
    private final Question question;
    private final Answer answer;
    private String difficulty;
    private NextPracticeDate nextPracticeDate;

    /**
     * Every field must be present and not null.
     */
    public Card(Question question, Answer answer, String difficulty, NextPracticeDate nextPracticeDate) {
        requireAllNonNull(question, answer, nextPracticeDate);
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
        this.nextPracticeDate = nextPracticeDate;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public Question getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public NextPracticeDate getNextPracticeDate() {
        return this.nextPracticeDate;
    }

    /**
     * Sets a new practice date.
     * 
     * @param nextPracticeDate the new practice date.
     */
    public void setNextPracticeDate(NextPracticeDate nextPracticeDate) {
        this.nextPracticeDate = nextPracticeDate;
    }

    /**
     * Returns true if both cards have the same question.
     * This defines a weaker notion of equality between two cards.
     */
    public boolean isSameCard(Card otherCard) {
        if (otherCard == this) {
            return true;
        }

        return otherCard != null
                && otherCard.getQuestion().equals(getQuestion());
    }

    /**
     * Returns true if both cards have the same identity and data fields.
     * This defines a stronger notion of equality between two cards.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Card)) {
            return false;
        }

        Card otherCard = (Card) other;
        return question.equals(otherCard.question)
                && answer.equals(otherCard.answer);
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(question, answer);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("question", question)
                .add("answer", answer)
                .toString();
    }

    @Override
    public int compareTo(Card other) {
        return this.nextPracticeDate.compareTo(other.nextPracticeDate);
    }

    public String questiontoString() {
        return "Question: " + this.getQuestion().toString();
    }

    public String answertoString() {
        return "Answer: " + this.getAnswer().toString();
    }
}
