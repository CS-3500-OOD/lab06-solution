package cs3500.lab06.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSON format of this record:
 * <p>
 * <code>
 * {
 *   "guess": 20
 * }
 * </code>
 * </p>
 *
 * @param guess the player's guess
 */
public record PlayerGuessJson(
    @JsonProperty("guess") int guess) {
}
