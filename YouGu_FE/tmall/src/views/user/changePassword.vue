<template>
    <div>

        <h2>修改密码</h2>
        <form action="#" method="get" class="remima">
            <p><span>选择验证身份方式：</span><input type="checkbox" />密码验证  <input type="checkbox" />邮箱验证 </p>
            <p><span>原密码：</span><input type="text" /></p>
            <p class="op">输入原密码</p>
            <p><span>新密码：</span><input type="text" /></p>
            <p class="op">6-16 个字符，需使用字母、数字或符号组合，不能使用纯数字、纯字母、纯符号</p>
            <p><span>重复新密码：</span><input type="text" /></p>
            <p class="op">请再次输入密码</p>
            <p><span>验证码：</span><input type="text" /><img src="../../static/img/temp/code.jpg" alt="" /></p>
            <p class="op">按右图输入验证码，不区分大小写</p>
            <input type="submit" value="提交" />
        </form>

    </div>
</template>

<script>
    export default {
        name: "changePassword"
    }
</script>

<style scoped>

</style>