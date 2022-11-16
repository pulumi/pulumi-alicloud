// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DnatEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnatEntryArgs Empty = new DnatEntryArgs();

    /**
     * The external public IP address.when &#34;type&#34; is &#34;Internet&#34;,automatically identify the external ip.
     * 
     */
    @Import(name="externalIp")
    private @Nullable Output<String> externalIp;

    /**
     * @return The external public IP address.when &#34;type&#34; is &#34;Internet&#34;,automatically identify the external ip.
     * 
     */
    public Optional<Output<String>> externalIp() {
        return Optional.ofNullable(this.externalIp);
    }

    /**
     * The public port.Value range: 1 to 65535 or &#34;any&#34;.
     * 
     */
    @Import(name="externalPort", required=true)
    private Output<String> externalPort;

    /**
     * @return The public port.Value range: 1 to 65535 or &#34;any&#34;.
     * 
     */
    public Output<String> externalPort() {
        return this.externalPort;
    }

    /**
     * The destination private IP address.
     * 
     */
    @Import(name="internalIp", required=true)
    private Output<String> internalIp;

    /**
     * @return The destination private IP address.
     * 
     */
    public Output<String> internalIp() {
        return this.internalIp;
    }

    /**
     * The destination private port.Value range: 1 to 65535 or &#34;any&#34;.
     * 
     */
    @Import(name="internalPort", required=true)
    private Output<String> internalPort;

    /**
     * @return The destination private port.Value range: 1 to 65535 or &#34;any&#34;.
     * 
     */
    public Output<String> internalPort() {
        return this.internalPort;
    }

    /**
     * The protocol type. Valid values: TCP: Forwards packets of the TCP protocol. UDP: Forwards packets of the UDP protocol. Any: Forwards packets of all protocols.
     * 
     */
    @Import(name="ipProtocol", required=true)
    private Output<String> ipProtocol;

    /**
     * @return The protocol type. Valid values: TCP: Forwards packets of the TCP protocol. UDP: Forwards packets of the UDP protocol. Any: Forwards packets of all protocols.
     * 
     */
    public Output<String> ipProtocol() {
        return this.ipProtocol;
    }

    /**
     * The ID of the SAG instance.
     * 
     */
    @Import(name="sagId", required=true)
    private Output<String> sagId;

    /**
     * @return The ID of the SAG instance.
     * 
     */
    public Output<String> sagId() {
        return this.sagId;
    }

    /**
     * The DNAT type. Valid values: Intranet: DNAT of private IP addresses. Internet: DNAT of public IP addresses
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The DNAT type. Valid values: Intranet: DNAT of private IP addresses. Internet: DNAT of public IP addresses
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DnatEntryArgs() {}

    private DnatEntryArgs(DnatEntryArgs $) {
        this.externalIp = $.externalIp;
        this.externalPort = $.externalPort;
        this.internalIp = $.internalIp;
        this.internalPort = $.internalPort;
        this.ipProtocol = $.ipProtocol;
        this.sagId = $.sagId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnatEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnatEntryArgs $;

        public Builder() {
            $ = new DnatEntryArgs();
        }

        public Builder(DnatEntryArgs defaults) {
            $ = new DnatEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalIp The external public IP address.when &#34;type&#34; is &#34;Internet&#34;,automatically identify the external ip.
         * 
         * @return builder
         * 
         */
        public Builder externalIp(@Nullable Output<String> externalIp) {
            $.externalIp = externalIp;
            return this;
        }

        /**
         * @param externalIp The external public IP address.when &#34;type&#34; is &#34;Internet&#34;,automatically identify the external ip.
         * 
         * @return builder
         * 
         */
        public Builder externalIp(String externalIp) {
            return externalIp(Output.of(externalIp));
        }

        /**
         * @param externalPort The public port.Value range: 1 to 65535 or &#34;any&#34;.
         * 
         * @return builder
         * 
         */
        public Builder externalPort(Output<String> externalPort) {
            $.externalPort = externalPort;
            return this;
        }

        /**
         * @param externalPort The public port.Value range: 1 to 65535 or &#34;any&#34;.
         * 
         * @return builder
         * 
         */
        public Builder externalPort(String externalPort) {
            return externalPort(Output.of(externalPort));
        }

        /**
         * @param internalIp The destination private IP address.
         * 
         * @return builder
         * 
         */
        public Builder internalIp(Output<String> internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        /**
         * @param internalIp The destination private IP address.
         * 
         * @return builder
         * 
         */
        public Builder internalIp(String internalIp) {
            return internalIp(Output.of(internalIp));
        }

        /**
         * @param internalPort The destination private port.Value range: 1 to 65535 or &#34;any&#34;.
         * 
         * @return builder
         * 
         */
        public Builder internalPort(Output<String> internalPort) {
            $.internalPort = internalPort;
            return this;
        }

        /**
         * @param internalPort The destination private port.Value range: 1 to 65535 or &#34;any&#34;.
         * 
         * @return builder
         * 
         */
        public Builder internalPort(String internalPort) {
            return internalPort(Output.of(internalPort));
        }

        /**
         * @param ipProtocol The protocol type. Valid values: TCP: Forwards packets of the TCP protocol. UDP: Forwards packets of the UDP protocol. Any: Forwards packets of all protocols.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(Output<String> ipProtocol) {
            $.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * @param ipProtocol The protocol type. Valid values: TCP: Forwards packets of the TCP protocol. UDP: Forwards packets of the UDP protocol. Any: Forwards packets of all protocols.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(String ipProtocol) {
            return ipProtocol(Output.of(ipProtocol));
        }

        /**
         * @param sagId The ID of the SAG instance.
         * 
         * @return builder
         * 
         */
        public Builder sagId(Output<String> sagId) {
            $.sagId = sagId;
            return this;
        }

        /**
         * @param sagId The ID of the SAG instance.
         * 
         * @return builder
         * 
         */
        public Builder sagId(String sagId) {
            return sagId(Output.of(sagId));
        }

        /**
         * @param type The DNAT type. Valid values: Intranet: DNAT of private IP addresses. Internet: DNAT of public IP addresses
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The DNAT type. Valid values: Intranet: DNAT of private IP addresses. Internet: DNAT of public IP addresses
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DnatEntryArgs build() {
            $.externalPort = Objects.requireNonNull($.externalPort, "expected parameter 'externalPort' to be non-null");
            $.internalIp = Objects.requireNonNull($.internalIp, "expected parameter 'internalIp' to be non-null");
            $.internalPort = Objects.requireNonNull($.internalPort, "expected parameter 'internalPort' to be non-null");
            $.ipProtocol = Objects.requireNonNull($.ipProtocol, "expected parameter 'ipProtocol' to be non-null");
            $.sagId = Objects.requireNonNull($.sagId, "expected parameter 'sagId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}