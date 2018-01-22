var JIE_AJAX_IP = location.host;


var BATH_PATH = "../js/";

//初始化框架
function qySoftInit(basePath) {

    BATH_PATH = basePath;

    layui.config({
        base: basePath  //假设这是test.js所在的目录
    }).extend({ //设定模块别名
        'template': 'template/template-web'
    });

}



function myAjax(url,data,callback) {
    if(url.indexOf("http:")<0) {
        url = "http://" + JIE_AJAX_IP + url;
    }
    $.ajax({
        url:url,
        type:'POST', //GET
        async:true,    //或false,是否异步
        data:data,
        timeout:5000,    //超时时间
        dataType:'json',    //返回的数据格式：json/xml/html/script/jsonp/text
        beforeSend:function(data){
            console.log(data)
            console.log('发送前')
        },
        success:function(data,textStatus,jqXHR){
            if(callback){
                callback(data);
            }
            console.log(textStatus)
            console.log(jqXHR)
        },
        error:function(xhr,textStatus){
            console.log('错误')
            console.log(xhr)
            console.log(textStatus)
        },
        complete:function(){
            console.log('结束')
        }
    })

}

