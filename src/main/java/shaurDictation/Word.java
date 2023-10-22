package shaurDictation;

public class Word {
    private String correct;
    private String transcription;

    public String getCorrect() {
        return this.correct;
    }

    public Word(String correct, String transcription) {
        this.correct = correct;
        this.transcription = transcription;
    }

    public String getTranscription() {
        return this.transcription;
    }

    @Override
    public String toString() {
        return "Word(" + getCorrect() + ", " + getTranscription() + ")";
    }
}
