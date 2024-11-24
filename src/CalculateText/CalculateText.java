package CalculateText;

public class CalculateText {

    private int totalCharacterCount;
    private int totalLineCount;

    public CalculateText() {
        this.totalCharacterCount = 0;
        this.totalLineCount = 0;
    }

    public void addCharacters(String input) {
        String withoutSpaces = input.replaceAll("\\s", "");
        totalCharacterCount += withoutSpaces.length();
        totalLineCount++;
    }

    public int getTotalCharacterCount() {
        return totalCharacterCount;
    }

    public int getTotalLineCount() {
        return totalLineCount;
    }
}
