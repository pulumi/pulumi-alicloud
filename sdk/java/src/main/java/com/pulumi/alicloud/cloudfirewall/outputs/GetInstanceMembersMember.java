// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceMembersMember {
    /**
     * @return When the cloud firewall member account was added.&gt; use second-level timestamp format.
     * 
     */
    private Integer createTime;
    private String id;
    /**
     * @return Remarks of cloud firewall member accounts.
     * 
     */
    private String memberDesc;
    /**
     * @return The name of the cloud firewall member account.
     * 
     */
    private String memberDisplayName;
    /**
     * @return The UID of the cloud firewall member account.
     * 
     */
    private String memberUid;
    /**
     * @return The last modification time of the cloud firewall member account.&gt; use second-level timestamp format.
     * 
     */
    private Integer modifyTime;
    /**
     * @return The resource attribute field that represents the resource status.
     * 
     */
    private String status;

    private GetInstanceMembersMember() {}
    /**
     * @return When the cloud firewall member account was added.&gt; use second-level timestamp format.
     * 
     */
    public Integer createTime() {
        return this.createTime;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Remarks of cloud firewall member accounts.
     * 
     */
    public String memberDesc() {
        return this.memberDesc;
    }
    /**
     * @return The name of the cloud firewall member account.
     * 
     */
    public String memberDisplayName() {
        return this.memberDisplayName;
    }
    /**
     * @return The UID of the cloud firewall member account.
     * 
     */
    public String memberUid() {
        return this.memberUid;
    }
    /**
     * @return The last modification time of the cloud firewall member account.&gt; use second-level timestamp format.
     * 
     */
    public Integer modifyTime() {
        return this.modifyTime;
    }
    /**
     * @return The resource attribute field that represents the resource status.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceMembersMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer createTime;
        private String id;
        private String memberDesc;
        private String memberDisplayName;
        private String memberUid;
        private Integer modifyTime;
        private String status;
        public Builder() {}
        public Builder(GetInstanceMembersMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.memberDesc = defaults.memberDesc;
    	      this.memberDisplayName = defaults.memberDisplayName;
    	      this.memberUid = defaults.memberUid;
    	      this.modifyTime = defaults.modifyTime;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder createTime(Integer createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetInstanceMembersMember", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstanceMembersMember", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder memberDesc(String memberDesc) {
            if (memberDesc == null) {
              throw new MissingRequiredPropertyException("GetInstanceMembersMember", "memberDesc");
            }
            this.memberDesc = memberDesc;
            return this;
        }
        @CustomType.Setter
        public Builder memberDisplayName(String memberDisplayName) {
            if (memberDisplayName == null) {
              throw new MissingRequiredPropertyException("GetInstanceMembersMember", "memberDisplayName");
            }
            this.memberDisplayName = memberDisplayName;
            return this;
        }
        @CustomType.Setter
        public Builder memberUid(String memberUid) {
            if (memberUid == null) {
              throw new MissingRequiredPropertyException("GetInstanceMembersMember", "memberUid");
            }
            this.memberUid = memberUid;
            return this;
        }
        @CustomType.Setter
        public Builder modifyTime(Integer modifyTime) {
            if (modifyTime == null) {
              throw new MissingRequiredPropertyException("GetInstanceMembersMember", "modifyTime");
            }
            this.modifyTime = modifyTime;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetInstanceMembersMember", "status");
            }
            this.status = status;
            return this;
        }
        public GetInstanceMembersMember build() {
            final var _resultValue = new GetInstanceMembersMember();
            _resultValue.createTime = createTime;
            _resultValue.id = id;
            _resultValue.memberDesc = memberDesc;
            _resultValue.memberDisplayName = memberDisplayName;
            _resultValue.memberUid = memberUid;
            _resultValue.modifyTime = modifyTime;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}