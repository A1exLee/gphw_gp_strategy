package com.alexlee.gp.strategy;

/**
 * 播放器选项
 */
public enum PlayerOption {
    H5Option("H5"), FlashOption("Flash");
    private String type;

    private PlayerOption(String type) {
        this.type = type;
    }


}
