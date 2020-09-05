package com.eliteams.quick4j.test.dao;

import java.io.*;

public class Test10 {
    public static void main(String[] args) throws IOException {

        String filePath  ="C:\\Users\\Administrator\\Desktop\\2017南章党流量、水位时间序列文件.dfs0";
        InputStream in = null;
        BufferedInputStream buffer = null;
        DataInputStream dataIn = null;
        ByteArrayOutputStream bos = null;
        DataOutputStream dos = null;
        byte[] bArray = null;
        try {
            in = new FileInputStream(filePath);
            buffer = new BufferedInputStream(in);
            dataIn = new DataInputStream(buffer);
            bos = new ByteArrayOutputStream();
            dos = new DataOutputStream(bos);
            byte[] buf = new byte[1024];
            while (true) {
                int len = dataIn.read(buf);
                if (len < 0)
                    break;
                dos.write(buf, 0, len);
            }
            bArray = bos.toByteArray();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();


        } finally {

            if (in != null)
                in.close();
            if (dataIn != null)
                dataIn.close();
            if (buffer != null)
                buffer.close();
            if (bos != null)
                bos.close();
            if (dos != null)
                dos.close();
            for (Byte a :bArray
                 ) {
                System.out.println(a);
            };
        }


    }

    }
