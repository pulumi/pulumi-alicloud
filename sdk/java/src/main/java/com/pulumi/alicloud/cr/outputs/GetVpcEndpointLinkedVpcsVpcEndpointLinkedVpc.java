// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc {
    /**
     * @return Indicates whether the default policy is used to access the instance.
     * 
     */
    private Boolean defaultAccess;
    /**
     * @return The ID of the Vpc Endpoint Linked Vpc. It formats as `&lt;instance_id&gt;:&lt;vpc_id&gt;:&lt;vswitch_id&gt;:&lt;module_name&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of the instance.
     * 
     */
    private String instanceId;
    /**
     * @return IP address.
     * 
     */
    private String ip;
    /**
     * @return The name of the module that you want to access. Valid Values:
     * - `Registry`: the image repository.
     * - `Chart`: a Helm chart.
     * 
     */
    private String moduleName;
    /**
     * @return The status of the Vpc Endpoint Linked Vpc. Valid Values: `CREATING`, `RUNNING`.
     * 
     */
    private String status;
    /**
     * @return The ID of the VPC.
     * 
     */
    private String vpcId;
    /**
     * @return The ID of the vSwitch.
     * 
     */
    private String vswitchId;

    private GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc() {}
    /**
     * @return Indicates whether the default policy is used to access the instance.
     * 
     */
    public Boolean defaultAccess() {
        return this.defaultAccess;
    }
    /**
     * @return The ID of the Vpc Endpoint Linked Vpc. It formats as `&lt;instance_id&gt;:&lt;vpc_id&gt;:&lt;vswitch_id&gt;:&lt;module_name&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return IP address.
     * 
     */
    public String ip() {
        return this.ip;
    }
    /**
     * @return The name of the module that you want to access. Valid Values:
     * - `Registry`: the image repository.
     * - `Chart`: a Helm chart.
     * 
     */
    public String moduleName() {
        return this.moduleName;
    }
    /**
     * @return The status of the Vpc Endpoint Linked Vpc. Valid Values: `CREATING`, `RUNNING`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the VPC.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The ID of the vSwitch.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean defaultAccess;
        private String id;
        private String instanceId;
        private String ip;
        private String moduleName;
        private String status;
        private String vpcId;
        private String vswitchId;
        public Builder() {}
        public Builder(GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAccess = defaults.defaultAccess;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.ip = defaults.ip;
    	      this.moduleName = defaults.moduleName;
    	      this.status = defaults.status;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder defaultAccess(Boolean defaultAccess) {
            if (defaultAccess == null) {
              throw new MissingRequiredPropertyException("GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc", "defaultAccess");
            }
            this.defaultAccess = defaultAccess;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder moduleName(String moduleName) {
            if (moduleName == null) {
              throw new MissingRequiredPropertyException("GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc", "moduleName");
            }
            this.moduleName = moduleName;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        public GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc build() {
            final var _resultValue = new GetVpcEndpointLinkedVpcsVpcEndpointLinkedVpc();
            _resultValue.defaultAccess = defaultAccess;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.ip = ip;
            _resultValue.moduleName = moduleName;
            _resultValue.status = status;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}