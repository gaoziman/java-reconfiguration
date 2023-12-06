package org.javatop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-12-04 18:49
 * @description :
 */
public class View {

    public static void main(String[] args) {
        // 链接地址
        String url = "https://gaoziman.blog.csdn.net/article/details/134757110";

        // 创建定时任务
        Timer timer = new Timer();

        // 在半小时内，每隔3到5分钟随机访问一次链接
        int halfHour = 180 * 60 * 1000; // 半小时对应的毫秒数
        int minInterval = 2 * 45 * 1000; // 3分钟对应的毫秒数
        int maxInterval = 3 * 40 * 1000; // 5分钟对应的毫秒数
        // 生成随机等待时间
        int randomInterval = new Random().nextInt(maxInterval - minInterval + 1) + minInterval;

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // 获取当前时间
                LocalDateTime currentTime = LocalDateTime.now();
                // 格式化时间为字符串
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedTime = currentTime.format(formatter);
                try {
                    // 创建URL对象2
                    URL obj = new URL(url);
                    // 打开连接
                    HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
                    // 设置请求方法
                    connection.setRequestMethod("GET");
                    // 获取响应码
                    int responseCode = connection.getResponseCode();
                    System.out.println(formattedTime + " - 响应状态码：" + responseCode + " - 时间戳：" + System.currentTimeMillis()/1000);
                    // 读取响应内容
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        // 使用已经计算好的初始延迟和周期时间
        long initialDelay = 0;
        long period = Math.max(randomInterval, 1); // 保证周期不为非正值

        timer.scheduleAtFixedRate(task, initialDelay, period);

        // 等待半小时后取消定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timer.cancel();
            }
        }, halfHour);
    }
}