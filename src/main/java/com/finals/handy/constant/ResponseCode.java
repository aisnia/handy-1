package com.finals.handy.constant;

/**
 * @author zsw
 */
public enum ResponseCode {
    /**
     * 服务器错误
     */
    SERVER_ERROR(-1),
    /**
     * 请求成功
     */
    REQUEST_SUCCEED(0),

    /**
     *参数不合法
     */
    PARAM_ILLEGAL(1),

    /**
     * 用户不存在
     */
    USER_NOT_EXIST(2),

    /**
     * 教务系统密码错误
     */
    JW_PASSWORD_ERROR(12),

    /**
     * 用户名或密码错误
     */
    PASSWORD_ERROR(3),

    /**
     * 用户未登录
     */
    NOT_LOGIN(4),

    /**
     * 用户无权限
     */
    NOT_PERMIT(5),

    /**
     * 用户尚未进行身份认证
     */
    USER_NOT_VERIFY(15),

    /**
     * 黑名单用户
     */
    USER_IS_BLACK(16),

    /**
     *token已过期
     */
    TOKEN_EXPIRE(6),

    /**
     * token错误
     */
    TOKEN_ERROR(7),

    /**
     * 手机号已被注册
     */
    PHONE_HAS_REGISTED(8),

    /**
     * 短信发送失败
     */
    SEND_MSG_ERROR(17),

    /**
     * 学号已注册
     */
    STUDENT_ID_REGISTED(13),

    /**
     * 手机号验证码错误
     */
    PHONE_CODE_ERROR(9),

    /**
     * 手机号未注册
     */
    PHONE_NOT_REGISTED(14),
    /**
     * 教务系统验证码错误
     */
    JW_CODE_ERROR(10),

    /**
     * 教务系统错误
     */
    JW_SERVER_ERROR(11),

    /**
     * 学号不存在
     */
    XH_NOT_REGESIT(18),

    /**
     * 非法请求
     */
    ILLEGAL_REQUEST(20),

    /**
     * 订单不存在
     */
    ORDER_NOT_EXIST(21),

    /**
     * 不能接取自己发布的订单
     */
    ORDER_PUBLISH_BY_ONE(22),

    /**
     * 订单已被接取，无法再次接取
     */
    ORDER_HAS_RECEIVED(23),

    /**
     * 订单删除等待接取者同意
     */
    ORDER_DELETE_PROCESSING(24),

    /**
     * 不是当前订单接取者
     */
    NOT_ORDER_RECEIVER(25),

    /**
     * 订单已完成
     */
    ORDER_HAS_FINISHED(26),

    /**
     * 账号在别处登录
     */
    USER_LOGIN_OTHER(30)
    ;

    private int value;

    ResponseCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
