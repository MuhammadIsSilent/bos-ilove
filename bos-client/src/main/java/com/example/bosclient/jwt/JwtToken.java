package com.example.bosclient.jwt;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import net.minidev.json.JSONObject;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtToken {


    private static String secretValue = "mybosdockercomeexampleddockerqqwe";

    public static String creatToken(Map<String, Object> map) throws JOSEException {
        // header
        JWSHeader jwsHeader = new JWSHeader(JWSAlgorithm.HS256);

        // load
        Payload payload = new Payload(new JSONObject(map));

        // ant
        JWSObject jwsObject = new JWSObject(jwsHeader, payload);

        // 密匙
        JWSSigner jwsSigner = new MACSigner(secretValue.getBytes());

        // sin
        jwsObject.sign(jwsSigner);

        // token
        return jwsObject.serialize();
    }


    public static Map<String, Object> valid(String token) throws ParseException, JOSEException {

        Map<String, Object> map = new HashMap<>();

        // 解析token
        JWSObject jwsObject = JWSObject.parse(token);

        // 解析数据
        Payload payload = jwsObject.getPayload();

        // 密匙
        JWSVerifier jwsVerifier = new MACVerifier(secretValue.getBytes());

        // 判断token
        if (jwsObject.verify(jwsVerifier)) {
            map.put("Result", 0);
            JSONObject jsonObject = payload.toJSONObject();
            map.put("data", jsonObject);

            // 判断token是否过期
            if (jsonObject.containsKey("expTime")) {
                Long expTime = Long.valueOf(jsonObject.get("expTime").toString());
                Long nowTime = new Date().getTime();
                if (nowTime > expTime) {
                    map.clear();
                    map.put("Result", 1);
                }
            }
        } else {
            map.put("Result", 2);
        }


        return map;
    }


}
