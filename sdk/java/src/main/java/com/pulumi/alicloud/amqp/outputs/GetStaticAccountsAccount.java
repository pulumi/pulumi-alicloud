// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStaticAccountsAccount {
    /**
     * @return Access key.
     * 
     */
    private String accessKey;
    /**
     * @return Create time stamp. Unix timestamp, to millisecond level.
     * 
     */
    private String createTime;
    /**
     * @return The `key` of the resource supplied above.The value is formulated as `&lt;instance_id&gt;:&lt;access_key&gt;`.
     * 
     */
    private String id;
    /**
     * @return InstanceId
     * 
     */
    private String instanceId;
    /**
     * @return The ID of the user&#39;s primary account.
     * 
     */
    private String masterUid;
    /**
     * @return Static password.
     * 
     */
    private String password;
    /**
     * @return Static username.
     * 
     */
    private String userName;

    private GetStaticAccountsAccount() {}
    /**
     * @return Access key.
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return Create time stamp. Unix timestamp, to millisecond level.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The `key` of the resource supplied above.The value is formulated as `&lt;instance_id&gt;:&lt;access_key&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return InstanceId
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The ID of the user&#39;s primary account.
     * 
     */
    public String masterUid() {
        return this.masterUid;
    }
    /**
     * @return Static password.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return Static username.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticAccountsAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private String createTime;
        private String id;
        private String instanceId;
        private String masterUid;
        private String password;
        private String userName;
        public Builder() {}
        public Builder(GetStaticAccountsAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.masterUid = defaults.masterUid;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            if (accessKey == null) {
              throw new MissingRequiredPropertyException("GetStaticAccountsAccount", "accessKey");
            }
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetStaticAccountsAccount", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStaticAccountsAccount", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetStaticAccountsAccount", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder masterUid(String masterUid) {
            if (masterUid == null) {
              throw new MissingRequiredPropertyException("GetStaticAccountsAccount", "masterUid");
            }
            this.masterUid = masterUid;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("GetStaticAccountsAccount", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            if (userName == null) {
              throw new MissingRequiredPropertyException("GetStaticAccountsAccount", "userName");
            }
            this.userName = userName;
            return this;
        }
        public GetStaticAccountsAccount build() {
            final var _resultValue = new GetStaticAccountsAccount();
            _resultValue.accessKey = accessKey;
            _resultValue.createTime = createTime;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.masterUid = masterUid;
            _resultValue.password = password;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
