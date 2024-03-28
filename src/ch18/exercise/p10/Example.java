package ch18.exercise.p10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws Exception {

        // todo : 바이트 기반스트림(OutputStreamWriter) 과 성능향상 보조 스트림(BufferedOuputStream) 을 반드시사용

        // 3. 복사 경로 디렉토리 x -> 디렉토리 자동 생성

        String originalFile = "temp/dir1/photo1.jpeg";
        String targetFile = "temp/dir2/photo2.jpeg";

        File file1 = new File(originalFile);
        File file2 = new File(targetFile);

        if (!file2.exists()) { // targetFile 파일 없을 시
            file2.getParentFile().mkdirs();
        }

        if (file1.exists()) { // 원본 파일 체크
            // 존재 o -> 1. 복사 작업,
            //          2. "복사가 성공되었습니다." 출력
            InputStream is = new FileInputStream(file1);
            BufferedInputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(file2);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            if (!file2.exists()) { // target 파일 없을 시
                file2.getParentFile().mkdirs();
            }
            int len = 0;
            byte[] data = new byte[10];
            while ((len = bis.read(data)) != -1) {
                bos.write(data, 0, len);
            }
            bis.close();
            bos.close();
            System.out.println("복사가 성공되었습니다.");
        } else {
            // 존재 x -> "원본 파일이 존재하지 않습니다." 출력
            System.out.println("원본 파일이 존재하지 않습니다.");
        }

    }
}
