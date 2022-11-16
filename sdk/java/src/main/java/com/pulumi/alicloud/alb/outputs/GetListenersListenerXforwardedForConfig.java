// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenersListenerXforwardedForConfig {
    /**
     * @return The Custom Header Field Names Only When `xforwardedforclientcert_issuerdnenabled`, Which Evaluates to True When the Entry into Force of.
     * 
     */
    private final String xforwardedforclientcertIssuerdnalias;
    /**
     * @return Indicates Whether the `X-Forwarded-Clientcert-issuerdn` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate after the Manifests Are Signed, the Publisher Information.
     * 
     */
    private final Boolean xforwardedforclientcertIssuerdnenabled;
    /**
     * @return The Custom Header Field Names Only When `xforwardedforclientcertclientverifyenabled` Has a Value of True, this Value Will Not Take Effect until.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    private final String xforwardedforclientcertclientverifyalias;
    /**
     * @return Indicates Whether the `X-Forwarded-Clientcert-clientverify` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate to Verify the Results.
     * 
     */
    private final Boolean xforwardedforclientcertclientverifyenabled;
    /**
     * @return The Custom Header Field Names Only When `xforwardedforclientcertfingerprintenabled`, Which Evaluates to True When the Entry into Force of.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    private final String xforwardedforclientcertfingerprintalias;
    /**
     * @return Indicates Whether the `X-Forwarded-Clientcert-fingerprint` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate Fingerprint Value.
     * 
     */
    private final Boolean xforwardedforclientcertfingerprintenabled;
    /**
     * @return The name of the custom header. This parameter is valid only if `xforwardedforclientcertsubjectdnenabled` is set to true. The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    private final String xforwardedforclientcertsubjectdnalias;
    /**
     * @return Specifies whether to use the `X-Forwarded-Clientcert-subjectdn` header field to obtain information about the owner of the ALB client certificate. Valid values: true and false. Default value: false.
     * 
     */
    private final Boolean xforwardedforclientcertsubjectdnenabled;
    /**
     * @return Indicates Whether the X-Forwarded-Client-Port Header Field Is Used to Obtain Access to Server Load Balancer Instances to the Client, and Those of the Ports.
     * 
     */
    private final Boolean xforwardedforclientsrcportenabled;
    /**
     * @return Indicates whether the X-Forwarded-For header field is used to obtain the real IP address of tqhe client. Valid values: true and false. Default value: true.
     * 
     */
    private final Boolean xforwardedforenabled;
    /**
     * @return Indicates Whether the X-Forwarded-Proto Header Field Is Used to Obtain the Server Load Balancer Instance Snooping Protocols.
     * 
     */
    private final Boolean xforwardedforprotoenabled;
    /**
     * @return Indicates whether the SLB-ID header field is used to obtain the ID of the ALB instance. Valid values: true and false. Default value: false.
     * 
     */
    private final Boolean xforwardedforslbidenabled;
    /**
     * @return Indicates Whether the X-Forwarded-Port Header Field Is Used to Obtain the Server Load Balancer Instance Listening Port.
     * 
     */
    private final Boolean xforwardedforslbportenabled;

    @CustomType.Constructor
    private GetListenersListenerXforwardedForConfig(
        @CustomType.Parameter("xforwardedforclientcertIssuerdnalias") String xforwardedforclientcertIssuerdnalias,
        @CustomType.Parameter("xforwardedforclientcertIssuerdnenabled") Boolean xforwardedforclientcertIssuerdnenabled,
        @CustomType.Parameter("xforwardedforclientcertclientverifyalias") String xforwardedforclientcertclientverifyalias,
        @CustomType.Parameter("xforwardedforclientcertclientverifyenabled") Boolean xforwardedforclientcertclientverifyenabled,
        @CustomType.Parameter("xforwardedforclientcertfingerprintalias") String xforwardedforclientcertfingerprintalias,
        @CustomType.Parameter("xforwardedforclientcertfingerprintenabled") Boolean xforwardedforclientcertfingerprintenabled,
        @CustomType.Parameter("xforwardedforclientcertsubjectdnalias") String xforwardedforclientcertsubjectdnalias,
        @CustomType.Parameter("xforwardedforclientcertsubjectdnenabled") Boolean xforwardedforclientcertsubjectdnenabled,
        @CustomType.Parameter("xforwardedforclientsrcportenabled") Boolean xforwardedforclientsrcportenabled,
        @CustomType.Parameter("xforwardedforenabled") Boolean xforwardedforenabled,
        @CustomType.Parameter("xforwardedforprotoenabled") Boolean xforwardedforprotoenabled,
        @CustomType.Parameter("xforwardedforslbidenabled") Boolean xforwardedforslbidenabled,
        @CustomType.Parameter("xforwardedforslbportenabled") Boolean xforwardedforslbportenabled) {
        this.xforwardedforclientcertIssuerdnalias = xforwardedforclientcertIssuerdnalias;
        this.xforwardedforclientcertIssuerdnenabled = xforwardedforclientcertIssuerdnenabled;
        this.xforwardedforclientcertclientverifyalias = xforwardedforclientcertclientverifyalias;
        this.xforwardedforclientcertclientverifyenabled = xforwardedforclientcertclientverifyenabled;
        this.xforwardedforclientcertfingerprintalias = xforwardedforclientcertfingerprintalias;
        this.xforwardedforclientcertfingerprintenabled = xforwardedforclientcertfingerprintenabled;
        this.xforwardedforclientcertsubjectdnalias = xforwardedforclientcertsubjectdnalias;
        this.xforwardedforclientcertsubjectdnenabled = xforwardedforclientcertsubjectdnenabled;
        this.xforwardedforclientsrcportenabled = xforwardedforclientsrcportenabled;
        this.xforwardedforenabled = xforwardedforenabled;
        this.xforwardedforprotoenabled = xforwardedforprotoenabled;
        this.xforwardedforslbidenabled = xforwardedforslbidenabled;
        this.xforwardedforslbportenabled = xforwardedforslbportenabled;
    }

    /**
     * @return The Custom Header Field Names Only When `xforwardedforclientcert_issuerdnenabled`, Which Evaluates to True When the Entry into Force of.
     * 
     */
    public String xforwardedforclientcertIssuerdnalias() {
        return this.xforwardedforclientcertIssuerdnalias;
    }
    /**
     * @return Indicates Whether the `X-Forwarded-Clientcert-issuerdn` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate after the Manifests Are Signed, the Publisher Information.
     * 
     */
    public Boolean xforwardedforclientcertIssuerdnenabled() {
        return this.xforwardedforclientcertIssuerdnenabled;
    }
    /**
     * @return The Custom Header Field Names Only When `xforwardedforclientcertclientverifyenabled` Has a Value of True, this Value Will Not Take Effect until.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    public String xforwardedforclientcertclientverifyalias() {
        return this.xforwardedforclientcertclientverifyalias;
    }
    /**
     * @return Indicates Whether the `X-Forwarded-Clientcert-clientverify` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate to Verify the Results.
     * 
     */
    public Boolean xforwardedforclientcertclientverifyenabled() {
        return this.xforwardedforclientcertclientverifyenabled;
    }
    /**
     * @return The Custom Header Field Names Only When `xforwardedforclientcertfingerprintenabled`, Which Evaluates to True When the Entry into Force of.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    public String xforwardedforclientcertfingerprintalias() {
        return this.xforwardedforclientcertfingerprintalias;
    }
    /**
     * @return Indicates Whether the `X-Forwarded-Clientcert-fingerprint` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate Fingerprint Value.
     * 
     */
    public Boolean xforwardedforclientcertfingerprintenabled() {
        return this.xforwardedforclientcertfingerprintenabled;
    }
    /**
     * @return The name of the custom header. This parameter is valid only if `xforwardedforclientcertsubjectdnenabled` is set to true. The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
     * 
     */
    public String xforwardedforclientcertsubjectdnalias() {
        return this.xforwardedforclientcertsubjectdnalias;
    }
    /**
     * @return Specifies whether to use the `X-Forwarded-Clientcert-subjectdn` header field to obtain information about the owner of the ALB client certificate. Valid values: true and false. Default value: false.
     * 
     */
    public Boolean xforwardedforclientcertsubjectdnenabled() {
        return this.xforwardedforclientcertsubjectdnenabled;
    }
    /**
     * @return Indicates Whether the X-Forwarded-Client-Port Header Field Is Used to Obtain Access to Server Load Balancer Instances to the Client, and Those of the Ports.
     * 
     */
    public Boolean xforwardedforclientsrcportenabled() {
        return this.xforwardedforclientsrcportenabled;
    }
    /**
     * @return Indicates whether the X-Forwarded-For header field is used to obtain the real IP address of tqhe client. Valid values: true and false. Default value: true.
     * 
     */
    public Boolean xforwardedforenabled() {
        return this.xforwardedforenabled;
    }
    /**
     * @return Indicates Whether the X-Forwarded-Proto Header Field Is Used to Obtain the Server Load Balancer Instance Snooping Protocols.
     * 
     */
    public Boolean xforwardedforprotoenabled() {
        return this.xforwardedforprotoenabled;
    }
    /**
     * @return Indicates whether the SLB-ID header field is used to obtain the ID of the ALB instance. Valid values: true and false. Default value: false.
     * 
     */
    public Boolean xforwardedforslbidenabled() {
        return this.xforwardedforslbidenabled;
    }
    /**
     * @return Indicates Whether the X-Forwarded-Port Header Field Is Used to Obtain the Server Load Balancer Instance Listening Port.
     * 
     */
    public Boolean xforwardedforslbportenabled() {
        return this.xforwardedforslbportenabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenersListenerXforwardedForConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String xforwardedforclientcertIssuerdnalias;
        private Boolean xforwardedforclientcertIssuerdnenabled;
        private String xforwardedforclientcertclientverifyalias;
        private Boolean xforwardedforclientcertclientverifyenabled;
        private String xforwardedforclientcertfingerprintalias;
        private Boolean xforwardedforclientcertfingerprintenabled;
        private String xforwardedforclientcertsubjectdnalias;
        private Boolean xforwardedforclientcertsubjectdnenabled;
        private Boolean xforwardedforclientsrcportenabled;
        private Boolean xforwardedforenabled;
        private Boolean xforwardedforprotoenabled;
        private Boolean xforwardedforslbidenabled;
        private Boolean xforwardedforslbportenabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenersListenerXforwardedForConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xforwardedforclientcertIssuerdnalias = defaults.xforwardedforclientcertIssuerdnalias;
    	      this.xforwardedforclientcertIssuerdnenabled = defaults.xforwardedforclientcertIssuerdnenabled;
    	      this.xforwardedforclientcertclientverifyalias = defaults.xforwardedforclientcertclientverifyalias;
    	      this.xforwardedforclientcertclientverifyenabled = defaults.xforwardedforclientcertclientverifyenabled;
    	      this.xforwardedforclientcertfingerprintalias = defaults.xforwardedforclientcertfingerprintalias;
    	      this.xforwardedforclientcertfingerprintenabled = defaults.xforwardedforclientcertfingerprintenabled;
    	      this.xforwardedforclientcertsubjectdnalias = defaults.xforwardedforclientcertsubjectdnalias;
    	      this.xforwardedforclientcertsubjectdnenabled = defaults.xforwardedforclientcertsubjectdnenabled;
    	      this.xforwardedforclientsrcportenabled = defaults.xforwardedforclientsrcportenabled;
    	      this.xforwardedforenabled = defaults.xforwardedforenabled;
    	      this.xforwardedforprotoenabled = defaults.xforwardedforprotoenabled;
    	      this.xforwardedforslbidenabled = defaults.xforwardedforslbidenabled;
    	      this.xforwardedforslbportenabled = defaults.xforwardedforslbportenabled;
        }

        public Builder xforwardedforclientcertIssuerdnalias(String xforwardedforclientcertIssuerdnalias) {
            this.xforwardedforclientcertIssuerdnalias = Objects.requireNonNull(xforwardedforclientcertIssuerdnalias);
            return this;
        }
        public Builder xforwardedforclientcertIssuerdnenabled(Boolean xforwardedforclientcertIssuerdnenabled) {
            this.xforwardedforclientcertIssuerdnenabled = Objects.requireNonNull(xforwardedforclientcertIssuerdnenabled);
            return this;
        }
        public Builder xforwardedforclientcertclientverifyalias(String xforwardedforclientcertclientverifyalias) {
            this.xforwardedforclientcertclientverifyalias = Objects.requireNonNull(xforwardedforclientcertclientverifyalias);
            return this;
        }
        public Builder xforwardedforclientcertclientverifyenabled(Boolean xforwardedforclientcertclientverifyenabled) {
            this.xforwardedforclientcertclientverifyenabled = Objects.requireNonNull(xforwardedforclientcertclientverifyenabled);
            return this;
        }
        public Builder xforwardedforclientcertfingerprintalias(String xforwardedforclientcertfingerprintalias) {
            this.xforwardedforclientcertfingerprintalias = Objects.requireNonNull(xforwardedforclientcertfingerprintalias);
            return this;
        }
        public Builder xforwardedforclientcertfingerprintenabled(Boolean xforwardedforclientcertfingerprintenabled) {
            this.xforwardedforclientcertfingerprintenabled = Objects.requireNonNull(xforwardedforclientcertfingerprintenabled);
            return this;
        }
        public Builder xforwardedforclientcertsubjectdnalias(String xforwardedforclientcertsubjectdnalias) {
            this.xforwardedforclientcertsubjectdnalias = Objects.requireNonNull(xforwardedforclientcertsubjectdnalias);
            return this;
        }
        public Builder xforwardedforclientcertsubjectdnenabled(Boolean xforwardedforclientcertsubjectdnenabled) {
            this.xforwardedforclientcertsubjectdnenabled = Objects.requireNonNull(xforwardedforclientcertsubjectdnenabled);
            return this;
        }
        public Builder xforwardedforclientsrcportenabled(Boolean xforwardedforclientsrcportenabled) {
            this.xforwardedforclientsrcportenabled = Objects.requireNonNull(xforwardedforclientsrcportenabled);
            return this;
        }
        public Builder xforwardedforenabled(Boolean xforwardedforenabled) {
            this.xforwardedforenabled = Objects.requireNonNull(xforwardedforenabled);
            return this;
        }
        public Builder xforwardedforprotoenabled(Boolean xforwardedforprotoenabled) {
            this.xforwardedforprotoenabled = Objects.requireNonNull(xforwardedforprotoenabled);
            return this;
        }
        public Builder xforwardedforslbidenabled(Boolean xforwardedforslbidenabled) {
            this.xforwardedforslbidenabled = Objects.requireNonNull(xforwardedforslbidenabled);
            return this;
        }
        public Builder xforwardedforslbportenabled(Boolean xforwardedforslbportenabled) {
            this.xforwardedforslbportenabled = Objects.requireNonNull(xforwardedforslbportenabled);
            return this;
        }        public GetListenersListenerXforwardedForConfig build() {
            return new GetListenersListenerXforwardedForConfig(xforwardedforclientcertIssuerdnalias, xforwardedforclientcertIssuerdnenabled, xforwardedforclientcertclientverifyalias, xforwardedforclientcertclientverifyenabled, xforwardedforclientcertfingerprintalias, xforwardedforclientcertfingerprintenabled, xforwardedforclientcertsubjectdnalias, xforwardedforclientcertsubjectdnenabled, xforwardedforclientsrcportenabled, xforwardedforenabled, xforwardedforprotoenabled, xforwardedforslbidenabled, xforwardedforslbportenabled);
        }
    }
}