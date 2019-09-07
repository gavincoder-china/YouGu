<template>
    <div >
        <h2>收货地址</h2>
        <div class="add">
            <div>
                <a href="#2" id="addxad"><img src="../../static/img/jia.png"/></a>
                <span>添加新地址</span>
            </div>
            <div id="dizhi">
                <p>六六六</p>
                <p>1573****666</p>
                <p>河北省 唐山市 路北区</p>
                <p>唐山市大学生公寓村（063000）</p>
            </div>
        </div>


        <!--编辑弹框-->
        <!--遮罩-->
        <div class="mask"></div>
        <div class="adddz">
            <form action="#" method="get">
                <input type="text" placeholder="姓名" class="on" />
                <input type="text" placeholder="手机号" />
                <div class="city">
                    <select name="">
                        <option value="省份/自治区">省份/自治区</option>
                    </select>
                    <select>
                        <option value="城市/地区">城市/地区</option>
                    </select>
                    <select>
                        <option value="区/县">区/县</option>
                    </select>
                    <select>
                        <option value="配送区域">配送区域</option>
                    </select>
                </div>
                <textarea name="" rows="" cols="" placeholder="详细地址"></textarea>
                <input type="text" placeholder="邮政编码" />
                <div class="bc">
                    <input type="button" value="保存" />
                    <input type="button" value="取消" />
                </div>
            </form>
        </div>
        <div class="readd">
            <form action="#" method="get">
                <input type="text"  class="on" value="六六六" />
                <input type="text" value="157****0022" />
                <div class="city">
                    <select name="">
                        <option value="省份/自治区">河北省</option>
                    </select>
                    <select>
                        <option value="城市/地区">唐山市</option>
                    </select>
                    <select>
                        <option value="区/县">路北区</option>
                    </select>
                    <select>
                        <option value="配送区域">火炬路</option>
                    </select>
                </div>
                <textarea name="" rows="" cols="" placeholder="详细地址">高新产业园</textarea>
                <input type="text" placeholder="邮政编码" value="063000"/>
                <div class="bc">
                    <input type="button" value="保存" />
                    <input type="button" value="取消" />
                </div>
            </form>
        </div>
    </div>
</template>

<script>
    export default {
        name: "userAddress"
    }
</script>

<style scoped>

</style>