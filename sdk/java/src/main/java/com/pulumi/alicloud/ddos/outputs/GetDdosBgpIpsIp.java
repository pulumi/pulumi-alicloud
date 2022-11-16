// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDdosBgpIpsIp {
    /**
     * @return The ID of the Ip. The value formats as `&lt;instance_id&gt;:&lt;ip&gt;`.
     * 
     */
    private final String id;
    /**
     * @return The ID of the native protection enterprise instance to be operated.
     * 
     */
    private final String instanceId;
    /**
     * @return The IP address.
     * 
     */
    private final String ip;
    /**
     * @return The type of cloud asset to which the IP address belongs.
     * 
     */
    private final String product;
    /**
     * @return The current state of the IP address.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetDdosBgpIpsIp(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("ip") String ip,
        @CustomType.Parameter("product") String product,
        @CustomType.Parameter("status") String status) {
        this.id = id;
        this.instanceId = instanceId;
        this.ip = ip;
        this.product = product;
        this.status = status;
    }

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

    public static final class Builder {
        private String id;
        private String instanceId;
        private String ip;
        private String product;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDdosBgpIpsIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.ip = defaults.ip;
    	      this.product = defaults.product;
    	      this.status = defaults.status;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder ip(String ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }
        public Builder product(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetDdosBgpIpsIp build() {
            return new GetDdosBgpIpsIp(id, instanceId, ip, product, status);
        }
    }
}