package com.yupi.springbootinit.manager;
import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.BusinessException;
import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.springframework.stereotype.Service;

@Service
public class AiManager {
String accessKey = "lsgxj4ocxysbwovcon98x9bcj6izfesd";
String secretKey = "pqvqhcpbfcuxx1antfb53i0390kuvkaj";
YuCongMingClient client = new YuCongMingClient(accessKey, secretKey);
//@Resource
//private YuCongMingClient client;
    public String doChat(long modelId, String message) {
        DevChatRequest devChatRequest = new DevChatRequest();
        devChatRequest.setModelId(modelId);
        devChatRequest.setMessage(message);
        BaseResponse<DevChatResponse> response = client.doChat(devChatRequest);
        if (response == null) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "AI 响应错误");
        } else {
//           return response.getMessage();
            return response.getData().getContent();
        }

    }

}
