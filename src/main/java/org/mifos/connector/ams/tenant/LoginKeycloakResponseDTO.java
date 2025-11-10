package org.mifos.connector.ams.tenant;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mifos.connector.common.ams.dto.LoginFspResponse;

import java.util.Date;

public class LoginKeycloakResponseDTO implements LoginFspResponse {

    private String access_token;


    private int expires_in;


    private int refresh_expires_in;


    private String refresh_token;


    private String token_type;

    @JsonProperty("not-before-policy")
    private int notBeforePolicy;


    private String session_state;

    private String scope;


    @Override
    public String getAccessToken() {
        return access_token;
    }

    @Override
    public Date getAccessTokenExpiration() {
        return new Date(System.currentTimeMillis() + expires_in * 1000);
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public int getRefresh_expires_in() {
        return refresh_expires_in;
    }

    public void setRefresh_expires_in(int refresh_expires_in) {
        this.refresh_expires_in = refresh_expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public int getNotBeforePolicy() {
        return notBeforePolicy;
    }

    public void setNotBeforePolicy(int notBeforePolicy) {
        this.notBeforePolicy = notBeforePolicy;
    }

    public String getSession_state() {
        return session_state;
    }

    public void setSession_state(String session_state) {
        this.session_state = session_state;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
