## CircleProgressView
圆形进度条

## 效果图
![](https://github.com/WernerZeiss/CircleProgressView/blob/master/screenshot/GIF.gif)

## 特点
* 可设置圆形或者弧形，以及自定义弧形长度
* 可设置文字是否显示，以及显示的样式（百分比样式或者实际数据样式，见效果图）
* 所有组件颜色均可自定义，弧形颜色可设置渐变色

## 属性列表

属性名|属性介绍
-------|--------
circle_process_stroke_width|弧形宽度
circle_process_stroke_color|弧形背景颜色
circle_process_progress_color|弧形进度条颜色
circle_process_text_color|文字颜色
circle_process_text_size|文字大小
circle_process_duration|动画时间
circle_precess_if_show_text|是否显示中间文字

## 方法列表

方法名|方法介绍
----------|--------
start(float maxNum, float curNum)|开始动画
setRoundWidth(int width)|设置描边宽度
setDuration(long duration)|设置动画执行时间
setCircleColor(int color)|设置外圈大圆颜色
setProgressColor(int color)|设置进度条颜色
setTextColor(int color)|设置文字颜色
isShowText(boolean b)|是否显示文字
setGradientColors(int... colors)|设置进度条渐变色
setSweepAngle(float angle)|设置进度圆圆弧范围（180,360]
isShowAsPercent(boolean b)|文字是否以百分比形式显示，默认是

