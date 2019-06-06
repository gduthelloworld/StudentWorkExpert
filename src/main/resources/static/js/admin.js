/*
管理员页面
 */
var ajax={
    search:{
        /**
         * 根据学号获取学生的详细信息
         */
        stuDetail:function () {
            $.ajax({
                type: "get",
                url: "/api/studentDetail",
                data: {
                    "stuId": 3116001372,
                },
                success: function (data) {
                    console.log(data);
                }
            })
        }
    }
}





/**
 * 代码实例，请注意写js的时候分块分区。
 * @type {{hello: user.hello, second: {book: user.second.book}, bye: user.bye}}
 */
/**
 user.hello();
 user.bye();
 user.second.book();
 */
var user={
    second: {
        book:function () {
            console.log("book");
        }
    },
    hello:function () {
        console.log("hello");
    },
    bye:function () {
        console.log("bye");
    }
}
