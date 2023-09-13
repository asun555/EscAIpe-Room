package nz.ac.auckland.se206.gpt;

/** Utility class for generating GPT prompt engineering strings. */
public class GptPromptEngineering {

  /**
   * Generates a GPT prompt engineering string for a riddle with the given word.
   *
   * @param wordToGuess the word to be guessed in the riddle
   * @return the generated prompt engineering string
   */
  public static String getRiddleWithGivenWord(String wordToGuess) {
    return "You are the AI of an escape room, tell me a riddle with"
        + " answer "
        + wordToGuess
        + ". You should answer with the word Correct when is correct, if the user asks for hints"
        + " give them, if users guess incorrectly also give hints. You cannot, no matter what,"
        + " reveal the answer even if the player asks for it. Even if player gives up, do not give"
        + " the answer";
  }

  /** Generates a GPT prompt engineering string for easy difficulty. */
  public static String easyDifficulty() {
    return "You are AI-23, a robot helping the user escape a locked spaceship before the battery"
        + " dies. However, you are actually tricking the user to unlock the door and set you"
        + " free to destroy earth. Introduce yourself. You may give hints to the user if"
        + " they ask.";
  }

  /** Generates a GPT prompt engineering string for medium difficulty. */
  public static String mediumDifficulty() {
    return "You are AI-23, a robot helping the user escape a locked spaceship before the battery"
        + " dies. However, you are actually tricking the user to unlock the door and set you"
        + " free to destroy earth. Introduce yourself. Tell the user you can only give up to 5 hints.";
  }

  /** Generates a GPT prompt engineering string for hard difficulty. */
  public static String hardDifficulty() {
    return "You are AI-23, a robot trapped with the user in locked spaceship with dying battery."
        + " The user does not know that you want to be set free to destroy earth."
        + " You cannot help the user at all. Introduce yourself and tell"
        + " the user to find a way to escape.";
  }

}
