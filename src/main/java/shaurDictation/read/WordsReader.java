package shaurDictation.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Vector;

import com.google.gson.Gson;

import shaurDictation.Word;

public class WordsReader {
    public static Iterable<Word> readWordsInPackage(String dir) throws IOException {
        Gson gson = new Gson();
        File directory = new File(dir);
        var result = new Vector<Word>();

        for (File wordFile : Arrays.asList(directory.listFiles())) {
            var reader = new BufferedReader(new FileReader(wordFile, StandardCharsets.UTF_8));
            String json = "";
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                } else {
                    json += line;
                }
            }
            reader.close();

            result.add(gson.fromJson(json, Word.class));
        }

        return result;
    }
}
