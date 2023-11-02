package org.javatop.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-02 9:44
 * @description : 客户端
 */
public class SocketTCPClent01 {

    public static void main(String[] args) throws IOException {
        /*
         *  1. 连接服务端 (ip , 端口）
         *  连接本机的 8888端口, 如果连接成功，返回Socket对象
         */

        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("客户端 socket返回=" + socket.getClass());

        //2. 连接上之后，生成Socket, 通过socket.getOutputStream()
        // 得到 和 socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3. 通过输出流，写入数据到 数据通道
        outputStream.write("hello, SocketTCPServer01,我是客户端，这是我给你发的一条信息".getBytes());
        //4. 关闭流对象和socket, 必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出.....");

    }
}
