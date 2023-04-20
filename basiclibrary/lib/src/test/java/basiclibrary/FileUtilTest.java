package java.basiclibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.basiclibrary.FileUtil;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileUtilTest {
    private FileUtil fileUtil;

    @BeforeEach
    void setUp() {
        fileUtil = new FileUtil();
    }

    @Test
    void testLintJavaScript_noErrors() throws IOException {
        // Create a temporary file for testing
        Path tempFile = Files.createTempFile("noErrors", ".js");
        Files.writeString(tempFile, "function test() {\n" +
                "    console.log('Hello, world!');\n" +
                "}\n");

        String lintErrors = fileUtil.lintJavaScript(tempFile);
        assertEquals("", lintErrors);
    }

    // Add other test methods for the remaining cases
}
