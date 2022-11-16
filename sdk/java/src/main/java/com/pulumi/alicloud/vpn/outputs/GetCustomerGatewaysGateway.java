// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCustomerGatewaysGateway {
    /**
     * @return The creation time of the VPN customer gateway.
     * 
     */
    private final String createTime;
    /**
     * @return The description of the VPN customer gateway.
     * 
     */
    private final String description;
    /**
     * @return ID of the VPN customer gateway .
     * 
     */
    private final String id;
    /**
     * @return The ip address of the VPN customer gateway.
     * 
     */
    private final String ipAddress;
    /**
     * @return The name of the VPN customer gateway.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetCustomerGatewaysGateway(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("name") String name) {
        this.createTime = createTime;
        this.description = description;
        this.id = id;
        this.ipAddress = ipAddress;
        this.name = name;
    }

    /**
     * @return The creation time of the VPN customer gateway.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the VPN customer gateway.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID of the VPN customer gateway .
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ip address of the VPN customer gateway.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The name of the VPN customer gateway.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomerGatewaysGateway defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String id;
        private String ipAddress;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomerGatewaysGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetCustomerGatewaysGateway build() {
            return new GetCustomerGatewaysGateway(createTime, description, id, ipAddress, name);
        }
    }
}