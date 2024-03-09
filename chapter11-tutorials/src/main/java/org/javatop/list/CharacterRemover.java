package org.javatop.list;

public class CharacterRemover {

    public static void main(String[] args) {
        // 测试函数
        String src = "Hello, World!";
        String dest = "lo";
        
        String result = removeCharacters(src, dest);
        
        System.out.println(result);  // 应该输出：He, Wr!
    }
    
    /**
     * 从src字符串中删除所有在dest字符串出现的字符。
     *
     * @param src 源字符串
     * @param dest 目标字符集合
     * @return 删除特定字符后的新串
     */
    public static String removeCharacters(String src, String dest) {
        if (src == null || dest == null) {
            return src;
        }

        StringBuilder result = new StringBuilder();
        
        for (char ch : src.toCharArray()) {
            if (dest.indexOf(ch) == -1) {  // 如果当前字符不在dest中，则添加到结果串中
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}