<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>常春藤阅读</title>
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="${request.contextPath}/webjars/bootstrapvalidator/0.5.3/css/bootstrapValidator.min.css">
</head>
<body>
<div class="container">
    <form role="form" id="signInForm" action="${request.contextPath}/signInUser"  method="POST">
        <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}">
        <div class="form-group">
            <label for="username">姓名</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="请输入姓名">
        </div>
        <div class="form-group">
            <label for="loginname">登陆账号</label>
            <input type="text" class="form-control" id="loginname" name="loginname" placeholder="请输入账号">
        </div>
        <div class="form-group">
            <label for="password">登录密码</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码" title="两次密码输入不一致">
        </div>
        <div class="form-group">
            <label for="repassword">确认密码</label>
            <input type="password" class="form-control" id="repassword" name="repassword" placeholder="请输入密码" title="两次密码输入不一致">
        </div>
        <div class="form-group">
            <label for="phone">手机号</label>
            <input type="tel" class="form-control" id="phone" name="phone" placeholder="请输入手机号码" >
        </div>
        <input type="submit" class="btn btn-default btn-primary btn-lg btn-block" id="submit" value="注册" disabled/>
    </form>
</div>
</body>
<script src="${request.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="${request.contextPath}/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script src="${request.contextPath}/webjars/bootstrapvalidator/0.5.3/js/bootstrapValidator.min.js"></script>
<script>
    // $("#btnShow").attr({"disabled":"disabled"});
    // $("#btnShow").removeAttr("disabled");
    $(document).ready(function() {
        /**
         * 下面是进行插件初始化
         * 你只需传入相应的键值对
         * */
        $('#signInForm').bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {/*输入框不同状态，显示图片的样式*/
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {/*验证*/
                username: {/*键名username和input name值对应*/
                    message: 'The username is not valid',
                    validators: {
                        notEmpty: {/*非空提示*/
                            message: '姓名不能为空'
                        },
                        stringLength: {/*长度提示*/
                            min: 1,
                            max: 30,
                            message: '用户名长度必须在1到30之间'
                        }/*最后一个没有逗号*/
                    }
                },
                loginname: {
                    message: 'The username is not valid',
                    validators: {
                        notEmpty: {/*非空提示*/
                            message: '登陆账号不能为空'
                        },
                        stringLength: {/*长度提示*/
                            min: 6,
                            max: 30,
                            message: '用户名长度必须在6到30之间'
                        }/*最后一个没有逗号*/
                    }
                },
                password: {
                    message:'密码无效',
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                        identical: {//相同
                            field: 'repassword', //需要进行比较的input name值
                            message: '两次密码不一致'
                        },
                        stringLength: {
                            min: 6,
                            max: 30,
                            message: '密码长度必须在6到30之间'
                        }
                    }
                },
                repassword: {
                    message:'密码无效',
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                        identical: {//相同
                            field: 'password', //需要进行比较的input name值
                            message: '两次密码不一致'
                        },
                        stringLength: {
                            min: 6,
                            max: 30,
                            message: '密码长度必须在6到30之间'
                        }
                    }
                },
                email: {
                    validators: {
                        notEmpty: {
                            message: 'The email address is required and can\'t be empty'
                        },
                        emailAddress: {
                            message: 'The input is not a valid email address'
                        }
                    }
                }
            }
        });
    });
</script>
</html>