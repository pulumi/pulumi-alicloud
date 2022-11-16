// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleForwardIp {
    /**
     * @return The ip of the forwarding destination.
     * 
     */
    private final String ip;
    /**
     * @return The port of the forwarding destination.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private RuleForwardIp(
        @CustomType.Parameter("ip") String ip,
        @CustomType.Parameter("port") Integer port) {
        this.ip = ip;
        this.port = port;
    }

    /**
     * @return The ip of the forwarding destination.
     * 
     */
    public String ip() {
        return this.ip;
    }
    /**
     * @return The port of the forwarding destination.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleForwardIp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ip;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleForwardIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.port = defaults.port;
        }

        public Builder ip(String ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public RuleForwardIp build() {
            return new RuleForwardIp(ip, port);
        }
    }
}