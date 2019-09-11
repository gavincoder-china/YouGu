package com.yougu.mall.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;

import com.yougu.mall.util.CodeUtil;
import com.yougu.mall.util.SmsTool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("sms")
public class SmsController {

    /**
     * 发送短信
     * @param phone
     * @param
     * @return
     * @throws ClientException
     */
    @RequestMapping(value = "send",method = RequestMethod.POST)
    @ResponseBody
    public String smsXxs(String phone, HttpSession session) throws ClientException {

        System.out.println(phone);
        Map<String,String> map = new HashMap<>();
        // 验证码（指定长度的随机数）
        String code = CodeUtil.generateVerifyCode(6);
        String TemplateParam = "{\"code\":\""+code+"\"}";
        // 短信模板id
        String TemplateCode = "SMS_173950015";
        SendSmsResponse response = SmsTool.sendSms(phone, TemplateParam, TemplateCode);
        map.put("verifyCode",code);
        map.put("phone",phone);
       /* if( response.getCode().equals("OK")) {
            map.put("isOk","OK");
        }
        return map;*/
       if (response.getCode().equals("OK")){
           map.put("isOk","OK");
           //把map放到session中
           session.setAttribute("CodePhone",map);

           return "ok";
       }
       return "error";
    }

    @RequestMapping(value = "checkSms",method = RequestMethod.POST)
    @ResponseBody
    public String checkSms(String phone, String checkCode , HttpSession session){
        //获取到前端的数据,然后进行验证,成功的话就返回true

        Map<String,String> map = (Map) session.getAttribute("CodePhone");

         if(map.get("phone").equals(phone)&&map.get("verifyCode").equals(checkCode)&&map.get("isOk").equals("OK")){
             return "true";
         }

      return "error";
    }

}

