package com.example.hotpatchdemo;

public class Cat {
    public String say() {
        // 改了这里后， 经jar -> dex 打包，共HotPatchApplication使用
        return " 还是汪汪汪！ " ;
    }
}
