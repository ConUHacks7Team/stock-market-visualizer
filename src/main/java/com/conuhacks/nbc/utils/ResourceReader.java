package com.conuhacks.nbc.utils;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ResourceReader {

    public List<String> getJsonFileListInDirectory(String path) throws IOException {
        return Arrays.stream(Objects.requireNonNull(
                new File(this.getClass()
                        .getClassLoader()
                        .getResource(path)
                        .getFile()).list())).filter(file -> file.endsWith(".json")).toList();
    }

    public String readJsonResource(String path) throws IOException {
        File file = new File(this.getClass()
                .getClassLoader()
                .getResource(path)
                .getFile());
        byte[] byteContent = Files.toByteArray(file);
        return new String(byteContent);
    }

}
