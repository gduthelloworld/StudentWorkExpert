/**
 * 此文件是用于文件上传，照片上传
 *
 *
 */
/* 我之所以要写，是因为要调试后端。妈耶，服务器那个太麻烦了，路径。
     这个太麻烦了，留给师弟做。*/
/**
 * 以下是demo
 *
 */
//检查图片
function checkImage() {
    var fileName = $("#userPic").val();
    fileName = fileName.replace("C:\\fakepath\\", "");
    var flag = true;
    if (fileName == "") {
        flag = false;
        alert("请选择图片");
    } else {
        var size = $("#userPic")[0].files[0].size;
        if (size / 1000 > 1000) {
            flag = false;
            alert("图片大小不能超过1000KB");
        }
    }
    if (flag) {
        onLoadImage();
    } else {//清除input type=file的显示内容
        $("#userPic").val("");
    }
    return flag;
}

//预览图片
function onLoadImage() {
    //var file=$('#userPic').get(0).files[0];
    $filePath = URL.createObjectURL($('#userPic').get(0).files[0]);
    //这是获取到图片元素，因为我这里的页面结构是统一的，input表单的上一个元素是img，
    //所以这个地方只是为了获取你的img元素，然后设置src属性即可
    $("#onLoadImage").hide().html('<img src="' + $filePath + '" alt="" />').show();
}

/**上传图片
     详细参考链接：https://www.cnblogs.com/qiumingcheng/p/6854933.html
     1.processData设置为false。因为data值是FormData对象，不需要对数据做处理。
     2.<form>标签添加enctype="multipart/form-data"属性。
     3.cache设置为false，上传文件不需要缓存。
     4.contentType设置为false，不设置contentType值，因为是由<form>表单构造的FormData对象，
     且已经声明了属性enctype="multipart/form-data"，所以这里设置为false。
 */
function checkSubmit() {
    var formdata = new FormData();
    formdata.append('userPic', $('#userPic').get(0).files[0]);
    $.ajax({
        async: false,
        type: 'POST',
        url: "/api/userPic",
        dataType: 'json',
        data: formdata,
        contentType: false,//ajax上传图片需要添加
        processData: false,//ajax上传图片需要添加
        success: function (data) {
            if (data.code == 0) {
                $("#showImage").hide().html("<img src='http://106.52.255.37:8000/userPic/" + data.data + "'/>").show();
                console.log($("#showImage").html());
            }
            console.log(data.code + data.msg);
        },
        error: function (e) {
            alert("error");
        }
    })
}
