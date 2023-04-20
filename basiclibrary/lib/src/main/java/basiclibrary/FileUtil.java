package java.basiclibrary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class FileUtil {
    public static String lintJavaScript(Path filePath) {
        StringBuilder errors = new StringBuilder();
        String line;
        int lineNumber = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (!isValidJsLine(line)) {
                    errors.append("Line ").append(lineNumber).append(": Missing semicolon.\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return errors.toString();
    }

    private static boolean isValidJsLine(String line) {
        String trimmedLine = line.trim();
        if (trimmedLine.isEmpty()) return true;
        if (trimmedLine.endsWith("{")) return true;
        if (trimmedLine.endsWith("}")) return true;
        if (trimmedLine.endsWith(";")) return true;
        if (Pattern.compile("\\b(if|else)\\b").matcher(trimmedLine).find()) return true;

        return false;
    }
}
