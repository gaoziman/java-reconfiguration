package org.javatop.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-24 9:42
 * @description : 示例
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    /*编写一个演员类 有 演员id演员名称和演员年龄 演员作品 */

    private Integer id;

    private String name;

    private Integer age;

    private String works;


    
}
