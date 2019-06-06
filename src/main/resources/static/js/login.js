/**
 登陆操作的js（江鑫）
 */

/**
 * 代办事项：
 * 1.输入错误后显示提醒，需要刷新验证码，（完成）
 * 2.按下提交按钮时，需要把提醒清除。
 * 3.绑定回车键，按下回车会实现提交(完成)
 */
function login() {      //登陆操作
    var id = $("#id").val().trim();
    var pwd = $("#pwd").val().trim();
    var code = $("#code").val().trim();
    if (check()) {
        $.ajax({
            type: "post",
            url: "/loginCheck",
            data: {
                "id": id,
                "pwd": pwd,
                "code": code
            },
            success: function (data) {
                if (data.code == 1) {
                    setCookie(id,pwd);
                    /*管理员登陆界面，后续再判断修改*/
                    window.location.href = "/admin/index";
                } else {
                    /*输入错误刷新验证码*/
                    /*两种版本都可以；*/
                    //$("#verCode").attr("src","/verCode" + "?" + Math.random());
                    $('#verCode').click();
                    $("#code").val("").focus();
                    /*管理员登陆，不暴露链接*/
                    if (data.code == 88) {
                        setCookie(id,pwd);
                        //console.log(data.msg);
                        window.location.href = data.msg;
                        return;
                    }
                    sys_msg(data.msg, "error");
                }
                console.log(data);
            },
            timeout: 6000,
            error: function () {
                sys_msg("出现问题了~请联系管理员", "error");
            }
        })
    }
};

/**
 * 系统调用通知函数
 * @param data
 */
function sys_msg(data, type) {
    if (type == "error") {
        var sys_msg = '<div id="myAlert" class="alert alert-danger"><a href="#" class="close" data-dismiss="alert">&times;</a><strong>登陆失败！</strong>' + data + '！</div>';
    }
    if (type == "success") {
        var sys_msg = '<div id="myAlert" class="alert alert-success"><a href="#" class="close" data-dismiss="alert">&times;</a><strong>成功操作！</strong>' + data + '！</div>';
    }
    $(".sys_msg").hide().html(sys_msg).show(1500);
}

/*这个部分原本是打算，用随机古诗可以替代Hello world下面那个*/
function ask_gushi() {    //请求古诗
    $.ajax({
        type: "get",
        url: "https://api.apiopen.top/recommendPoetry",
        data: {},
        success: function (data) {
            console.log(data);
            var it = data.result;
            //console.log(data.result.content);
            $("#gushi").text(data.result.content + "——" + data.result.authors + "《" + data.result.title + "》");
        }
    })
};

/**
 * 检查输入框
 * @returns {boolean}
 */
function check() {
    if ($("#id").val().trim() == '') {
        sys_msg("请输入ID！", "error");
        return false;
    }
    if ($("#pwd").val().trim() == '') {
        sys_msg("请输入密码！", "error");
        return false;
    }
    if ($("#code").val().trim() == '') {
        sys_msg("请输入验证码！", "error");
        return false;
    }
    if (isNaN($("#id").val().trim())) {
        sys_msg("学号/账号必须为数字！", "error");
        return false;
    }
    return true;
};

/**
 * 设置cookie
 * @param id
 * @param pwd
 */
function setCookie(id,pwd) {
        if ($('#remember_me').is(':checked')) {     //检查cookies
            $.cookie('username', id, {
                expires: 30
            });
            $.cookie('password', pwd, {
                expires: 30
            });
            $.cookie('bit', 'true', {
                expires: 30
            });
        } else {
            $.removeCookie('username');
            $.removeCookie('password');
            $.removeCookie('bit');
        }
};



