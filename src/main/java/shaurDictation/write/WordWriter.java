package shaurDictation.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;

import shaurDictation.Word;

public class WordWriter {
    private final Gson gson = new Gson();

    public void writeWord(Word word) throws IOException {
        String json = gson.toJson(word);

        String sep = File.separator;
        File file = new File("src" + sep + "main" + sep + "data" + sep + word.getCorrect() + ".json");
        file.createNewFile();
        FileOutputStream fileOut = new FileOutputStream(file, false);
        OutputStreamWriter fileWriter = new OutputStreamWriter(fileOut, StandardCharsets.UTF_8);

        fileWriter.write(json);
        fileWriter.close();
    }
}
