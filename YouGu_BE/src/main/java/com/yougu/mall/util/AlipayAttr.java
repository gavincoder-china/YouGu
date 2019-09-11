package com.yougu.mall.util;

public class AlipayAttr {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101300679629";

    // 商户应用私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCKYyK8qQW6e4FtVC30+oO5UzP943/2UkLUETfqCMExvei3YjrVcqVGQNjx+MHfabBbX72Zucv9s7UoT5WF1NXHsXd7/yvK0rwso3sg/dQwzl+Ly6rIMU5ZtGmDQQFDV7iBhOZZpO+80fLyWl905eawrhCbt/PLbtcs/a//rNCvFauQTbPxwjFfN1mqNApXhot6iQW70dLsvZJWJZxmRFuohk9rn7WWYPfXRzCZNLBIq0JYb1QCSaBPcVrF/yzhbvn65sozXVdwG8Z8z8+nqtBDiX4yACRwOfS4QRTXdFpwwOC/gRlwLL7evTzmv5ZHMVB1jVf6CNIoy9yScD/DZv5FAgMBAAECggEARrk1Zn9nCw/VbF9KAVoJ+at49bbPjb4qoyCNl9CTk20/woC0GqO1rXq0pK0Bv8DOvVPnnOmkQ+sUmR5bBwNnod+jdb5JziT2wEVoRssSJ0NA9zvF8vun1BZsmgSdtaHeDGs0Ifo1/yS46XygLijURdUfbcWMFZp242pfCOZz3BYPD3rsbCQgakd1N4pUXHc4w7ihXFpoCubxQiI7IqrCAUk1VcC2GOaq1p9Km4K/aT6P7q1Nj2Q2485l4VeV+tkWXI/T/nUTEi7ljaxe4A/af9xyzmTllExazcXo0+Ng86OYzj3UNlKyeCAW9Nu8RPrea0w+Glra4C5ZrcAE5mqV4QKBgQDd9LXaDZ52W4YzLVeWDIOU3ME9c6P3TLFEqphqVG8MNhO7jG+2dpBj2kEPD3SI5EMItKkuejRua1KaWgJ48Vg7xH8SftHjmiOSiy07raRl4a0lNbH9yrs7smPX1sJeFLc6gtw2Kmysa+XWFpu+UZtmYfjbOI7gRhHjNGvTVlqafQKBgQCfnQe+UitqX6KhutB0dIDJe4j18ZTRp+XfCBA5YKUhAWhqMVaYyjffcRKQpsryanvcE0BDYZ98DA38BPFrNStVLA/r4HiECa9ZH+atKnx4lfs8sOHxl5uDvWg2oydlp5qKqx3k+cxyw6iIH5KMqKlXPufEQU4AUuBMkomNFTT1aQKBgENEZNC/C+Vm+5cLCN5q0H4PIWmUYH8UeS0MXsDq8fTLdtOCTmEIMd5xSQJddr3+H+rFhfiWBMnqMNCistkgm9MRTEm4sbe/AUTqdTz+9TIDYUxDp7v48yG2gNfrOGD2+kj7W+32kZT35mIp2+2kIeq3ioo16+dAlS88tekI5NCpAoGAdeTP7mTVCpofDuRkyk+vPKMRk8/fw0gHg0h6a1cWQR3AGQfeVbavtEvZkZyRNKMwX2qcwehem4pv3eFszGoWWq/UBr7jZWud5++nO+qwy4TEcJyaFw+LX7BMRGcYV36HqLshtppHx9D7L6haX6jIg9fD6vLtgVG1uPlXviyW1FkCgYEAoJOxElV8PdoNH3PCwmxyeMYzk7XJ6l7J7Z0VobqQG5yxQabawUh/B4gCBJ6tMBTOBsaCbVTxDgxPtdTqJYJo6sePErWQTY7j3LVNPE1mM6//ABklGIwGMwvqakMuj7U0RTEClB1aQ0njTVx5MHvddpwYJ6haC53ZvNz46LldQ6I=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
    // 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxtCOcqZF+8hGajUbaRknXxl6aV+XL2CVlbFrqu9V62SpAgv3/RisKiQnf3LntdlhJUnv0LtHPiecnVUMrNzmA7GEBAG7PRunvEsnXxhvppoMyiKBZjW4cx2u/Me1/J7Pn1irQBDLNlhEH4qbjUo/DdWY+xpCA6TiDkvuIfozTP6qCkCvM/Cg076Ly//ykSw3AJylN4NUX9W3cp9enhbadXiCw6hFbGkQprdIQwN3/VMB+ErDO5uCcfKWjiQr3z0QobF+g4QHQAPjeqn56ftB4HVOEw8AqX+ajWhuBEL6unVfIvEG8GT4BilaTSOLp6WFFIrqvEirbEa3A4QUtIPgLwIDAQAB";

    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:9999/Alipay/notify_url";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    public static String return_url = "http://localhost:9999/Alipay/alipay_return";
    public static String return_url = "http://localhost:5500/ok.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}
