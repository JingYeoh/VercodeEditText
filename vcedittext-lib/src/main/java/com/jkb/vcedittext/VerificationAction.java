package com.jkb.vcedittext;

import android.support.annotation.ColorRes;

/**
 * 填写验证码支持的Action
 * Created by yj on 2017/5/11.
 */

public interface VerificationAction {

    /**
     * 设置位数
     */
    void setFigures(int figures);

    /**
     * 设置验证码之间的间距
     */
    void setVerCodeMargin(int margin);

    /**
     * 设置底部选中状态的颜色
     */
    void setBottomSelectedColor(@ColorRes int bottomSelectedColor);

    /**
     * 设置底部未选中状态的颜色
     */
    void setBottomNormalColor(@ColorRes int bottomNormalColor);

    /**
     * 设置选择的背景色
     */
    void setSelectedBackgroundColor(@ColorRes int selectedBackground);

    /**
     * 设置底线的高度
     */
    void setBottomLineHeight(int bottomLineHeight);

    /**
     * 设置当验证码变化时候的监听器
     */
    void setOnVerificationCodeChangedListener(OnVerificationCodeChangedListener listener);

    /**
     * 验证码变化时候的监听事件
     */
    interface OnVerificationCodeChangedListener {

        /**
         * 当验证码变化的时候
         */
        void onVerCodeChanged(CharSequence s, int start, int before, int count);

        /**
         * 输入完毕后的回调
         */
        void onInputCompleted(CharSequence s);
    }
}
