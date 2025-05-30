// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nlb.inputs;

import com.pulumi.alicloud.nlb.inputs.ListenerProxyProtocolConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerState extends com.pulumi.resources.ResourceArgs {

    public static final ListenerState Empty = new ListenerState();

    /**
     * Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:
     * 
     */
    @Import(name="alpnEnabled")
    private @Nullable Output<Boolean> alpnEnabled;

    /**
     * @return Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:
     * 
     */
    public Optional<Output<Boolean>> alpnEnabled() {
        return Optional.ofNullable(this.alpnEnabled);
    }

    /**
     * The ALPN policy. Valid values:
     * - `HTTP1Only`: uses only HTTP 1.x. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0.
     * - `HTTP2Only`: uses only HTTP 2.0.
     * - `HTTP2Optional`: preferentially uses HTTP 1.x over HTTP 2.0. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0, and the priority of HTTP 1.0 is higher than the priority of HTTP 2.0.
     * - `HTTP2Preferred`: preferentially uses HTTP 2.0 over HTTP 1.x. The priority of HTTP 2.0 is higher than the priority of HTTP 1.1, and the priority of HTTP 1.1 is higher than the priority of HTTP 1.0.
     * 
     * &gt; **NOTE:**  This parameter is required if AlpnEnabled is set to true.
     * 
     * &gt; **NOTE:**  Effective only for TCPSSL listener.
     * 
     */
    @Import(name="alpnPolicy")
    private @Nullable Output<String> alpnPolicy;

    /**
     * @return The ALPN policy. Valid values:
     * - `HTTP1Only`: uses only HTTP 1.x. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0.
     * - `HTTP2Only`: uses only HTTP 2.0.
     * - `HTTP2Optional`: preferentially uses HTTP 1.x over HTTP 2.0. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0, and the priority of HTTP 1.0 is higher than the priority of HTTP 2.0.
     * - `HTTP2Preferred`: preferentially uses HTTP 2.0 over HTTP 1.x. The priority of HTTP 2.0 is higher than the priority of HTTP 1.1, and the priority of HTTP 1.1 is higher than the priority of HTTP 1.0.
     * 
     * &gt; **NOTE:**  This parameter is required if AlpnEnabled is set to true.
     * 
     * &gt; **NOTE:**  Effective only for TCPSSL listener.
     * 
     */
    public Optional<Output<String>> alpnPolicy() {
        return Optional.ofNullable(this.alpnPolicy);
    }

    /**
     * The list of certificate authority (CA) certificates. This parameter takes effect only for listeners that use SSL over TCP.
     * 
     * &gt; **NOTE:**  Only one CA certificate is supported.
     * 
     */
    @Import(name="caCertificateIds")
    private @Nullable Output<List<String>> caCertificateIds;

    /**
     * @return The list of certificate authority (CA) certificates. This parameter takes effect only for listeners that use SSL over TCP.
     * 
     * &gt; **NOTE:**  Only one CA certificate is supported.
     * 
     */
    public Optional<Output<List<String>>> caCertificateIds() {
        return Optional.ofNullable(this.caCertificateIds);
    }

    /**
     * Specifies whether to enable mutual authentication. Valid values:
     * 
     */
    @Import(name="caEnabled")
    private @Nullable Output<Boolean> caEnabled;

    /**
     * @return Specifies whether to enable mutual authentication. Valid values:
     * 
     */
    public Optional<Output<Boolean>> caEnabled() {
        return Optional.ofNullable(this.caEnabled);
    }

    /**
     * The list of server certificates. This parameter takes effect only for listeners that use SSL over TCP.
     * 
     * &gt; **NOTE:**  This parameter takes effect only for TCPSSL listeners.
     * 
     */
    @Import(name="certificateIds")
    private @Nullable Output<List<String>> certificateIds;

    /**
     * @return The list of server certificates. This parameter takes effect only for listeners that use SSL over TCP.
     * 
     * &gt; **NOTE:**  This parameter takes effect only for TCPSSL listeners.
     * 
     */
    public Optional<Output<List<String>>> certificateIds() {
        return Optional.ofNullable(this.certificateIds);
    }

    /**
     * The maximum number of connections that can be created per second on the NLB instance. Valid values: `0` to `1000000`. `0` specifies that the number of connections is unlimited.
     * 
     */
    @Import(name="cps")
    private @Nullable Output<Integer> cps;

    /**
     * @return The maximum number of connections that can be created per second on the NLB instance. Valid values: `0` to `1000000`. `0` specifies that the number of connections is unlimited.
     * 
     */
    public Optional<Output<Integer>> cps() {
        return Optional.ofNullable(this.cps);
    }

    /**
     * The last port in the listener port range. Valid values: `0` to `65535`. The number of the last port must be greater than the number of the first port.
     * 
     * &gt; **NOTE:**  This parameter is required when `ListenerPort` is set to `0`.
     * 
     */
    @Import(name="endPort")
    private @Nullable Output<Integer> endPort;

    /**
     * @return The last port in the listener port range. Valid values: `0` to `65535`. The number of the last port must be greater than the number of the first port.
     * 
     * &gt; **NOTE:**  This parameter is required when `ListenerPort` is set to `0`.
     * 
     */
    public Optional<Output<Integer>> endPort() {
        return Optional.ofNullable(this.endPort);
    }

    /**
     * The timeout period of idle connections. Unit: seconds. Valid values: `1` to `900`. Default value: `900`.
     * 
     */
    @Import(name="idleTimeout")
    private @Nullable Output<Integer> idleTimeout;

    /**
     * @return The timeout period of idle connections. Unit: seconds. Valid values: `1` to `900`. Default value: `900`.
     * 
     */
    public Optional<Output<Integer>> idleTimeout() {
        return Optional.ofNullable(this.idleTimeout);
    }

    /**
     * Enter a name for the listener.
     * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
     * 
     */
    @Import(name="listenerDescription")
    private @Nullable Output<String> listenerDescription;

    /**
     * @return Enter a name for the listener.
     * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
     * 
     */
    public Optional<Output<String>> listenerDescription() {
        return Optional.ofNullable(this.listenerDescription);
    }

    /**
     * The listener port. Valid values: `0` to `65535`.
     * If you set the value to `0`, the listener listens by port range. If you set the value to `0`, you must specify `StartPort` and `EndPort`.
     * 
     */
    @Import(name="listenerPort")
    private @Nullable Output<Integer> listenerPort;

    /**
     * @return The listener port. Valid values: `0` to `65535`.
     * If you set the value to `0`, the listener listens by port range. If you set the value to `0`, you must specify `StartPort` and `EndPort`.
     * 
     */
    public Optional<Output<Integer>> listenerPort() {
        return Optional.ofNullable(this.listenerPort);
    }

    /**
     * The listening protocol. Valid values: `TCP`, `UDP`, and `TCPSSL`.
     * 
     */
    @Import(name="listenerProtocol")
    private @Nullable Output<String> listenerProtocol;

    /**
     * @return The listening protocol. Valid values: `TCP`, `UDP`, and `TCPSSL`.
     * 
     */
    public Optional<Output<String>> listenerProtocol() {
        return Optional.ofNullable(this.listenerProtocol);
    }

    /**
     * The ID of the Network Load Balancer (NLB) instance.
     * 
     */
    @Import(name="loadBalancerId")
    private @Nullable Output<String> loadBalancerId;

    /**
     * @return The ID of the Network Load Balancer (NLB) instance.
     * 
     */
    public Optional<Output<String>> loadBalancerId() {
        return Optional.ofNullable(this.loadBalancerId);
    }

    /**
     * The maximum size of a TCP segment. Unit: bytes. Valid values: `0` to `1500`. `0` specifies that the maximum segment size remains unchanged.
     * 
     * &gt; **NOTE:**  This parameter is supported only by TCP listeners and listeners that use SSL over TCP.
     * 
     */
    @Import(name="mss")
    private @Nullable Output<Integer> mss;

    /**
     * @return The maximum size of a TCP segment. Unit: bytes. Valid values: `0` to `1500`. `0` specifies that the maximum segment size remains unchanged.
     * 
     * &gt; **NOTE:**  This parameter is supported only by TCP listeners and listeners that use SSL over TCP.
     * 
     */
    public Optional<Output<Integer>> mss() {
        return Optional.ofNullable(this.mss);
    }

    /**
     * The Proxy Protocol is used to carry the VpcId, PrivateLinkEpId, and PrivateLinkEpsId information to the backend server for configuration. See `proxy_protocol_config` below.
     * 
     */
    @Import(name="proxyProtocolConfig")
    private @Nullable Output<ListenerProxyProtocolConfigArgs> proxyProtocolConfig;

    /**
     * @return The Proxy Protocol is used to carry the VpcId, PrivateLinkEpId, and PrivateLinkEpsId information to the backend server for configuration. See `proxy_protocol_config` below.
     * 
     */
    public Optional<Output<ListenerProxyProtocolConfigArgs>> proxyProtocolConfig() {
        return Optional.ofNullable(this.proxyProtocolConfig);
    }

    /**
     * Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:
     * 
     */
    @Import(name="proxyProtocolEnabled")
    private @Nullable Output<Boolean> proxyProtocolEnabled;

    /**
     * @return Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:
     * 
     */
    public Optional<Output<Boolean>> proxyProtocolEnabled() {
        return Optional.ofNullable(this.proxyProtocolEnabled);
    }

    /**
     * The ID of the region where the Network Load Balancer (NLB) instance is deployed.
     * You can call the [DescribeRegions](https://www.alibabacloud.com/help/en/doc-detail/443657.html) operation to query the most recent region list.
     * 
     */
    @Import(name="regionId")
    private @Nullable Output<String> regionId;

    /**
     * @return The ID of the region where the Network Load Balancer (NLB) instance is deployed.
     * You can call the [DescribeRegions](https://www.alibabacloud.com/help/en/doc-detail/443657.html) operation to query the most recent region list.
     * 
     */
    public Optional<Output<String>> regionId() {
        return Optional.ofNullable(this.regionId);
    }

    /**
     * Specifies whether to enable fine-grained monitoring. Valid values:
     * 
     */
    @Import(name="secSensorEnabled")
    private @Nullable Output<Boolean> secSensorEnabled;

    /**
     * @return Specifies whether to enable fine-grained monitoring. Valid values:
     * 
     */
    public Optional<Output<Boolean>> secSensorEnabled() {
        return Optional.ofNullable(this.secSensorEnabled);
    }

    /**
     * The security policy ID. System security policies and custom security policies are supported.
     * 
     * Valid values: `tls_cipher_policy\_1\_0` (default), `tls_cipher_policy\_1\_1`, `tls_cipher_policy\_1\_2`, `tls_cipher_policy\_1\_2\_strict`, and `tls_cipher_policy\_1\_2\_strict_with\_1\_3`.
     * 
     * &gt; **NOTE:**  This parameter takes effect only for listeners that use SSL over TCP.
     * 
     */
    @Import(name="securityPolicyId")
    private @Nullable Output<String> securityPolicyId;

    /**
     * @return The security policy ID. System security policies and custom security policies are supported.
     * 
     * Valid values: `tls_cipher_policy\_1\_0` (default), `tls_cipher_policy\_1\_1`, `tls_cipher_policy\_1\_2`, `tls_cipher_policy\_1\_2\_strict`, and `tls_cipher_policy\_1\_2\_strict_with\_1\_3`.
     * 
     * &gt; **NOTE:**  This parameter takes effect only for listeners that use SSL over TCP.
     * 
     */
    public Optional<Output<String>> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    /**
     * The ID of the server group.
     * 
     */
    @Import(name="serverGroupId")
    private @Nullable Output<String> serverGroupId;

    /**
     * @return The ID of the server group.
     * 
     */
    public Optional<Output<String>> serverGroupId() {
        return Optional.ofNullable(this.serverGroupId);
    }

    /**
     * The first port in the listener port range. Valid values: `0` to `65535`.
     * 
     * &gt; **NOTE:**  This parameter is required when `ListenerPort` is set to `0`.
     * 
     */
    @Import(name="startPort")
    private @Nullable Output<Integer> startPort;

    /**
     * @return The first port in the listener port range. Valid values: `0` to `65535`.
     * 
     * &gt; **NOTE:**  This parameter is required when `ListenerPort` is set to `0`.
     * 
     */
    public Optional<Output<Integer>> startPort() {
        return Optional.ofNullable(this.startPort);
    }

    /**
     * The status of the resource. Valid values: `Running`, `Stopped`. When you want to enable this instance, you can set the property value to `Running`;
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Running`, `Stopped`. When you want to enable this instance, you can set the property value to `Running`;
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tag of the resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tag of the resource
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ListenerState() {}

    private ListenerState(ListenerState $) {
        this.alpnEnabled = $.alpnEnabled;
        this.alpnPolicy = $.alpnPolicy;
        this.caCertificateIds = $.caCertificateIds;
        this.caEnabled = $.caEnabled;
        this.certificateIds = $.certificateIds;
        this.cps = $.cps;
        this.endPort = $.endPort;
        this.idleTimeout = $.idleTimeout;
        this.listenerDescription = $.listenerDescription;
        this.listenerPort = $.listenerPort;
        this.listenerProtocol = $.listenerProtocol;
        this.loadBalancerId = $.loadBalancerId;
        this.mss = $.mss;
        this.proxyProtocolConfig = $.proxyProtocolConfig;
        this.proxyProtocolEnabled = $.proxyProtocolEnabled;
        this.regionId = $.regionId;
        this.secSensorEnabled = $.secSensorEnabled;
        this.securityPolicyId = $.securityPolicyId;
        this.serverGroupId = $.serverGroupId;
        this.startPort = $.startPort;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerState $;

        public Builder() {
            $ = new ListenerState();
        }

        public Builder(ListenerState defaults) {
            $ = new ListenerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param alpnEnabled Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:
         * 
         * @return builder
         * 
         */
        public Builder alpnEnabled(@Nullable Output<Boolean> alpnEnabled) {
            $.alpnEnabled = alpnEnabled;
            return this;
        }

        /**
         * @param alpnEnabled Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:
         * 
         * @return builder
         * 
         */
        public Builder alpnEnabled(Boolean alpnEnabled) {
            return alpnEnabled(Output.of(alpnEnabled));
        }

        /**
         * @param alpnPolicy The ALPN policy. Valid values:
         * - `HTTP1Only`: uses only HTTP 1.x. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0.
         * - `HTTP2Only`: uses only HTTP 2.0.
         * - `HTTP2Optional`: preferentially uses HTTP 1.x over HTTP 2.0. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0, and the priority of HTTP 1.0 is higher than the priority of HTTP 2.0.
         * - `HTTP2Preferred`: preferentially uses HTTP 2.0 over HTTP 1.x. The priority of HTTP 2.0 is higher than the priority of HTTP 1.1, and the priority of HTTP 1.1 is higher than the priority of HTTP 1.0.
         * 
         * &gt; **NOTE:**  This parameter is required if AlpnEnabled is set to true.
         * 
         * &gt; **NOTE:**  Effective only for TCPSSL listener.
         * 
         * @return builder
         * 
         */
        public Builder alpnPolicy(@Nullable Output<String> alpnPolicy) {
            $.alpnPolicy = alpnPolicy;
            return this;
        }

        /**
         * @param alpnPolicy The ALPN policy. Valid values:
         * - `HTTP1Only`: uses only HTTP 1.x. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0.
         * - `HTTP2Only`: uses only HTTP 2.0.
         * - `HTTP2Optional`: preferentially uses HTTP 1.x over HTTP 2.0. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0, and the priority of HTTP 1.0 is higher than the priority of HTTP 2.0.
         * - `HTTP2Preferred`: preferentially uses HTTP 2.0 over HTTP 1.x. The priority of HTTP 2.0 is higher than the priority of HTTP 1.1, and the priority of HTTP 1.1 is higher than the priority of HTTP 1.0.
         * 
         * &gt; **NOTE:**  This parameter is required if AlpnEnabled is set to true.
         * 
         * &gt; **NOTE:**  Effective only for TCPSSL listener.
         * 
         * @return builder
         * 
         */
        public Builder alpnPolicy(String alpnPolicy) {
            return alpnPolicy(Output.of(alpnPolicy));
        }

        /**
         * @param caCertificateIds The list of certificate authority (CA) certificates. This parameter takes effect only for listeners that use SSL over TCP.
         * 
         * &gt; **NOTE:**  Only one CA certificate is supported.
         * 
         * @return builder
         * 
         */
        public Builder caCertificateIds(@Nullable Output<List<String>> caCertificateIds) {
            $.caCertificateIds = caCertificateIds;
            return this;
        }

        /**
         * @param caCertificateIds The list of certificate authority (CA) certificates. This parameter takes effect only for listeners that use SSL over TCP.
         * 
         * &gt; **NOTE:**  Only one CA certificate is supported.
         * 
         * @return builder
         * 
         */
        public Builder caCertificateIds(List<String> caCertificateIds) {
            return caCertificateIds(Output.of(caCertificateIds));
        }

        /**
         * @param caCertificateIds The list of certificate authority (CA) certificates. This parameter takes effect only for listeners that use SSL over TCP.
         * 
         * &gt; **NOTE:**  Only one CA certificate is supported.
         * 
         * @return builder
         * 
         */
        public Builder caCertificateIds(String... caCertificateIds) {
            return caCertificateIds(List.of(caCertificateIds));
        }

        /**
         * @param caEnabled Specifies whether to enable mutual authentication. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder caEnabled(@Nullable Output<Boolean> caEnabled) {
            $.caEnabled = caEnabled;
            return this;
        }

        /**
         * @param caEnabled Specifies whether to enable mutual authentication. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder caEnabled(Boolean caEnabled) {
            return caEnabled(Output.of(caEnabled));
        }

        /**
         * @param certificateIds The list of server certificates. This parameter takes effect only for listeners that use SSL over TCP.
         * 
         * &gt; **NOTE:**  This parameter takes effect only for TCPSSL listeners.
         * 
         * @return builder
         * 
         */
        public Builder certificateIds(@Nullable Output<List<String>> certificateIds) {
            $.certificateIds = certificateIds;
            return this;
        }

        /**
         * @param certificateIds The list of server certificates. This parameter takes effect only for listeners that use SSL over TCP.
         * 
         * &gt; **NOTE:**  This parameter takes effect only for TCPSSL listeners.
         * 
         * @return builder
         * 
         */
        public Builder certificateIds(List<String> certificateIds) {
            return certificateIds(Output.of(certificateIds));
        }

        /**
         * @param certificateIds The list of server certificates. This parameter takes effect only for listeners that use SSL over TCP.
         * 
         * &gt; **NOTE:**  This parameter takes effect only for TCPSSL listeners.
         * 
         * @return builder
         * 
         */
        public Builder certificateIds(String... certificateIds) {
            return certificateIds(List.of(certificateIds));
        }

        /**
         * @param cps The maximum number of connections that can be created per second on the NLB instance. Valid values: `0` to `1000000`. `0` specifies that the number of connections is unlimited.
         * 
         * @return builder
         * 
         */
        public Builder cps(@Nullable Output<Integer> cps) {
            $.cps = cps;
            return this;
        }

        /**
         * @param cps The maximum number of connections that can be created per second on the NLB instance. Valid values: `0` to `1000000`. `0` specifies that the number of connections is unlimited.
         * 
         * @return builder
         * 
         */
        public Builder cps(Integer cps) {
            return cps(Output.of(cps));
        }

        /**
         * @param endPort The last port in the listener port range. Valid values: `0` to `65535`. The number of the last port must be greater than the number of the first port.
         * 
         * &gt; **NOTE:**  This parameter is required when `ListenerPort` is set to `0`.
         * 
         * @return builder
         * 
         */
        public Builder endPort(@Nullable Output<Integer> endPort) {
            $.endPort = endPort;
            return this;
        }

        /**
         * @param endPort The last port in the listener port range. Valid values: `0` to `65535`. The number of the last port must be greater than the number of the first port.
         * 
         * &gt; **NOTE:**  This parameter is required when `ListenerPort` is set to `0`.
         * 
         * @return builder
         * 
         */
        public Builder endPort(Integer endPort) {
            return endPort(Output.of(endPort));
        }

        /**
         * @param idleTimeout The timeout period of idle connections. Unit: seconds. Valid values: `1` to `900`. Default value: `900`.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(@Nullable Output<Integer> idleTimeout) {
            $.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * @param idleTimeout The timeout period of idle connections. Unit: seconds. Valid values: `1` to `900`. Default value: `900`.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(Integer idleTimeout) {
            return idleTimeout(Output.of(idleTimeout));
        }

        /**
         * @param listenerDescription Enter a name for the listener.
         * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder listenerDescription(@Nullable Output<String> listenerDescription) {
            $.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * @param listenerDescription Enter a name for the listener.
         * The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs ({@literal @}), underscores (\_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder listenerDescription(String listenerDescription) {
            return listenerDescription(Output.of(listenerDescription));
        }

        /**
         * @param listenerPort The listener port. Valid values: `0` to `65535`.
         * If you set the value to `0`, the listener listens by port range. If you set the value to `0`, you must specify `StartPort` and `EndPort`.
         * 
         * @return builder
         * 
         */
        public Builder listenerPort(@Nullable Output<Integer> listenerPort) {
            $.listenerPort = listenerPort;
            return this;
        }

        /**
         * @param listenerPort The listener port. Valid values: `0` to `65535`.
         * If you set the value to `0`, the listener listens by port range. If you set the value to `0`, you must specify `StartPort` and `EndPort`.
         * 
         * @return builder
         * 
         */
        public Builder listenerPort(Integer listenerPort) {
            return listenerPort(Output.of(listenerPort));
        }

        /**
         * @param listenerProtocol The listening protocol. Valid values: `TCP`, `UDP`, and `TCPSSL`.
         * 
         * @return builder
         * 
         */
        public Builder listenerProtocol(@Nullable Output<String> listenerProtocol) {
            $.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * @param listenerProtocol The listening protocol. Valid values: `TCP`, `UDP`, and `TCPSSL`.
         * 
         * @return builder
         * 
         */
        public Builder listenerProtocol(String listenerProtocol) {
            return listenerProtocol(Output.of(listenerProtocol));
        }

        /**
         * @param loadBalancerId The ID of the Network Load Balancer (NLB) instance.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(@Nullable Output<String> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId The ID of the Network Load Balancer (NLB) instance.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        /**
         * @param mss The maximum size of a TCP segment. Unit: bytes. Valid values: `0` to `1500`. `0` specifies that the maximum segment size remains unchanged.
         * 
         * &gt; **NOTE:**  This parameter is supported only by TCP listeners and listeners that use SSL over TCP.
         * 
         * @return builder
         * 
         */
        public Builder mss(@Nullable Output<Integer> mss) {
            $.mss = mss;
            return this;
        }

        /**
         * @param mss The maximum size of a TCP segment. Unit: bytes. Valid values: `0` to `1500`. `0` specifies that the maximum segment size remains unchanged.
         * 
         * &gt; **NOTE:**  This parameter is supported only by TCP listeners and listeners that use SSL over TCP.
         * 
         * @return builder
         * 
         */
        public Builder mss(Integer mss) {
            return mss(Output.of(mss));
        }

        /**
         * @param proxyProtocolConfig The Proxy Protocol is used to carry the VpcId, PrivateLinkEpId, and PrivateLinkEpsId information to the backend server for configuration. See `proxy_protocol_config` below.
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocolConfig(@Nullable Output<ListenerProxyProtocolConfigArgs> proxyProtocolConfig) {
            $.proxyProtocolConfig = proxyProtocolConfig;
            return this;
        }

        /**
         * @param proxyProtocolConfig The Proxy Protocol is used to carry the VpcId, PrivateLinkEpId, and PrivateLinkEpsId information to the backend server for configuration. See `proxy_protocol_config` below.
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocolConfig(ListenerProxyProtocolConfigArgs proxyProtocolConfig) {
            return proxyProtocolConfig(Output.of(proxyProtocolConfig));
        }

        /**
         * @param proxyProtocolEnabled Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocolEnabled(@Nullable Output<Boolean> proxyProtocolEnabled) {
            $.proxyProtocolEnabled = proxyProtocolEnabled;
            return this;
        }

        /**
         * @param proxyProtocolEnabled Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocolEnabled(Boolean proxyProtocolEnabled) {
            return proxyProtocolEnabled(Output.of(proxyProtocolEnabled));
        }

        /**
         * @param regionId The ID of the region where the Network Load Balancer (NLB) instance is deployed.
         * You can call the [DescribeRegions](https://www.alibabacloud.com/help/en/doc-detail/443657.html) operation to query the most recent region list.
         * 
         * @return builder
         * 
         */
        public Builder regionId(@Nullable Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId The ID of the region where the Network Load Balancer (NLB) instance is deployed.
         * You can call the [DescribeRegions](https://www.alibabacloud.com/help/en/doc-detail/443657.html) operation to query the most recent region list.
         * 
         * @return builder
         * 
         */
        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        /**
         * @param secSensorEnabled Specifies whether to enable fine-grained monitoring. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder secSensorEnabled(@Nullable Output<Boolean> secSensorEnabled) {
            $.secSensorEnabled = secSensorEnabled;
            return this;
        }

        /**
         * @param secSensorEnabled Specifies whether to enable fine-grained monitoring. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder secSensorEnabled(Boolean secSensorEnabled) {
            return secSensorEnabled(Output.of(secSensorEnabled));
        }

        /**
         * @param securityPolicyId The security policy ID. System security policies and custom security policies are supported.
         * 
         * Valid values: `tls_cipher_policy\_1\_0` (default), `tls_cipher_policy\_1\_1`, `tls_cipher_policy\_1\_2`, `tls_cipher_policy\_1\_2\_strict`, and `tls_cipher_policy\_1\_2\_strict_with\_1\_3`.
         * 
         * &gt; **NOTE:**  This parameter takes effect only for listeners that use SSL over TCP.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(@Nullable Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * @param securityPolicyId The security policy ID. System security policies and custom security policies are supported.
         * 
         * Valid values: `tls_cipher_policy\_1\_0` (default), `tls_cipher_policy\_1\_1`, `tls_cipher_policy\_1\_2`, `tls_cipher_policy\_1\_2\_strict`, and `tls_cipher_policy\_1\_2\_strict_with\_1\_3`.
         * 
         * &gt; **NOTE:**  This parameter takes effect only for listeners that use SSL over TCP.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        /**
         * @param serverGroupId The ID of the server group.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupId(@Nullable Output<String> serverGroupId) {
            $.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * @param serverGroupId The ID of the server group.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupId(String serverGroupId) {
            return serverGroupId(Output.of(serverGroupId));
        }

        /**
         * @param startPort The first port in the listener port range. Valid values: `0` to `65535`.
         * 
         * &gt; **NOTE:**  This parameter is required when `ListenerPort` is set to `0`.
         * 
         * @return builder
         * 
         */
        public Builder startPort(@Nullable Output<Integer> startPort) {
            $.startPort = startPort;
            return this;
        }

        /**
         * @param startPort The first port in the listener port range. Valid values: `0` to `65535`.
         * 
         * &gt; **NOTE:**  This parameter is required when `ListenerPort` is set to `0`.
         * 
         * @return builder
         * 
         */
        public Builder startPort(Integer startPort) {
            return startPort(Output.of(startPort));
        }

        /**
         * @param status The status of the resource. Valid values: `Running`, `Stopped`. When you want to enable this instance, you can set the property value to `Running`;
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `Running`, `Stopped`. When you want to enable this instance, you can set the property value to `Running`;
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ListenerState build() {
            return $;
        }
    }

}
