// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayVpnAttachmentsAttachmentHealthCheckConfig {
    /**
     * @return The destination IP address.
     * 
     */
    private final String dip;
    private final Boolean enable;
    /**
     * @return The interval between two consecutive health checks. Unit: seconds.
     * 
     */
    private final Integer interval;
    /**
     * @return Whether to revoke the published route when the health check fails.
     * 
     */
    private final String policy;
    /**
     * @return The maximum number of health check retries.
     * 
     */
    private final Integer retry;
    /**
     * @return The source IP address.
     * 
     */
    private final String sip;
    /**
     * @return The status of the resource.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetGatewayVpnAttachmentsAttachmentHealthCheckConfig(
        @CustomType.Parameter("dip") String dip,
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("interval") Integer interval,
        @CustomType.Parameter("policy") String policy,
        @CustomType.Parameter("retry") Integer retry,
        @CustomType.Parameter("sip") String sip,
        @CustomType.Parameter("status") String status) {
        this.dip = dip;
        this.enable = enable;
        this.interval = interval;
        this.policy = policy;
        this.retry = retry;
        this.sip = sip;
        this.status = status;
    }

    /**
     * @return The destination IP address.
     * 
     */
    public String dip() {
        return this.dip;
    }
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return The interval between two consecutive health checks. Unit: seconds.
     * 
     */
    public Integer interval() {
        return this.interval;
    }
    /**
     * @return Whether to revoke the published route when the health check fails.
     * 
     */
    public String policy() {
        return this.policy;
    }
    /**
     * @return The maximum number of health check retries.
     * 
     */
    public Integer retry() {
        return this.retry;
    }
    /**
     * @return The source IP address.
     * 
     */
    public String sip() {
        return this.sip;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayVpnAttachmentsAttachmentHealthCheckConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dip;
        private Boolean enable;
        private Integer interval;
        private String policy;
        private Integer retry;
        private String sip;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayVpnAttachmentsAttachmentHealthCheckConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dip = defaults.dip;
    	      this.enable = defaults.enable;
    	      this.interval = defaults.interval;
    	      this.policy = defaults.policy;
    	      this.retry = defaults.retry;
    	      this.sip = defaults.sip;
    	      this.status = defaults.status;
        }

        public Builder dip(String dip) {
            this.dip = Objects.requireNonNull(dip);
            return this;
        }
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder retry(Integer retry) {
            this.retry = Objects.requireNonNull(retry);
            return this;
        }
        public Builder sip(String sip) {
            this.sip = Objects.requireNonNull(sip);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetGatewayVpnAttachmentsAttachmentHealthCheckConfig build() {
            return new GetGatewayVpnAttachmentsAttachmentHealthCheckConfig(dip, enable, interval, policy, retry, sip, status);
        }
    }
}