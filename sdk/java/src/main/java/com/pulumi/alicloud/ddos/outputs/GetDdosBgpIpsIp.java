// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDdosBgpIpsIp {
    /**
     * @return The ID of the Ip. The value formats as `&lt;instance_id&gt;:&lt;ip&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of the native protection enterprise instance to be operated.
     * 
     */
    private String instanceId;
    /**
     * @return The IP address.
     * 
     */
    private String ip;
    /**
     * @return The type of cloud asset to which the IP address belongs.
     * 
     */
    private String product;
    /**
     * @return The current state of the IP address.
     * 
     */
    private String status;

    private GetDdosBgpIpsIp() {}
    /**
     * @return The ID of the Ip. The value formats as `&lt;instance_id&gt;:&lt;ip&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the native protection enterprise instance to be operated.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The IP address.
     * 
     */
    public String ip() {
        return this.ip;
    }
    /**
     * @return The type of cloud asset to which the IP address belongs.
     * 
     */
    public String product() {
        return this.product;
    }
    /**
     * @return The current state of the IP address.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDdosBgpIpsIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String instanceId;
        private String ip;
        private String product;
        private String status;
        public Builder() {}
        public Builder(GetDdosBgpIpsIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.ip = defaults.ip;
    	      this.product = defaults.product;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDdosBgpIpsIp", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetDdosBgpIpsIp", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetDdosBgpIpsIp", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder product(String product) {
            if (product == null) {
              throw new MissingRequiredPropertyException("GetDdosBgpIpsIp", "product");
            }
            this.product = product;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDdosBgpIpsIp", "status");
            }
            this.status = status;
            return this;
        }
        public GetDdosBgpIpsIp build() {
            final var _resultValue = new GetDdosBgpIpsIp();
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.ip = ip;
            _resultValue.product = product;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}