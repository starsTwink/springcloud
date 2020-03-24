package com.ghx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //不用写Getter,Setter,equals,canEqual,hasCode,toString等方法了
@AllArgsConstructor  //使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor   //使用后创建一个无参构造函数
public class Payment {
    private Long id;
    private  String serial;
}
