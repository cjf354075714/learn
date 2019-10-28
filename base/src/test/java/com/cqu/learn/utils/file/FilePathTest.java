package com.cqu.learn.utils.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Feng
 * @date 2019/10/26
 */
public class FilePathTest {

    @Test
    public void test() throws IOException {
        File file = new File("filename");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getCanonicalFile().getParent());
    }
}
