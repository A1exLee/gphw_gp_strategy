package com.alexlee.gp.strategy;

public class User {
    public static void main(String[] args) {
        //更改浏览器播放器设置，使用不同的播放器策略进行播放
        Browser browser = new Browser();
        browser.changeOption(PlayerOption.H5Option);
        browser.playVideo();
        browser.changeOption(PlayerOption.FlashOption);
        browser.playVideo();
    }
}
