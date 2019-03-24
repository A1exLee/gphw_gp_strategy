package com.alexlee.gp.strategy;

/**
 * 浏览器
 */
public class Browser {
    /**
     * 默认使用flash播放器
     */
    private PlayerOption playerOption = PlayerOption.FlashOption;

    /**
     * 更改设置
     *
     * @param option
     */
    public void changeOption(PlayerOption option) {
        this.playerOption = option;
    }

    public void playVideo() {
        switch (playerOption) {
            case H5Option:
                new H5Player().play();
                break;
            case FlashOption:
                new FlashPlayer().play();
                break;
            default:
                System.out.println("不支持");
                break;
        }
    }

}
