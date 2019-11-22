package java8.lambda;

import java.io.File;
import java.io.FileFilter;

public class

FirstLambda implements FileFilter {

    //old way
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
    }

    public static void main(String[] args) {
        FirstLambda firstLambda = new FirstLambda();

//        FileFilter firstLambda = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };

//        FileFilter firstLambda = (File pathname) -> pathname.getName().endsWith(".java");


        File dir = new File("E:\\workspace\\java8\\sampleprograms\\src\\main\\java\\algorithms");
        File[] dirList = dir.listFiles(firstLambda);

        for(File file : dirList){
            System.out.println(file);
        }
    }
}
