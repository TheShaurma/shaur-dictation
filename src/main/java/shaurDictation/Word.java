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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Word)) {
            return false;
        } else {
            var other = (Word) o;
            return getCorrect().equals(other.getCorrect()) && getTranscription().equals(other.getTranscription());
        }
    }

    @Override
    public int hashCode() {
        return (getCorrect() + getTranscription()).hashCode();
    }
}
