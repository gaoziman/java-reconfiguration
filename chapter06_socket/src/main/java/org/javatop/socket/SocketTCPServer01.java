package org.javatop.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-11-02 9:44
 * @description : 服务端
 */
public class SocketTCPServer01 {

    public static void main(String[] args) throws IOException {

        /*
            * 1. 在本机的8888端口监听, 等待连接
            * 细节: 要求在本机没有其它服务在监听9999
            * 细节：这个 ServerSocket 可以通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
        */

        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端，在8888端口监听，等待连接..");
        //2. 当没有客户端连接9999端口时，程序会 阻塞, 等待连接
        //如果有客户端连接，则会返回Socket对象，程序继续

        Socket socket = serverSocket.accept();

        System.out.println("服务端 socket ="+socket.getClass());
        //
        //3. 通过socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
        InputStream is = socket.getInputStream();
        //4. 通过IO流读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while((readLen = is.read(buf))!=-1){
            //根据读取到的实际长度，显示内容.
            System.out.println(new String(buf, 0, readLen));
        }
        //5.关闭流和socket
        is.close();
        socket.close();
        serverSocket.close();//关闭
    }

}